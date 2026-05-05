package septhreedigitnumber;

import java.util.Scanner;

public class SepThreeDigitNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, d1, d2, d3, sum;
        
        System.out.print("Enter 3 digit number: ");
        num = scn.nextInt();
        
        d1 = num / 100;
        num = num % 100;
        
        d2 = num / 10;
        num = num % 10;
        
        d3 = num;
        
        sum = d1 + d2 + d3;
        
        System.out.print(d1 + " + " + d2 + " + " + d3);
        System.out.print(" = " + sum + "\n");
        
    }
    
}

