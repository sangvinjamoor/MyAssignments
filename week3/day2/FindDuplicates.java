package week3.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] num = {2,5,7,2,8,7,5,9,2,3};
		/**for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
					
				}
			}
		}**/
		
		Arrays.sort(num);
		for(int i=0;i<num.length;) {
			int j=i+1;
			boolean duplicate = false;
			while(j<num.length && num[i]==num[j]  ) {
				duplicate = true;
				j++;
			}
			if(duplicate)
				System.out.println(num[i]);
			i=j;
		}

	}

}
