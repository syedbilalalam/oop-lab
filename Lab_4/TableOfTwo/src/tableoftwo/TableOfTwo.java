package tableoftwo;

public class TableOfTwo {

    public static void main(String[] args) {
        
        int num = 2, i = 1;
        
        do {
            int ans = num * i;
            System.out.println(num + " x " + i + " = " + ans);
            i++;

        } while (i <= 10);        
    }

}




