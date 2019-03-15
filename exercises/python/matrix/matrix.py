class Matrix(object):
    def __init__(self, matrix_string):

        self.matrix = []

        # convert rows to 2D list
        matrix_rows = matrix_string.split('\n')
        for matrix_row in matrix_rows:
            # split matrix_row into a list of integers
            matrix_row_list = list(map( int, matrix_row.split(' ') ))

            # Add matrix_row_list as a nested list in matrix
            self.matrix.append(matrix_row_list)


    def row(self, index):
        return self.matrix[index - 1]

    def column(self, index):
        return [matrix_row[index - 1] for matrix_row in self.matrix[:]]

