package week3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortStrings {

	public static void main(String[] args) {
		String[] words = {"HCL","Wipro","Aspire Systems","CTS"};
		Arrays.sort(words);
		List<String> wordsList = new ArrayList<>();
		for(int i=words.length-1;i>=0;i--) {
			wordsList.add(words[i]);
		}
		System.out.println(wordsList);
	}

}
