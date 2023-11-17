package week3.day1;

public class Codes extends Numbers {

	public void add(int num1,int num2) {
		//Double and add 
		int result = (2*num1) + (2*num2);
		System.out.println("Child class result : " +result);
		
	}
	
	public static void main(String[] args) {
		Codes c = new Codes();
		c.add(10,20);
		Numbers n = new Numbers();
		n.add(10, 20);
	}
	
	
}
