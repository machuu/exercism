#!/usr/bin/env bash
#
# Reverse String

STRING="${1}"
REVERSE_STRING=""

while read -n 1 ; do
	CHAR="$REPLY"
	REVERSE_STRING="$REPLY$REVERSE_STRING"
done <<< "$STRING"

echo "$REVERSE_STRING"
