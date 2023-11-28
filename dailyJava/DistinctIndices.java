package dailyJava;

public class DistinctIndices {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		boolean found=false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					int diff = j-i;
					if(diff<=k) {
						found=true;
						break;
					}
				}
			}
			if(found)
				break;
		}
		
		if(found)
			System.out.println("Distinct index found");
		else
			System.out.println("Distinct index not found");
	}
}
