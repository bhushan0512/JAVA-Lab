import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] newArray = swapFirstAndLastElements(array);
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(newArray));
    }

    public static int[] swapFirstAndLastElements(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;
        return newArray;
    }
}

