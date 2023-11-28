package dailyJava;

public class FindSingleOccurenceNumber {

	public static void main(String[] args) {
		int nums[] = {1};
		for(int i=0;i<nums.length;i++) {
			boolean found = false;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					found=true;
					break;
				}
					
			}
			if(!found) {
				System.out.println("Number with single occurence : " +nums[i]);
				break;
			}
		}
	}
}
