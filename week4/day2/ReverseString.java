package week4.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str = new String("TestLeaf");
		char[] charArr = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
		System.out.print(charArr[i]);
		}

	}

}
