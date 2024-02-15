import java.io.IOException;
import java.util.*;

class lab2 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner isc = new Scanner(System.in);
        String string1;
        int ch;

        System.out.println("1. Length Checker\n2. Concatenate two strings\n3. Extract Substring\n4. Reverse a string");
        System.out.println("Enter your choice:");
        ch = isc.nextInt();

        System.out.println("Enter a String:");
        string1 = sc.nextLine();

        switch (ch) {
            case 1:
                if (string1.length() < 3) {
                    String string = string1;
                    char[] chars = string1.toCharArray();
                    string1 = "";
                    for (int i = 0; i < string.length(); i++) {
                        chars[i] = '#';
                    }
                    string1 = new String(chars);
                }

                System.out.println("Length of the string is:" + string1.length());
                System.out.println("The resultant string is:" + string1);
                break;

            case 2:
                System.out.println("Enter second String:");
                String string2 = sc.nextLine();
                String string3 = string1 + string2;
                System.out.println("String after concatenation is:" + string3);
                break;
            case 3:
                System.out.println("Enter the starting location:");
                int start = sc.nextInt();
                System.out.println("Enter the ending location:");
                int end = sc.nextInt();
                if (start < 0 || end > string1.length() - 1) {
                    System.out.println("!!!ERROR WITH THE START AND END LOCATION!!!:");
                    return;
                }
                System.out.println("the substring is:" + string1.substring(start, end));
                break;
            case 4:
                StringBuilder strrev = new StringBuilder(string1);
                System.out.println("reversed String is:" + strrev.reverse());
                break;
            default:
                System.out.println("!!!INVALID CHOICE!!!");
                break;
        }
    }
}
