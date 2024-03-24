public class a4prog12 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Division by zero
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } 
        catch (ArithmeticException e) {
            throw e;
        }
    }
}

