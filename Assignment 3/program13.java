// Num base class
class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

// HexNum derived class (inherits Num)
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(super.number));
    }
}

// Demonstration of the classes
public class program13 {
    public static void main(String[] args) {
        // Create an instance of Num class
        Num num = new Num(42);
        num.showNum();

        // Create an instance of HexNum class
        HexNum hexNum = new HexNum(42);
        hexNum.showNum();
    }
}
