import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Substitute characters if length < 3");
            System.out.println("2. Concatenate two strings");
            System.out.println("3. Extract Substring");
            System.out.println("4. Reverse a string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    str1 = scanner.next();
                    System.out.println("Result: " +substituteChars(str1));
                    break;
                case 2:
                    System.out.print("Enter first string: ");
                    str1 = scanner.next();
                    System.out.print("Enter second string: ");
                    str2 = scanner.next();
                    System.out.println("Concatenated string: " + concatenateStrings(str1, str2));
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    str1 = scanner.next();
                    System.out.print("Enter start index: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int endIndex = scanner.nextInt();
                    System.out.println("Substring: " + extractSubstring(str1, startIndex, endIndex));
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    str1 = scanner.next();
                    System.out.println("Reversed string: " + reverseString(str1));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        
        scanner.close();
    }

   

public static String substituteChars(String str) {
    if (str.length() < 3) {
        String result = "";
        for (int i = 0; i < 3; i++) {
            if (i < str.length()) {
                result += str.charAt(i);
            } else {
                result += "#";
            }
        }
        return result;
    }
    return str;
}



    
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    
    public static String extractSubstring(String str, int startIndex, int endIndex) {
        return str.substring(startIndex, endIndex);
    }

    
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

