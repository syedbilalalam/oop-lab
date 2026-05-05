package calculatorwithswitch;

import java.util.Scanner;

public class CalculatorWithSwitch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char userInput;
        boolean running = true;
        while (running) {
            // Display Menu
            System.out.println("====================");
            System.out.println("a: Add two numbers");
            System.out.println("b: Find power using math function");
            System.out.println("c: Exit");
            System.out.println("====================");
            System.out.print("Enter your choice: ");
            userInput = scn.next().charAt(0);
            
            // Switch structure
            switch (userInput){
                case 'a':
                case 'A':
                    int x, y, sum;
                    System.out.print("Enter two numbers: ");
                    x = scn.nextInt();
                    y = scn.nextInt();
                    sum = x + y;
                    System.out.print("The sum of " + x);
                    System.out.println(" and " + y + " is " + sum);
                    break;

                case 'b':
                case 'B':
                    int base, power;
                    double result;
                    System.out.print("Enter base and power: ");
                    base = scn.nextInt();
                    power = scn.nextInt();
                    result = Math.pow(base, power);
                    System.out.print(base + " raised to the power ");
                    System.out.println(power + " is " + result);
                    break;
                    
                case 'c':
                case 'C':
                    System.out.println("Closing the app...");
                    running = false;
                    break;
                
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }
    
}

