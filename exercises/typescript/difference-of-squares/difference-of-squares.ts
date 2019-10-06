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
    return 1;
  }

  private calcSumOfSquares(): number {
    return 1;
  }

  private calcDifferenceOfSquares(): number {
    return 1;
  }
}

export default Squares
