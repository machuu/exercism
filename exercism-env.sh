#!/usr/bin/env bash
#
# Source exercism env

THIS_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &>/dev/null && pwd )"
THIS_SCRIPT_NAME=""

if [[ $0 = ${BASH_SOURCE[0]} ]] ; then
	echo "This script needs to be sourced"
	echo
	echo "Run one of the following commands"
	echo "\$> . $0"
	echo "\$> source $0"

	exit 1
else

	if ${SOURCED_EXERCISM-false} && ! [[ $* =~ force ]] ; then
		echo "$0 is already sourced"
	else
		export SOURCED_EXERCISM=true
	fi

	# It appears the exercism is unsetting EXERCISM_ environment variables
	# prepend variable name to circumvent this
	export ENV_EXERCISM_DIR="$THIS_SCRIPT_DIR"
	export ENV_EXERCISM_BIN_DIR="$ENV_EXERCISM_DIR/bin"
	export ENV_EXERCISM_BIN_PATH="$ENV_EXERCISM_BIN_DIR/exercism"
	export ENV_EXERCISM_EXERCISES_DIR="$ENV_EXERCISM_DIR/exercises"

	if [[ $PATH =~ "$ENV_EXERCISM_BIN_DIR" ]] ; then
		# Exercism bin/ directory is already in the PATH
		true
	else
		PATH+=:$ENV_EXERCISM_BIN_DIR
	fi

	if [[ -x "$ENV_EXERCISM_BIN_PATH" ]] ; then
		chmod +x "$ENV_EXERCISM_BIN_PATH"
	elif [[ ! -f "$ENV_EXERCISM_BIN_PATH" ]] ; then
		echo "couldn't find '$ENV_EXERCISM_BIN_PATH'" >&2
	fi

	ENV_EXERCISM_BASH_COMPLETION="$ENV_EXERCISM_DIR/shell/exercism_completion.bash"

	if [[ -f "$ENV_EXERCISM_BASH_COMPLETION" ]] ; then
		source "$ENV_EXERCISM_BASH_COMPLETION"
	else
		echo "couldn't find '$ENV_EXERCISM_BASH_COMPLETION'" >&2
	fi


	# If tmuxp is installed, and current shell is not already attached to tmux
	# then load tmux profile
	# otherwise, just cd to exercises/ dir
	if [[ $(which tmuxp) != "" ]] && [[ ${TMUX-} = "" ]] ; then
		# Load tmuxp session
		cd "$ENV_EXERCISM_DIR" &>/dev/null
		tmuxp load .
	else
		cd "$ENV_EXERCISM_EXERCISES_DIR" &>/dev/null
	fi
fi
