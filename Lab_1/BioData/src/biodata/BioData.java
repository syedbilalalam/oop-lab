package biodata;
import java.util.Scanner;

public class BioData {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name, fatherName, email;
        String gender, department;
        int age;
        
        System.out.print("Enter your name: ");
        name = scn.nextLine();
        System.out.print("Enter father's name: ");
        fatherName = scn.nextLine();
        System.out.print("Enter your age: ");
        age = scn.nextInt();
        scn.nextLine();
        System.out.print("Enter your gender: ");
        gender = scn.next();
        scn.nextLine();
        System.out.print("Enter your email address: ");
        email = scn.next();
        scn.nextLine();
        System.out.print("Enter your department: ");
        department = scn.nextLine();
        
        // Printing outputs
        System.out.print("\nWelcome back, "+ name + "! ");
        System.out.println("thank you for being here today.");
        System.out.println("=====BIO DATA=====");
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Age:           " + age);
        System.out.println("Gender:        " + gender);
        System.out.println("Email Address: " + email);
        System.out.println("Department:    " + department);
    }
}





