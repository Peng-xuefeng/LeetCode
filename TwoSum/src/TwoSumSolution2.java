import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumSolution2 {
	public static void main(String args[]) {
		Solution2 s = new Solution2();
		int[] input= new int[] {2,7,11,15};
		int[] result = s.twoSum(input, 9);
		System.out.println(Arrays.toString(result));
		
	}
}
class Solution2{
	public int[] twoSum(int[] nums, int target) {
		int[] ns = new int[2];
		if(nums.length==0){
			return ns;
		}
		else {
			Map<Integer,Integer> map = new HashMap<>();
			for(int i=0;i<nums.length;i++) {
				int number = nums[i];
				int diff = target - number;
				if(map.containsKey(diff)) {
					ns[0]=i;
					ns[1]=map.get(diff);
					return ns;
				}
				else {
					map.put(number, i);
				}
			}
		}
		
		
		
		return ns;
	}
}