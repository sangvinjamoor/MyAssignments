package week4.homework;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String test = "We learn Java basics as part of Java sessions in java week1";
		int count = 0;
		String[] words= test.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j = i+1;j<words.length;j++) {
				
				if(words[i].equalsIgnoreCase(words[j])) {
					count++;
					words[j]="";
				}
			}
		}
		if(count>0) {
			test="";
			for(String word:words) {
				test=test+word + " ";
			}
		}
		System.out.println(test);
	}
}
