class Squares {

  private numberUpTo: number;
  public squareOfSum: number;
  public sumOfSquares: number;
  public difference: number;

  constructor(numberUpTo: number) {
    this.numberUpTo = numberUpTo;
    this.squareOfSum = this.calcSquareOfSum();
    this.sumOfSquares = this.calcSumOfSquares();
    this.difference = this.calcDifferenceOfSquares();
  }

  private calcSquareOfSum(): number {
    // Only calculate if value is null or undefined
    // Otherwise, just return current value
    if ( this.squareOfSum == null ) {
      var sum: number = 0;
      for ( var num: number = 1 ; num <= this.numberUpTo ; num++ ) {
        sum += num;
      }
      return Math.pow(sum, 2);
    }

    return this.squareOfSum;
  }

  private calcSumOfSquares(): number {
    // Only calculate if value is null or undefined
    // Otherwise, just return current value
    if ( this.sumOfSquares == null ) {
      var sum: number = 0;
      for ( var num: number = 1 ; num <= this.numberUpTo ; num++ ) {
        sum += Math.pow(num, 2);
      }
      return sum;
    }

    return this.sumOfSquares;

  }

  private calcDifferenceOfSquares(): number {
    return 1;
  }
}

export default Squares
