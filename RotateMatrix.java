package examplesPrograms;
import java.util.*;
public class RotateMatrix {
	  public static void main(String[] args) {
	    int[][] matrix = {
	      {1, 2, 3},
	      {4, 5, 6},
	      {7, 8, 9}
	    };

	    rotate(matrix);

	    // Print the rotated matrix
	    for (int i = 0; i < matrix.length; i++) {
	      for (int j = 0; j < matrix[i].length; j++) {
	        System.out.print(matrix[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }

	  public static void rotate(int[][] matrix) {
		  int n = matrix.length;
		  int[][] A = matrix;

	    // Transpose
		  for (int i = 0; i < n; i++) {
			  for (int j = i + 1; j < n; j++) {
				  int temp = A[i][j];
				  A[i][j] = A[j][i];
				  A[j][i] = temp;
			  }
		  }

	    // Reflection
		  for (int i = 0; i < n; i++) {
			  for (int j = 0; j < n / 2; j++) {
				  int temp = A[i][j];
				  A[i][j] = A[i][n - j - 1];
				  A[i][n - j - 1] = temp;
			  }
		  }
	  }
}
