package task993_ArrayList_SearchMatrix;

public class test {

	public static String tilStreng(int[][] matrise) {
	    StringBuilder builder = new StringBuilder();
	    for (int i = 0; i < matrise.length; i++) {
	        for (int j = 0 ; j < matrise[i].length ; j++) {
	            builder.append(matrise[i][j]).append(" ");
	        }
	        builder.append("\n");
	    }
	    return builder.toString();
	}

	public static void main(String... args) {
	    int[][] matrise = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	    String representation = tilStreng(matrise);
	    System.out.println(representation);
	}
	
}
