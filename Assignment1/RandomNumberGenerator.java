package Assignment1;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate and print random integer
        int randomNumber = random.nextInt(100); // Generates a random integer between 0 to 99
        System.out.println("Random Number: " + randomNumber);
        
    }
}
