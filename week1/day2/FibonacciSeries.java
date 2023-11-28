package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
	int range = 8;
	FibonacciSeries fib = new FibonacciSeries();
	fib.generateFibonacci(range);
}

public void generateFibonacci(int range) {
	int num1 = -1;
	int num2 = 1;
	for(int i=1;i<=range;i++) {
		int seriesNumber = num1 + num2;
		System.out.print(seriesNumber+ " , ");
		num1 = num2;
		num2 = seriesNumber;
		
	}

}
}
