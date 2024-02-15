import java.util.Arrays;
import java.util.Scanner;

class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  array limit:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // System.out.println("Array elements after sorting");
        // for(int i=0;i<n;i++){
        //     System.err.println(arr[i]);
        // }
        System.out.print("Second Largest Element present in the array is:");
        System.out.println(arr[arr.length-2]);
        
    }
}
