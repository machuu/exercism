class Matrix {

  public rows:    number[][]
  public columns: number[][]

  constructor( matrix_string: string ) {

    // Populate rows 2D array
    this.rows = matrix_string
      .split("\n")
      .map( (row_string: string) =>
        row_string
        .split(" ")
        .map( (number_as_string: string): number =>
          Number(number_as_string)
        )
      );

    // double loop to populate columns array
    this.columns = [];
    // This should work for rectangular matrices.
    // iterate over column numbers in first row of array
    for ( var col_index: number = 0; col_index < this.rows[0].length ; col_index++ ) {
      // iterate over row numbers in array
      this.columns[col_index] = [];
      for ( var row_index: number = 0; row_index < this.rows.length ; row_index++ ) {
        // switch col_index <-> row_index between rows[][] and columns[][]
        this.columns[col_index][row_index] = this.rows[row_index][col_index];
      }
    }
  }
}

export default Matrix
