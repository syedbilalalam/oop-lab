package str.buffer;
import java.util.Scanner;
public class StrBuffer {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuffer strBuf = new StringBuffer();
        String firstInput, secondInput;
        
        System.out.print("Enter first string: ");
        firstInput = scn.nextLine();
        System.out.print("Enter second string: ");
        secondInput = scn.nextLine();
        
        // Concatenating strings on the StringBuffer
        strBuf.append(firstInput);
        strBuf.append(" ");
        strBuf.append(secondInput);
        
        // Reversing the concatenated string
        strBuf.reverse();
        
        // Final output
        System.out.println("Final Output: ");
        System.out.println(strBuf.toString());
    }
    
}


