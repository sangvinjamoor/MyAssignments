package week3.homework;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,4,2,3,6,8,9,7};
		Arrays.sort(arr);
		for(int i=1;i<=arr.length;i++) {
			if(i!=arr[i-1]) {
				System.out.println(i);
				break;
			}
		}
	}
}
