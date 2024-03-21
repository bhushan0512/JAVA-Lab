package Assignment2;
import java.util.*;
class BinarySearch {

    public static int binarySearch(int[] arr, int targetElement) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == targetElement) {
                return mid;
            } else if (arr[mid] < targetElement) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

public class prog1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the sorted array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the Search element: ");
        int targetElement = sc.nextInt();
        
        int index = BinarySearch.binarySearch(arr, targetElement);
        
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
