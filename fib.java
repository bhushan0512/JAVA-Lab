import java.io.*;
import java.util.*;
class fib{
	public static void main(String args[]){
		int i,num,f1=0,f2=1,f3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		num=sc.nextInt();
		System.out.println("Fibonacci series : \n");
		if(num==1){
			System.out.println(f1);
		}
		else if(num==2){
			System.out.print(f1+"\n"+f2);
		}
		else{
			System.out.println(f1+"\n"+f2);
			for(i=1;i<=num;i++){
				f3=f1+f2;
				System.out.println(f3);
				f1=f2;
				f2=f3;
			}
		}
	}
}
