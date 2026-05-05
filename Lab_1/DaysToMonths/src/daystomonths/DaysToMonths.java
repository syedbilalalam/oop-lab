package daystomonths;

import java.util.Scanner;

public class DaysToMonths {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inputDays, outputDays, outputMonths;
        
        System.out.print("Input the number of days: ");
        inputDays = scn.nextInt();
        
        outputMonths = inputDays / 30;
        outputDays = inputDays % 30;
        
        System.out.print(inputDays + " days are " + outputMonths);
        System.out.println(" months and " + outputDays + " days.");
    }
    
}


