package greaternumber;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter first number: ");
        a = scn.nextInt();
        System.out.print("Enter second number: ");
        b = scn.nextInt();
        System.out.print("Enter third number: ");
        c = scn.nextInt();
        
        if (a > b && a > c)
            System.out.println("First number " + a + "is greater");
        else if (b > c)
            System.out.println("Second number " + b + "is greater");
        else
            System.out.println("Third number " + c + " is greater");
    }
    
}
