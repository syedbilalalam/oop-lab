package matrix.transpose;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = 2, cols = 3;
        int[][] mat = new int[rows][cols];
        
        // Taking matrix from user
        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        
        System.out.println("Before transpose:");
        for (int[] row: mat) {
            for (int val: row) {
                System.out.print("\t" + val);
            }
            System.out.println();
        }
        System.out.println("After transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("\t" + mat[j][i]);
            }
            System.out.println();
        }
    }
}

