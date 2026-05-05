package calsiustofahrenheit;

import java.util.Scanner;

public class CalsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double celsius, fahrenheit;
        
        System.out.print("Enter temperature in Celsius: ");
        celsius = scn.nextDouble();
        
        fahrenheit = celsius * (9.0/5) + 32;

        System.out.print(celsius + " Degree Celsius is ");
        System.out.println(fahrenheit + " Degree Fahrenheit");
    }
    
}

