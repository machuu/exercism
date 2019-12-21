class DifferenceOfSquaresCalculator {

    private int computeSumTo(int input) {
        return (input * ( input + 1))/2;
    }

    private int computeSquareOf(int input) {
        return input * input;
    }

    int computeSquareOfSumTo(int input) {
        return computeSquareOf( computeSumTo(input) );
    }

    int computeSumOfSquaresTo(int input) {
        return ( input * ( input + 1 ) * ( 2 * input + 1 ) )/6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
