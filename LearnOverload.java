package week3day1;

public class LearnOverload {

	public void employeeInfo() {
		String name = "Indhu";
		System.out.println("employee info " + name);
	}

	public void employeeInfo(int id, String name) {
		System.out.println("id: " + id);

		System.out.println("name of the employee: " + name);
	}

	public void employeeInfo(String name, int id) {
		System.out.println("id  :" + id);

		System.out.println("name of the employee: " + name);

	}

	public static void main(String[] args) {
		LearnOverload lol=new LearnOverload();
		lol.employeeInfo();
		lol.employeeInfo(10, "Indhu");
		lol.employeeInfo("IndhujaPrabu", 11);	
	}

}
