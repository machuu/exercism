#!/usr/bin/env bash
#
# Error Handling

function usage {
	echo "Usage: ./error_handling <greetee>"
}

case $# in
	0 )
		usage
		exit 1
		;;
	1 )
		NAME="$1"
		;;
	* )
		usage
		exit $#
esac

echo "Hello, $NAME"
exit 0
