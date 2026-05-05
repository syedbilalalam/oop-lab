package ifelseifladder;

import java.util.Scanner;

public class IfElseIfLadder {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double temperature;

        System.out.print("Enter temperature (Celsius): ");
        temperature = scn.nextInt();
        
        if (temperature <= 0) {
            System.out.println("It's freezing cold!");
        }
        else if (temperature <= 15) {
            System.out.println("It's cold, wear a jacket.");
        }
        else if (temperature <= 25) {
            System.out.println("It's pleasant outside.");
        }
        else if (temperature <= 35) {
            System.out.println("It's warm, stay hydrated.");
        }
        else {
            System.out.println("It's very hot, avoid going out!");
        }
    }
    
}

