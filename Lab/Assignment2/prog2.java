package Assignment2;

import java.util.*;

class Triangle {

    public static void pattern() {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        m = sc.nextInt();
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

class prog2 {
    public static void main(String[] args) {
        Triangle.pattern();
    }
}
