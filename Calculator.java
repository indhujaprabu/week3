package week3day1;

public class Calculator {

	public void add(int x, int y, int z)
	{
	    int sum=x+y+z;
		
		System.out.println(sum);
	}
	public void add(int x, int y)
	{
		
	   int sum=x+y;
		
		System.out.println(sum);
	}
	 public void subtract(int x, int y)

	 {
		 int sub=x-y;
		 System.out.println(sub);
	 }
	 public void subtract(int x, double y)

	 {
		 double sub=x-y;
		 System.out.println(sub);
	 }
 public void multi(int x, int y)

 {
	 int mul=x*y;
	 System.out.println(mul);
 }
 public void multi(int x, double y)

 {
	 double mul=x*y;
	 System.out.println(mul);
 }
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		obj.add(5, 6,7);
		obj.add(5, 6);
		obj.subtract(10, 5);
		obj.subtract(200,5);
		obj.multi(5, 3);
		obj.multi(5, 200);
	}
	

}
