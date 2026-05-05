package bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double massInPounds, massInKg;
        double heightInMeters, heightInInches;
        double BMI;
        
        System.out.print("Enter weight in pounds: ");
        massInPounds = scn.nextDouble();
        
        System.out.print("Enter height in inches: ");
        heightInInches = scn.nextDouble();
        
        massInKg = massInPounds * 0.45359237;
        heightInMeters = heightInInches * 0.0254;
        BMI = massInKg / Math.pow(heightInMeters, 2);
        
        System.out.print("For weigh of " + massInPounds + " Pounds ");
        System.out.print("and " + heightInInches + " Inches height, ");
        System.out.println("the BMI will be " + BMI);
    }

}

