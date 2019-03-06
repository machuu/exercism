#!/usr/bin/env bash
#
# Leap Year?

YEAR="${1-}"

usage() {
	echo 'Usage: leap.sh <year>'
}

if [[ $# != 1 ]] ; then
	#echo "single argument, integer <year>, is required"
	usage
	exit 1
elif [[ $YEAR = "" ]] ; then
	#echo "<year> is blank" >&2
	usage
	exit 1
elif [[ $YEAR =~ [^0-9] ]] ; then
	#echo "<year> '$YEAR' can only contain numbers [0-9]" >&2
	usage
	exit 1
fi

[[ $(( YEAR % 4   )) = 0 ]] && BY_4=true   || BY_4=false
[[ $(( YEAR % 100 )) = 0 ]] && BY_100=true || BY_100=false
[[ $(( YEAR % 400 )) = 0 ]] && BY_400=true || BY_400=false

if $BY_400 ; then
	IS_LEAP=true
elif $BY_4 && ! $BY_100 ; then
	IS_LEAP=true
else
	IS_LEAP=false
fi

echo "$IS_LEAP"
