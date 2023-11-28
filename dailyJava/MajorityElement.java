package dailyJava;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2,1,1};
		int majority = (nums.length)/2;
		for(int i=0;i<nums.length;i++) {
			int count=1;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count>majority) {
				System.out.println("Majority element is "+nums[i]);
				break;
			}
		}
	}
}
