package week4.homework;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a sotware tester";
		//Reverse odd position strings
		String[] words = test.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
			if(i%2!=0) {
				//reversal needs to be done
				char[] characters = words[i].toCharArray();
				String reversedWord = new String();
				for(int j=characters.length-1;j>=0;j--) {
					reversedWord = reversedWord + characters[j];
				}
				words[i]= reversedWord;
			}
		}
		//Printing the output string
		String output = new String();
		for(String word:words) {
			output = output + " " + word;
		}
		System.out.println("Output string " +output);
		
	}
}
