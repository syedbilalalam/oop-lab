package gradescale;

import java.util.Scanner;

public class GradeScale {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int gradeRange;
        double numericalGrade;
        char letterGrade;
        
        System.out.print("Enter numerical grade (0 - 100): ");
        numericalGrade = scn.nextDouble();
        
        gradeRange = (numericalGrade == 100) ? 10 : (int) numericalGrade / 10;
        switch (gradeRange) {
            case 10:
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            default:
                letterGrade = 'F';
                break;
        }
        System.out.println("Numerical Grade: " + numericalGrade + "%");
        System.out.println("Letter Grade: " + letterGrade);
       
    }
    
}


