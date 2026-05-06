package symmetry.checker;
import java.util.Scanner;
public class SymmetryChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = 3, cols = 3;
        int[][] mat = new int[rows][cols];
        boolean isSymmetric = true;
        // Taking matrix from user
        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.println("Given matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" + mat[i][j]);
                
                if (mat[i][j] != mat[j][i]) {
                    isSymmetric = false;
                }
            }
            System.out.println();
        }
        if (isSymmetric) {
            System.out.println("Given matrix is symmetric");
        } else {
            System.out.println("Given matrix is not symmetric");
        }
    }
}

