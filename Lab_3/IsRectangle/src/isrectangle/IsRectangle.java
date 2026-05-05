package isrectangle;

import java.util.Scanner;

public class IsRectangle {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double length, breadth;
        
        System.out.print("Enter length: ");
        length = scn.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scn.nextDouble();
        
        if (length == breadth)
            System.out.println("This is a square!");
        else
            System.out.println("This is not a square!");
    }
    
}

