package randomnumber;

public class RandomNumber {

    public static void main(String[] args) {

        // To generate random number between 1 and 25
        int randomNumber = (int) (Math.random() * 25) + 1;

        // Our character
        char asciiChar = (char) (randomNumber + 64);

        System.out.println("Random Number  : " + randomNumber);
        System.out.println("ASCII Value    : " + (randomNumber + 64));
        System.out.println("Character      : " + asciiChar);
    }
    
}

