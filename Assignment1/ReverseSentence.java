package Assignment1;
import java.util.Scanner;

public class ReverseSentence {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a sentence: ");
    String sentence = scanner.nextLine();

    String reversedSentence = new StringBuilder(sentence).reverse().toString();

    System.out.println("Reversed sentence: " + reversedSentence);
  }
}
