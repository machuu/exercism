class DifferenceOfSquaresCalculator {

    private int computeSumTo(int input) {
        int sum = 0;
        for ( int i = 1 ; i <= input ; i++ ) {
            sum += i;
        }
        return sum;
    }

    private int computeSquareOf(int input) {
        return input * input;
    }

    int computeSquareOfSumTo(int input) {
        return computeSquareOf( computeSumTo(input) );
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for ( int i = 1 ; i <= input ; i++ ) {
            sum += computeSquareOf(i);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
