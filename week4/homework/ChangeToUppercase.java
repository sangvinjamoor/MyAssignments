package week4.homework;

public class ChangeToUppercase {

	public static void main(String[] args) {
		String test= "changeme";
		char[] chars = test.toCharArray();
		for(int i=1;i<chars.length;i+=2) {
			chars[i]=Character.toUpperCase(chars[i]);
		}
		test="";
		for(char ch:chars)
			test=test+ch;
		System.out.println(test);
	}

}
