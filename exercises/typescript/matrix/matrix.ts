class Matrix {

  public rows:    number[][] = [];
  public columns: number[][] = [];

  constructor( matrix_string: string ) {

    // Iterate over string split on new lines
    for ( let string_array_row of matrix_string.split("\n") ) {
      // Add row to 2D rows array
      //   - Split row string into an Array,
      //   - Map String Array -> Number Array
      //   - Push Number Array onto rows[n]
      this.rows.push( string_array_row.split(" ").map( (str_number: string): number => Number(str_number) ) );
    }
  }
}

export default Matrix
