package gradingsystem;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks;
        final double TOTAL_MARKS = 500.0;
        double per;

        System.out.print("Enter marks (out of 500): ");
        marks = scn.nextInt();
        
        per = (marks / TOTAL_MARKS) * 100;

        System.out.println("You achieved:");
        System.out.print("Grade: ");
        if (per > 80)
            System.out.println("A");
        else if (per >= 60 && per <= 80)
            System.out.println("B");
        else if (per >= 50 && per < 60)
            System.out.println("C");
        else if (per >= 45 && per < 50)
            System.out.println("D");
        else if (per >= 25 && per < 45)
            System.out.println("E");
        else
            System.out.println("F");
    }
    
}


