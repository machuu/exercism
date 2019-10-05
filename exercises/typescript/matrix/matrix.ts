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

    // Transpose rows -> columns with maps
    this.columns = this.rows[0]
      .map( (_, col_index: number): number[] =>
        this.rows.map( (row: number[]): number =>
          row[col_index]
        )
      );
  }
}

export default Matrix
