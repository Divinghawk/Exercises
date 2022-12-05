package task993_ArrayList_SearchMatrix;

class Matrix {

	
    private final int[][] matrix;
    
    Matrix(String matrixAsString) {
        //String[] rows = matrixAsString.split(System.lineSeparator());
        String[] rows = matrixAsString.split("\n");
        matrix = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] cols = rows[i].split(" ");
            matrix[i] = new int[cols.length];
            for (int j = 0; j < cols.length; j++) {
                matrix[i][j] = Integer.parseInt(cols[j].trim());
            }
        }
    }
    
    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }
    
    int[] getColumn(int columnNumber) {
        int rowsInMatrix = matrix.length;
        int[] column = new int[rowsInMatrix];
        for (int i = 0; i < rowsInMatrix; i++) {
            column[i] = matrix[i][columnNumber - 1];
        }
        return column;
    }
}
