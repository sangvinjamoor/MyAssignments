package dailyJava;

public class HappyNumber {

	public static void main(String[] args) {
		int n=1880;
		int temp=n;
		//find squares and add the number
	for(;;) {
		int sum=0;
		for(;;) {
			int rem = temp%10;
			temp= temp/10;
			sum=sum+(rem*rem);
			if(temp<10) {
				sum=sum+(temp*temp);
				break;
			}
		}
		System.out.println(sum);
		if(sum==1) {
			System.out.println(n + " is a happy number");
			break;
		}
		if(sum==4) {
			System.out.println(n + " is not a happy number");
			break;
		}
		temp=sum;
	}
	}
}
