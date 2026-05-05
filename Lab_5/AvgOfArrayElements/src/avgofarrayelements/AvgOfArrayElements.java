package avgofarrayelements;
import java.util.Random;

public class AvgOfArrayElements {

    public static void main(String[] args) {
        Random rnd = new Random();
        double[] decimalValues = new double[10];
        double avg, sum = 0;
        for (int i = 0; i < decimalValues.length; i++) {
            decimalValues[i] = rnd.nextInt(10001) / 100.00;
        }
        
        // Calculating avg
        for (int i = 0; i < decimalValues.length; i++) {
            sum += decimalValues[i];
        }
        avg = sum / 10;
        
        System.out.println("AVG of array values: " + avg);
    }
}


