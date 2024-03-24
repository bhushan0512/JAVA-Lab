package Assignment2;

import java.io.*;

class Alpha {
    int a;
    int b;
    int c;

    Alpha(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void getAlpha() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void calculate() {
        c = a + b;
        System.out.println(a + " " + b + " " + c);
    }

    void calculate(int p) {
        c = (a * b) / p;
        System.out.println(a + " " + b + " " + c);
    }
}

public class prog3 {
    public static void main(String arg[]) {
        Alpha x = new Alpha(0, 0);
        x.getAlpha();
        x.calculate();
        x.calculate(2);
    }
}
