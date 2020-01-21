#include "armstrong_numbers.h"

int is_armstrong_number(int candidate) {
	int digits = 0;
	int sum    = 0;
	int num_digits = 0;

	digits = candidate;
	while ( digits != 0 ) {
		num_digits += 1;
		digits /= 10;
	}

	digits = candidate;
	while ( digits != 0 ) {
		// need to add power of num_digits to sum calc
		sum += (digits % 10);
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
