package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Input target value
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();
        
        // Perform binary search
        int index = Arrays.binarySearch(array, target);
        
        // Output result
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
}
