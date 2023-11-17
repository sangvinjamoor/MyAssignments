package week3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		Integer[] numArr = {1,2,3,4,10,7,8,12};
		Arrays.sort(numArr);
		List<Integer> numList = new ArrayList<>(Arrays.asList(numArr));
		for(int i =0;i<numList.size()-1;i++) {
			int first = numList.get(i);
			int next = numList.get(i+1);
			while(first+1<next) {
				System.out.println(++first);
			}
			
		}
	}

}
