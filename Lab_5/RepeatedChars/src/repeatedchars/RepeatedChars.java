package repeatedchars;
import java.util.Scanner;

public class RepeatedChars {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String givenString;
        int strLen = 0;
        boolean repeated = false;
        char nonRepChar = ' ';
        
        System.out.print("Enter a string: ");
        givenString = scn.nextLine();
        strLen = givenString.length();
        
        for (int i = 0; i < strLen; i++) {
            repeated = false;
            nonRepChar = givenString.charAt(i);
            for (int j = 0; j < strLen; j++) {
                if (i != j && nonRepChar == givenString.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            
            if (!repeated) {
                break;
            }
        }
        
        if (!repeated) {
            System.out.print("The first non-repeated character is: ");
            System.out.println("'" + nonRepChar + "'");
        }
        else {
            System.out.println("All characters are repeated");
        }
    }
}


