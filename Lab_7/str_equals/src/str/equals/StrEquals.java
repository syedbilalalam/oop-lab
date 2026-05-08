package str.equals;
import java.util.Scanner;
public class StrEquals {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String user = "bilal", pass = "hello world";
        String userInput, passInput;
        
        System.out.print("Enter username: ");
        userInput = scn.nextLine();
        System.out.print("Enter password: ");
        passInput = scn.nextLine();
        
        if (user.equals(userInput)) {
            if (pass.equals(passInput)) {
                System.out.println("Login success!");
            }
            else {
                System.out.println("Incorrect password!");
            }
        }
        else {
            System.out.println("User does not exists!");
        }
    }
    
}


