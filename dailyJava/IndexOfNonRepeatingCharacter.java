package dailyJava;

public class IndexOfNonRepeatingCharacter {

	public static void main(String[] args) {
		String input = "loveleetcode";
		char[] letters = input.toCharArray();
		boolean found=true;
		for(int i=0;i<letters.length;i++) {
			found=false;
			char let = letters[i];
			for(int k=i-1;k>=0;k--) {
				if(letters[k]==letters[i]) {
					found=true;
					break;
				}
			}
			for(int j=i+1;j<letters.length;j++) {
				if(let==letters[j]) {
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.println(let);
				System.out.println("Index of first Non repeating character is at " + input.indexOf(let));
				break;
			}
			if((i==letters.length-1) && found)
				System.out.println("ALl characters are repeating . -1");
		}
		
			
	}
}
