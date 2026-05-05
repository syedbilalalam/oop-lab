package areacalculator;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int userChoice;
        // Display Menu
        System.out.println("====================");
        System.out.println("1: Circle");
        System.out.println("2: Rectangle");
        System.out.println("3: Triangle");
        System.out.println("====================");
        System.out.print("Select a shape to find its area: ");
        userChoice = scn.nextInt();

        // Switch structure
        switch (userChoice) {
            case 1:
                double r,
                 result;
                System.out.print("Enter radius of the circle: ");
                r = scn.nextDouble();
                result = Math.PI * Math.pow(r, 2);
                System.out.print("Area of Circle: ");
                System.out.println(result + " unit square.");
                break;

            case 2:
                double w,
                 l;
                System.out.print("Enter length and width: ");
                w = scn.nextDouble();
                l = scn.nextDouble();
                result = l * w;
                System.out.print("Area of Rectangle: ");
                System.out.println(result + " unit square.");
                break;

            case 3:
                double height,
                 base;
                System.out.print("Enter height and base: ");
                height = scn.nextDouble();
                base = scn.nextDouble();
                result = height * base * (1.0 / 2);
                System.out.print("Area of Triangle: ");
                System.out.println(result + " unit square.");
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

}



