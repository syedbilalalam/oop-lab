package rectangle.table;

public class RectangleTable {
    public static void main(String[] args) {
        int[][] tableArr = new int[12][12];
        
        for (int i = 0; i < tableArr.length; i++) {
            for (int j = 0; j < tableArr[i].length; j++) {
                tableArr[i][j] = (i+1) * (j + 1);
            }
        }
        
        // First heading line
        System.out.print("\t ");
        for (int i = 1; i <= tableArr[0].length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        
        // Rest table
        for (int i = 0; i < tableArr.length; i++){
            
            // Printing row heading
            System.out.print("\t" + (i+1));
            for (int value: tableArr[i]) {
                System.out.print("\t" + value);
            }
            System.out.println();
        }
    }
}

