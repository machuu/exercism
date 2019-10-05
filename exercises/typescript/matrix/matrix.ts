class Matrix {

  public rows:    number[][]
  public columns: number[][]

  constructor( matrix_string: string ) {

    // Iterate over string split on new lines
    this.rows = [];
    for ( let string_array_row of matrix_string.split("\n") ) {
      // Add row to 2D rows array
      //   - Split row string into an Array,
      //   - Map String Array -> Number Array
      //   - Push Number Array onto rows[n]
      this.rows.push( string_array_row.split(" ").map( (str_number: string): number => Number(str_number) ) );
    }
    this.transpose_rows_into_columns();
  }

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
