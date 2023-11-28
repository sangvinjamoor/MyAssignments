package dailyJava;

public class CheckPalindrome {

	public static void main(String[] args) {
		String s = "race a car";
		s=(s.replaceAll("[^A-Za-z0-9]","")).toLowerCase();
		System.out.println(s);
		char[] charArr = s.toCharArray();
		String newS = new String();
		for(int i=s.length()-1;i>=0;i--) {
		newS = newS + charArr[i];
		}
		System.out.println(newS);
		if(s.equals(newS))
			System.out.println("Given string is a palindrome");
		else
			System.out.println("Given string is not a palindrome");
	}

}
