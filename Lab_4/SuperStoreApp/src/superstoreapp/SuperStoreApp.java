package superstoreapp;

import java.util.Scanner;

public class SuperStoreApp {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double electronics = 0, groceries = 0, clothing = 0, total;
        int userInput;
        boolean running = true;
        while (running) {
            // Display Menu
            System.out.println("====================");
            System.out.println("1: Electronics");
            System.out.println("2: Groceries");
            System.out.println("3: Clothing");
            System.out.println("====================");
            System.out.println("4: Checkout");
            System.out.println("====================");
            System.out.print("Enter your choice: ");
            userInput = scn.nextInt();
            
            // Switch structure
            switch (userInput){
                case 1:
                    System.out.print("Enter amount spent: ");
                    electronics += scn.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter amount spent: ");
                    groceries += scn.nextDouble();
                    break;
                    
                case 3:
                    System.out.print("Enter amount spent: ");
                    clothing += scn.nextDouble();
                    break;
                    
                case 4:
                    total = electronics + groceries + clothing;
                    System.out.println("=======Final Amount=======");
                    System.out.println("Electronics: " + electronics + "PKR");
                    System.out.println("Groceries:   " + groceries + "PKR");
                    System.out.println("Clothing:    " + clothing + "PKR");
                    System.out.println("Total:       " + total + "PKR");
                    System.out.println("==========================");
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }
    
}



