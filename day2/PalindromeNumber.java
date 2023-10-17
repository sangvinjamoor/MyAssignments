package week1.day2;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 843348;
		PalindromeNumber pal = new PalindromeNumber();
		if(pal.isPalindrome(number))
			System.out.println(number + " is Palindrome");
		else
			System.out.println(number + " is not a Palindrome");
	}

	public boolean isPalindrome(int number) {
		int reverseNumber = 0;
		for(int i = number;i>0;) {
			reverseNumber = (reverseNumber*10) + (i%10); 
			i=i/10;
		}
		if(reverseNumber==number)
			return true;
		return false;
		
	}

}
