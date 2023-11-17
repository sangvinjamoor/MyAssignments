package week4.day2;

public class StringMethods {

	public static void main(String[] args) {
		String literal1 = "TestLeaf1";
		String literal2 = "TestLeaf1";
		String str1 = new String("TestLeaf1");
		String str2 = new String("TestLeaf1");
		str2=str1;
		str1 = literal1;
		System.out.println(str1==str2);
		System.out.println(literal1==literal2);
		System.out.println("Equals method");
		System.out.println(str1.equals(str2));
		System.out.println(literal1.equals(literal2));
		

	}

}
