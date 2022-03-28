import java.util.Arrays;

// 当遇到有序数组的，需要第一时间联想到双指针
public class Solution2 {
    public static void main(String args[]) {
    TwoSumIISolution2 two = new TwoSumIISolution2();
  	   int[] input = new int[] {2,7,11,15};
  	   System.out.println(Arrays.toString(two.twoSum(input, 9)));
    }
}

class TwoSumIISolution2{
	public int[] twoSum(int[] numbers, int target) {
		int[] ns = new int[2];
		int start = 0;
		int end = numbers.length-1;
		while(start <= end) {
			int sum = numbers[start]+numbers[end];
			if(sum == target) {
				ns[0]=start+1;
				ns[1]=end+1;
				return ns;
			}else if(sum < target) {
				start++;
			}else
			{
				end--;
			}
		}
		return ns;
	}
}