#!/usr/bin/env bash
#
# Hamming

function usage {
	echo 'Usage: hamming.sh <string1> <string2>'
}

# Loop while there are still positional arguments, and
# shift at the end of each loop
while (( $# )) ; do
	# Check positional argument 1
	if   [[ ${STRAND1-notset} = "notset" ]] ; then
		STRAND1="$1"
	elif [[ ${STRAND2-notset} = "notset" ]] ; then
		STRAND2="$1"
	else
		# Too many arguments
		usage
		exit 1
	fi

	# Shift positional arguments by 1
	# drop $1, $2 -> $1, $3 -> $2, etc
	shift 1
done

# Check that both strands are set
if [[ "${STRAND1-notset}${STRAND2-notset}" =~ "notset" ]] ; then
	usage
	exit 1
elif [[ "${STRAND1}${STRAND2}" = "" ]] ; then
	echo 0
	exit 0
elif [[ ${#STRAND1} -ne ${#STRAND2} ]] ; then
	echo 'left and right strands must be of equal length'
	exit 1
fi

# Iterate through each character of the string, and compare
LENGTH=${#STRAND1}
DISTANCE=0

for (( i=0 ; i < LENGTH ; i++ )) ; do
	if [[ ${STRAND1:$i:1} != ${STRAND2:$i:1} ]] ; then
		(( DISTANCE++ ))
	fi
done

echo "$DISTANCE"
exit 0
