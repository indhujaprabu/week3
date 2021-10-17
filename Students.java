package week3day1;

public class Students {

	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentsInfo(11);
		stu.getStudentsInfo(11, "Indhuja");
		stu.getStudentsInfo("indhu.new@gmail.com", "9176682700");
	 
	}

   public void getStudentsInfo(int id)
   {
	   System.out.println("id is: "+id);
   }
   public void getStudentsInfo(int id,String name)
   {
	   System.out.println("Id is: "+id);
	   System.out.println("Name is: "+name);
   }
   public void getStudentsInfo(String email,String phone)
   {
	   System.out.println("email id: "+email);
	   System.out.println("Phone number: "+phone);
   }
   
}