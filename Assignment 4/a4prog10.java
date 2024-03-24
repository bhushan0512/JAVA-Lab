import java.util.Scanner;

public class a4prog10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            
            if (size < 0) {
                throw new NegativeArraySizeException();
            }
            
            int[] array = new int[size];
            System.out.println("Array created successfully!");
        } 
        
        catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative.");
        } 
        
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        scanner.close();
    }
}

