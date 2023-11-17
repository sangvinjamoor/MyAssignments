package week3.homework;

import java.util.Arrays;

public class SecondLarget {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		Arrays.sort(arr);
		System.out.println("Second Largest number is " +arr[arr.length-2]);
	}
}
