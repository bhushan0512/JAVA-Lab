package Assignment1;
import java.util.Scanner;

public class LargestIndexInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find the index of the largest element
        int largestIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[largestIndex]) {
                largestIndex = i;
            }
        }
        
        // Print the index of the largest element
        System.out.println("Index of the largest element: " + largestIndex);
    }
}
