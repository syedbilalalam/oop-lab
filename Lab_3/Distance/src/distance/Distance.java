package distance;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1, y1, x2, y2;
        double d;
        
        System.out.print("Enter Point A(x1, y1): ");
        x1 = scn.nextInt();
        y1 = scn.nextInt();
        
        System.out.print("Enter Point B(x2, y2): ");
        x2 = scn.nextInt();
        y2 = scn.nextInt();
        
        d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.println("Point A = (" + x1 + ", " + y1 + ")");
        System.out.println("Point B = (" + x2 + ", " + y2 + ")");
        System.out.println("Distance = " + d + "m");
    }
    
}


