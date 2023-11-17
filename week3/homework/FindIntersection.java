package week3.homework;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7,9};
		int[] arr2 = {1,2,8,4,9,7,11};
		List<Integer> intersect = new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					intersect.add(arr1[i]);
					break;
				}
			}
		}
		System.out.println(intersect);
	}
}
