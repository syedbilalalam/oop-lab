package oddnumbers;

public class OddNumbers {

    public static void main(String[] args) {
        
        int i = 1;
        
        System.out.println("Using while loop:");
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
        
        System.out.println("\nUsing do while loop:");
        i = 1;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 100);
        
        System.out.println("\nUsing do for loop:");
        for (int j = 1; j <= 100; j += 2) {
            System.out.print(j + " ");
            i += 2;
        }
        System.out.println();
    }
    
}


