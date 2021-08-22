package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("overridden money");
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj=new AxisBank();
		obj.deposit();
		obj.saving();
		obj.fixed();
		}
	}


