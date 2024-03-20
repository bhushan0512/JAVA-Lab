package Assignment1;
import java.util.Scanner;
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        countCharacters(inputString);
    }
    public static void countCharacters(String input) {
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isSpaceChar(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("The string is : " + input);
        System.out.println("letter: " + letterCount);
        System.out.println("space: " + spaceCount);
        System.out.println("number: " + numberCount);
        System.out.println("other: " + otherCount);
    }
}
