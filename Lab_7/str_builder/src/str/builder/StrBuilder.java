package str.builder;
public class StrBuilder {
    
    public static void main(String[] args) {
        // Initializing with a value
        StringBuilder strBil = new StringBuilder("Java is ");
        
        // Inserting a text at specific index
        strBil.insert(7, "awesome");
        
        // Replacing a word
        strBil.replace(7, 14, "powerful");
        
        // Final output
        System.out.println("Final Output: ");
        System.out.println(strBil.toString());
    }
    
}


