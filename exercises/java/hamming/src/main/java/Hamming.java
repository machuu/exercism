class Hamming {

	private String leftStrand;
	private String rightStrand;

	private int strandLength;
	private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;

		if ( leftStrand.length() == rightStrand.length() ) {
			this.strandLength = leftStrand.length();
		} else {
			if ( leftStrand.isEmpty() ) {
        		throw new IllegalArgumentException("left strand must not be empty.");
			} else if ( rightStrand.isEmpty() ) {
        		throw new IllegalArgumentException("right strand must not be empty.");
			} else {
				throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
			}
		}

		calcHammingDistance();
    }

    void calcHammingDistance() {

		hammingDistance = 0;

		// Test character by character and count mismatches
		for ( int i = 0; i < strandLength; i++ ) {
			char leftChar  = leftStrand.charAt(i);
			char rightChar = rightStrand.charAt(i);

			if ( leftChar != rightChar ) {
				hammingDistance++;
			}
		}
    }

	int getHammingDistance() {
		return hammingDistance;
	}

}
