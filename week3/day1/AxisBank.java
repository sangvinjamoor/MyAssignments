package week3.day1;

public class AxisBank implements RBI {

	
	
	public void goldLoan() {
		System.out.println(RBI.withdrawalLimit);
		
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.nonabstract();
		int limit = ab.withdrawalLimit;
		System.out.println("Limit " + limit);
		System.out.println(RBI.withdrawalLimit);
	}

	@Override
	public void knowYourCustomer() {
		
		System.out.println("Knowing customer of AxisBank");
	}

	@Override
	public void minimumBalance() {
		
		System.out.println("Minimum balance is 1000");
	}

}
