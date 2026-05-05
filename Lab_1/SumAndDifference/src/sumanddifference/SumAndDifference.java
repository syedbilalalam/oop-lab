package sumanddifference;

import java.util.Scanner;

public class SumAndDifference {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, sum, diff;
        
        System.out.print("Enter value of a: ");
        a = scn.nextInt();
        
        System.out.print("Enter value of b: ");
        b = scn.nextInt();
        
        sum = a + b;
        diff = a - b;
        
        System.out.print("The sum of " + a + " and ");
        System.out.print(b + " is " + sum + "\n");
        
        System.out.print("The difference of " + a);
        System.out.print(" and " + b + " is " + diff + "\n");
        
    }
    
}



