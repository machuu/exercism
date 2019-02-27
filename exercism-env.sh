#!/usr/bin/env bash
#
# Source exercism env

THIS_SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
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

	EXERCISM_BIN_DIR="$THIS_SCRIPT_DIR/bin"
	EXERCISM_BIN_PATH="$EXERCISM_BIN_DIR/exercism"

	if [[ $PATH =~ "$EXERCISM_BIN_DIR" ]] ; then
		# Exercism bin/ directory is already in the PATH
		true
	else
		PATH+=:$EXERCISM_BIN_DIR
	fi

	if [[ -x "$EXERCISM_BIN_PATH" ]] ; then
		chmod +x "$EXERCISM_BIN_PATH"
	elif [[ ! -f "$EXERCISM_BIN_PATH" ]] ; then
		echo "couldn't find '$EXERCISM_BIN_PATH'" >&2
	fi

	EXERCISM_BASH_COMPLETION="$THIS_SCRIPT_DIR/shell/exercism_completion.bash"

	if [[ -f "$EXERCISM_BASH_COMPLETION" ]] ; then
		source "$EXERCISM_BASH_COMPLETION"
	else
		echo "couldn't find '$EXERCISM_BASH_COMPLETION'" >&2
	fi

fi
