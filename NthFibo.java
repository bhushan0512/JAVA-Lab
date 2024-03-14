import java.io.*;
import java.util.*;
class NthFibo{
	public static void main(String args[]){
		int i,num,f1=0,f2=1,f3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		num=sc.nextInt();
		if(num==1){
			System.out.println(num+"th Fibanacci number is 0");
		}
		else if(num==2){
			System.out.println(num+"th Fibanacci number is 1");
		}
		else{
			for(i=3;i<=num;i++){
				f3=f1+f2;
				f1=f2;
				f2=f3;
			}
			System.out.println(num+"th Fibanacci number is "+f3);
		}
	}
}
