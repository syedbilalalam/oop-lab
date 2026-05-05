package sortarray;
import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] numArr = new int[]{3, 6, 10, 7, 9, 8, 1, 4, 2, 5};
        String[] strArr = new String[]{"ball", "bat", "light", "table", "pen"};
        
        Arrays.sort(numArr);
        Arrays.sort(strArr);

        // Print sorted int array
        System.out.print("Sorted Numbers : ");
        for (int n : numArr) {
            System.out.print(n + ", ");
        }
        System.out.println("\b\b  ");

        // Print sorted string array
        System.out.print("Sorted Strings : ");
        for (String s : strArr) {
            System.out.print(s + ", ");
        }
        System.out.println("\b\b  ");
        
    }
}

