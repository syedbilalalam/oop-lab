package reversearray;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
        int[] revArr = new int[6];
        int arrIndex = 0;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[arrIndex++] = arr[i];
        }
        
        // Printing original array
        System.out.println("Original array: ");
        for (int value: arr) {
            System.out.print(value + ", ");
        }
        System.out.println("\b\b  ");
        
        // Printing reversed array
        System.out.println("Reversed array: ");
        for (int value: revArr) {
            System.out.print(value + ", ");
        }
        System.out.println("\b\b  ");
    }
}

