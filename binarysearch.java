import java.util.*;
class binarysearch {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the size of the Array : ");
    	int size=sc.nextInt();
    	int arr[]=new int[size];
    	System.out.println("Enter the sorted array elements : ");
    	for(int i=0;i<size;i++)
    		arr[i]=sc.nextInt();
    	System.out.println("Enter the Search elements : ");
    	int targetElement=sc.nextInt();
    	int l=0,r=size-1,mid=-1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == targetElement) {
                break;
            } else if (arr[mid] > targetElement) {
                r = mid - 1;
            } else {
              l = mid + 1;
            }  
        }
        if(l<r)
        	System.out.println("Element found at index "+mid );
        else
        	System.out.println("Element not found");
    }
}
