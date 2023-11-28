package dailyJava;

public class LastWordLength {

	public static void main(String[] args) {
		String sample = "luffy is still joyboy";
		String[] words = sample.split(" ");
		String lastWord = words[words.length-1];
		System.out.println("Last word is " +lastWord);
		System.out.println("Length of last word is " +lastWord.length());
	}
}
