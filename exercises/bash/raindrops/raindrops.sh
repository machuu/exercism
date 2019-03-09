#!/usr/bin/env bash
#
# Raindrops

function is_this_a_factor_of {
	local FACTOR="${1-}"
	local NUMBER="${2-}"
	
	if [[ "$FACTOR" = "" ]] || [[ "$NUMBER" = "" ]] ; then
		return 1
	fi

	MODULUS=$(( NUMBER % FACTOR ))

	# in Bash
	#  0 is true
	# >0 is false
	# if MODULUS is 0, then FACTOR is a factor of NUMBER and returns "true"
	# if MODULUS is not 0, then this returns "false"
	return $MODULUS
}

# Check that argument is an integer
INTEGER_REGEX="^[0-9]+$"
if [[ $1 =~ $INTEGER_REGEX ]] ; then
	NUMBER=$1
else
	echo "$1 is not a positive integer" >&2
	exit 0
fi

declare -A DROPS
DROPSOUND[3]="Pling"
DROPSOUND[5]="Plang"
DROPSOUND[7]="Plong"

# Iterate through each FACTOR. If one matches, set flag FACTORED=true
FACTORED=false
for FACTOR in 3 5 7 ; do
	if is_this_a_factor_of $FACTOR $NUMBER ; then
		echo -n "${DROPSOUND[$FACTOR]}"
		FACTORED=true
	fi
done

# If not factored, then print NUMBER
! $FACTORED && echo "$NUMBER"

exit 0
