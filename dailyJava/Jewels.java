package dailyJava;

public class Jewels {
	
	public static void main(String[] args) {
		String jewels = "aAb";
		String stones = "aAAbbBDF";
		int count=0;
		char[] jewelsArr = jewels.toCharArray();
		char[] stonesArr = stones.toCharArray();
		for(int i=0;i<jewelsArr.length;i++) {
			for(int j=0;j<stonesArr.length;j++) {
				if(jewelsArr[i]==stonesArr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
