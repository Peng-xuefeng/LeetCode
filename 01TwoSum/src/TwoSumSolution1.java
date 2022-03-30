import java.util.Arrays;

public class TwoSumSolution1 {
    public static void main(String args[]) {
    	Solution1 s = new Solution1();
    	int[] input = new int[] {2,7,11,15};
    	int[] result = s.twoSum(input, 9);
    	System.out.println(Arrays.toString(result));
    }
}
class Solution1 {
	public int[] twoSum(int nums[], int target) {
		int[] ns = new int[2];
		if(nums.length==0) {
			return ns;
		}
		else {
			for(int i=0;i<nums.length;i++) {
				for(int j=i+1;j<nums.length;j++) {
					if(nums[i]+nums[j]==target) {
						ns[0]=i;
						ns[1]=j;
						return ns;
					}
				}
			}
		}
		return ns;
	}
}
