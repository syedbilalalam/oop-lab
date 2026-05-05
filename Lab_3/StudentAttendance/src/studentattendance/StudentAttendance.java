package studentattendance;

import java.util.Scanner;

public class StudentAttendance {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int classesHeld;
        double classesAttended, per;

        System.out.print("Enter No. of classes held: ");
        classesHeld = scn.nextInt();
        System.out.print("Enter No. of classes attended: ");
        classesAttended = scn.nextDouble();
        
        per = (classesAttended / classesHeld) * 100;
        
        System.out.println("Attendance: " + per + "%");
        if (per < 75) {
            System.out.println("Student will not be allowed to sit in exam.");
        }
        else {
            System.out.println("Student is allowed to sit in exam.");
        }
    }
    
}


