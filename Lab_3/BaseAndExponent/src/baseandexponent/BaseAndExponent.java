package baseandexponent;

import java.util.Scanner;

public class BaseAndExponent {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base, exponent;
        double result;

        System.out.print("Enter base: ");
        base = scn.nextInt();
        System.out.print("Enter exponent: ");
        exponent = scn.nextInt();
        
        result = Math.pow(base, exponent);
        
        System.out.print(base + " raised to the power ");
        System.out.println(exponent + " is " + result);
    }
    
}



