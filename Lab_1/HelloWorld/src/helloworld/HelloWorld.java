package helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double inches, meters;
        
        System.out.print("Input a value for inch: ");
        inches = scn.nextDouble();
        
        meters = inches * 0.0254;
        
        System.out.println(inches + " inch is " + meters + " meters.");
    }
}



