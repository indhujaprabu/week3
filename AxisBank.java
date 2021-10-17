package week3day1;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		
		
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.deposit();//override from Axisbank
		ab.fixed();

	}


public void deposit() {
	System.out.println("Recurring deposit");
}
}