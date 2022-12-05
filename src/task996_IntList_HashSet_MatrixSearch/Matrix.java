package task996_IntList_HashSet_MatrixSearch;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Matrix {
	
	private final List<List<Integer>> matrix;
	
    Matrix(List<List<Integer>> values) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");   	
    	matrix = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	Set<MatrixCoordinate> coordinates = new HashSet<>();
        for (int rowNum = 0, rowEnd = matrix.size(); rowNum < rowEnd; rowNum++) {
            for (int colNum = 0, colEnd = matrix.get(0).size(); colNum < colEnd; colNum++) {
                int value = matrix.get(rowNum).get(colNum);
                if (Collections.max(getRow(rowNum)) == value &&
                        Collections.min(getColumn(colNum)) == value) {
                    coordinates.add(new MatrixCoordinate(rowNum + 1, colNum + 1));
                }
            }
        }
        return coordinates;
        
    }
	
    private final List<Integer> getRow(int row) {
        return matrix.get(row);
    }
    
    private final List<Integer> getColumn(int column) {
        return matrix.stream().map(row -> row.get(column)).collect(Collectors.toList());
    }
}
