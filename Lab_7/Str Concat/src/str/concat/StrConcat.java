package str.concat;

public class StrConcat {

    public static void main(String[] args) {
        String sentence = "He took a nap";
        String extendedSentence = sentence.concat(" that day");
        
        System.out.println("---");
        System.out.println("Before concat:");
        System.out.println(sentence);
        System.out.println("---");
        System.out.println("After concat:");
        System.out.println(extendedSentence);
        System.out.println("---");
    }
    
}


