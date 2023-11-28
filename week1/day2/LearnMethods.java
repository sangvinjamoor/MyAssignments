package week1.day2;

public class LearnMethods {
	private int balance;

	public void depositAmount(int amount) {
		balance = amount;

	}

	public int getBalance() {
		return balance;
	}
	public static void main(String[] args) {
		LearnMethods lm = new LearnMethods();
		lm.depositAmount(1000);
		
		System.out.println(lm.getBalance());

	}
}
