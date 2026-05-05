package basiccalculator;

import java.util.Scanner;

public class BasicCalculator {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a, b;
        char op;
        double ans;
        
        System.out.print("Enter two numbers: ");
        a = scn.nextInt();
        b = scn.nextInt();
        
        System.out.print("Choose operation: ");
        op = scn.next().charAt(0);
        
        ans = op == '+' ? a + b : op == '-' ? a - b
                : op == '*' ? a * b : op == '/' ? a / b
                : op == 'e' ? Math.pow(a, b) : 0;
        
        System.out.println(a + " " + op + " " + b + " = " + ans);
        
    }
    
}


