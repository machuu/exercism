#include "armstrong_numbers.h"

int is_armstrong_number(int candidate) {
	int digits = candidate;
	int sum    = 0;
	int num_digits = 0;

	while ( digits != 0 ) {
		// need to get length of candidate for exponent
		sum += digits % 10;
		digits /= 10;
	}

	if ( sum == candidate ) {
		// Return true
		return 1;
	} else {
		// Return false
		return 0;
	}
}
