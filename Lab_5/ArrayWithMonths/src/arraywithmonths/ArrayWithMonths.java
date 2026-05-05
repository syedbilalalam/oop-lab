package arraywithmonths;
import java.util.Random;

public class ArrayWithMonths {

    public static void main(String[] args) {
        Random rnd = new Random();
        String[] months = {
            "January", "Feburay", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"
        };
        double[] decimalValues = new double[12];
        double avg, sum = 0;

        for (int i = 0; i < decimalValues.length; i++) {
            decimalValues[i] = rnd.nextInt(10001) / 100.00;
            sum += decimalValues[i];
        }
        avg = sum / 12;
        
        // Printing all values:
        for (int i = 0; i < decimalValues.length; i++) {
            System.out.println(months[i] + ": " + decimalValues[i]);
        }
        System.out.println("AVG of decimal values: " + avg);
    }
}


