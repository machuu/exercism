class Squares {

  private numberUpTo:  number;
  public squareOfSum:  number;
  public sumOfSquares: number;
  public difference:   number;

  constructor(numberUpTo: number) {
    this.numberUpTo   = numberUpTo;
    this.squareOfSum  = this.calcSquareOfSum();
    this.sumOfSquares = this.calcSumOfSquares();
    this.difference   = this.calcDifferenceOfSquares();
  }

  // Calculate sum of numberUpTo, with optional exponent
  private calcSumUpTo( power: number = 1 ): number {
    var sum: number = 0;
    for ( var num: number = 1 ; num <= this.numberUpTo ; num++ ) {
      sum += Math.pow(num, power);
    }
    return sum;
  }

  private calcSquareOfSum(): number {
    // Only calculate if value is null or undefined
    // Otherwise, just return current value
    if ( this.squareOfSum == null ) {
      return Math.pow(this.calcSumUpTo(), 2);
    }

    return this.squareOfSum;
  }

  private calcSumOfSquares(): number {
    // Only calculate if value is null or undefined
    // Otherwise, just return current value
    if ( this.sumOfSquares == null ) {
      return this.calcSumUpTo(2);
    }

    return this.sumOfSquares;

  }

  private calcDifferenceOfSquares(): number {
    if ( this.difference == null ) {
      return this.squareOfSum - this.sumOfSquares;
    }

    return this.difference;
  }
}

export default Squares
