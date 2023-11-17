package week3.day1;

public class OverLoadingDemo {

	public void reportStep(String message,String status) {
		System.out.println("Message : " + message);
		System.out.println("Status: " + status);
	}
	
	public void reportStep(String message,String status, boolean takeSnapshot) {
		if(takeSnapshot) {
			System.out.println("Taking snapshot");
			System.out.println("Message : " + message);
			System.out.println("Status: " + status);
		}
		else
			System.out.println("No snapshot required " );
		System.out.println("Message : " + message);
		System.out.println("Status: " + status);
	}
	public static void main(String[] args) {
		OverLoadingDemo demo = new OverLoadingDemo();
		demo.reportStep("Method 1","2 arguments");
		System.out.println("----------------------------");
		demo.reportStep("Method 2", "3 arguments",true);
		System.out.println("----------------------------");
		demo.reportStep("Method 2","3 arguments",false);

	}

}
