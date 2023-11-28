package dailyJava;

public class CheckForMultipleOccurence {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,56,23,64};
		boolean multipleOccurence = false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					multipleOccurence = true;
					break;
				}
			}
			if(multipleOccurence) 
				break;
			
		}
		if(multipleOccurence) 
			System.out.println("Not an unique array");
		
		else
			System.out.println("Unique elements array");
	}
}
