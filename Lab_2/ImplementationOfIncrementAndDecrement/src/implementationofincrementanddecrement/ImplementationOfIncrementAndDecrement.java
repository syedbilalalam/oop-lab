package implementationofincrementanddecrement;

import java.util.Scanner;

public class ImplementationOfIncrementAndDecrement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 0;
        
        i++;
        System.out.print("Enter marks for subject " + i + ": ");
        scn.nextInt();
        
        i++;
        System.out.print("Enter marks for subject " + i + ": ");
        scn.nextInt();
        
        i--;
        System.out.println("One subject dropped, total subject left is " + i);
        
        i--;
        System.out.println("One subject dropped, total subject left is " + i);
        
        System.out.println("The final value of i is " + i);
    }
    
}


