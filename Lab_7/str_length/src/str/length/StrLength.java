package str.length;
import java.util.Scanner;

public class StrLength {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String phoneNo;
        
        System.out.print("Enter a phone no: ");
        phoneNo = scn.nextLine();
        
        // Using length method to analyze correct format of phone no.
        if (phoneNo.length() == 11) {
            System.out.print("The provided phone no is");
            System.out.println(" in local format of PAK.");
        }
        else if (phoneNo.length() >= 12 && phoneNo.length() <= 13) {
            System.out.println("Phone no is in standard format.");
        }
        else {
            System.out.println("Unsupported format.");
        }
    }
    
}

