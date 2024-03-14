package Assignment1;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        int[] swappedArray = swapFirstAndLast(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(swappedArray));

        scanner.close();
    }

    public static int[] swapFirstAndLast(int[] array) {
        if (array.length < 2) {
            return array; // If array has less than 2 elements, no need to swap
        }

        int[] newArray = Arrays.copyOf(array, array.length);

        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        return newArray;
    }
}
