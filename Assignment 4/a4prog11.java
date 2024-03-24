public class a4prog11 {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[4]); // Accessing index out of bounds
            int result = 10 / 0; // ArithmeticException and ArrayIndexOutOfBoundsException
            
            System.out.println("Result: " + result);
        } 
        
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } 
        
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

