package week3.day1;

public interface RBI {

	int withdrawalLimit   =  1000000;
	
	public void knowYourCustomer();
	
	public void minimumBalance() ;
	
	public static void main(String[] args) {
		System.out.println("Interface main method");
	}
	
	public default void nonabstract() {
		System.out.println("Non abstract method in interface");
	}
}
