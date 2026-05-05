package charactersearch;
import java.util.Scanner;

public class CharacterSearch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String givenStr;
        char targetChar;
        boolean found = false;
        int foundIndex = -1;
        
        System.out.print("Enter the string: ");
        givenStr = scn.nextLine();
        System.out.print("Enter target character: ");
        targetChar = scn.next().charAt(0);
        
        for (int i = 0; i < givenStr.length(); i++) {
            if (givenStr.charAt(i) == targetChar) {
                found = true;
                foundIndex = i;
                break;
            }
        }
        
        if (found) {
            System.out.print("Character '" + targetChar + "' ");
            System.out.println("found at index: " + foundIndex);
        }
        else {
            System.out.print("Character '" + targetChar + "' ");
            System.out.println("not found");
        }
    }
    
}


