#!/usr/bin/env bash
#
# Scrabble Score

function usage {
	echo 'Usage: '
}

function get_score_for_letter {
	local LETTER="${1^}"
	local SCORE=0

	# Iterate through score array
	for SCORE in ${!SCORES[@]} ; do
		if [[ ${SCORES[$SCORE]} =~ $LETTER ]] ; then
			break
		fi
	done

	echo $SCORE
}

if [[ ${1-notset} = "notset" ]] ; then
	usage
	exit 1
else
	WORD="$1"
fi

SCORES[1]="AEIOULNRST"
SCORES[2]="DG"
SCORES[3]="BCMP"
SCORES[4]="FHVWY"
SCORES[5]="K"
SCORES[8]="JX"
SCORES[10]="QZ"

# Iterate through letters in WORD, and add up the scores
WORD_SCORE=0
for (( i=0 ; i < ${#WORD} ; i++ )) ; do
	LETTER="${WORD:$i:1}"
	LETTER_SCORE=$(get_score_for_letter "$LETTER")
	(( WORD_SCORE += LETTER_SCORE ))
done

echo "$WORD_SCORE"
