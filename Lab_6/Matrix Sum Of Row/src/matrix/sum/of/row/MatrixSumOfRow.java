package matrix.sum.of.row;
import java.util.Scanner;

public class MatrixSumOfRow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = 3, cols = 3;
        int[][] mat = new int[rows][cols];
        // Taking matrix from user
        System.out.print("Enter array elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.println("Given array:");
        for (int[] row: mat) {
            for (int val: row) {
                System.out.print("\t" + val);
            }
            System.out.println();
        }
        System.out.println("Sum of rows:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int val: mat[i]) {
                sum += val;
            }
            System.out.println("Sum of row " + (i+1) + ": " + sum);
        }
    }
}

