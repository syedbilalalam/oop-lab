package str.compare.to;
import java.util.Scanner;
public class StrCompareTo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] names;
        boolean swapFlag = true;
        int numOfPeople;
        System.out.print("Enter no of people: ");
        numOfPeople = scn.nextInt();
        scn.nextLine();
        names = new String[numOfPeople];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter person " + (i+1) + " name: ");
            names[i] = scn.nextLine();
        }
        
        // ===Sorting names array using String.compareTo method===
        while (swapFlag) {
            swapFlag = false;
            for (int i = 0; i < names.length - 1; i++) {
                if (names[i].compareTo(names[i+1]) > 0){
                    String temp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp;
                    swapFlag = true;
                }
            }
        }
        
        System.out.println("After sorting:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i+1) + ". "+ names[i]);
        }
    }
}

