package diamondusingwhile;

public class DiamondUsingWhile {

    public static void main(String[] args) {
        
        int size = 5, i = 1;
        while (i <= size) {
            int j = size - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        i = size - 1;
        while (i > 0) {
            int j = size - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
    
}


