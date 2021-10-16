package week3day1;

public class Vehicle {

	public static void main(String[] args) {
	//create object to call the methods
		car v= new car();
		v.accelerate();
		v.drivevehicle();
		v.applybreak();
		v.fillfuel();
		v.closeDoor();
		v.enableairbag();
		Audi a=new Audi();
		a.accelerate();
		a.drivevehicle();
		a.applybreak();
		a.fillfuel();
		a.closeDoor();
		a.enableairbag();
	}
	public void accelerate()
	{
		System.out.println("can accelerate");
		
	}

	public void drivevehicle()
	{
		System.out.println("can drive");
		
	}
	public void applybreak()
	{
		System.out.println("applybreak");
		
	}
	public void fillfuel()
	{
		System.out.println("can fill");
	
	}
	}

	
	

