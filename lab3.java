import java.util.Scanner;

class lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  array limit:");
        int n = sc.nextInt();
        int[] arr=new int[n], copy=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Main array is: [");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("]\n");

        copy=arr.clone();
        copy[0]=arr[arr.length-1];
        copy[arr.length-1]=arr[0];
        
        System.out.print("Resultant array is: [");
        for(int i=0;i<n;i++){
            System.out.print(copy[i]+",");
        }
        System.out.print("]\n");
    }
    
}
