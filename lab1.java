import java.lang.*;
import java.util.*;

class lab1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String string = sc.nextLine();
        System.err.println("The entered String is:"+string);
        System.err.println(string);
        charCount(string);
    }

    public static void charCount(String string) {
        char[] chars = string.toCharArray();
        int letter, space, number, other;
        letter = space = number = other = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]))
                letter++;
            else if (Character.isDigit(chars[i]))
                number++;
            else if (Character.isSpaceChar(chars[i]))
                space++;
            else
                other++;
        }

        System.out.println("Letter"+letter);
        System.out.println("Space"+space);
        System.out.println("Number"+number);
        System.out.println("Other"+other);
        
    }

}
