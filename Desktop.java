package week3day1;

public class Desktop implements Software {

	public static void main(String[] args) {
		Software s=new Desktop();
		s.softwareResources();
		s.hardwareResources();
	    Desktop d = new Desktop();
	    d.deskTopModel();
     
	}
	public void deskTopModel()
    {
   	 System.out.println("This is the Desktop Model");
    }
	public void softwareResources()
	{
		System.out.println("these are the software resources");
		
	}
	public void hardwareResources()
	{
		System.out.println("Hardware resources");
	}
}
