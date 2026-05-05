package fibonaccisequence;

public class FibonacciSequence {

    public static void main(String[] args) {
        int d1 = 0, d2 = 1;
        int i = 0;
        
        System.out.print("Fibonacci Sequence ");
        System.out.println("(Only non divisible by 3): ");
        while (i < 10) {
            int temp = d2;
            d2 = d2 + d1;
            d1 = temp;
            
            if (d1 % 3 == 0) {
                continue;
            }
            
            System.out.print(d1 + ", ");
            i++;
        }
        System.out.println();
      
    }
    
}

