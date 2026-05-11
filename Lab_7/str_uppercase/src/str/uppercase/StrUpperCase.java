package str.uppercase;
import java.util.Scanner;

public class StrUpperCase {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String strInput;
        String capitalizedStr;
        
        System.out.print("Enter a string: ");
        strInput = scn.nextLine();
        
        // Capitalizing string using toUpperCase method.
        capitalizedStr = strInput.toUpperCase();
        
        System.out.println("After capitalization:");
        System.out.println(capitalizedStr);
    }
    
}

