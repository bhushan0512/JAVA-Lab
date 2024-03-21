package Assignment2;

class outer{
	static int a=10;
	static class inner{
		public static void display(){
			System.out.println(a);
		}
	}
}
class prog6{
	public static void main(String args[]){
		outer.inner ob=new outer.inner();
		ob.display();
	}
}