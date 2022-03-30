import java.util.Arrays;

// 当遇到有序数组的，需要第一时间联想到双指针
public class Solution2 {
    public static void main(String args[]) {
    TwoSumIISolution2 two = new TwoSumIISolution2();
    int[] ar = new int[] {6,7,18,9,10};
  	System.out.println(Arrays.toString(two.bubleSort(ar)));
  	   
    }
}

class TwoSumIISolution2{
	public int[] bubleSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0; j<nums.length-1;j++) {
				if(nums[j]<nums[j+1]) {
					this.swap(nums,j);
				}
			}
		}
	   return nums;
	}
	public void swap(int[] nums,int j) {
		int temp;
		temp = nums[j];
		nums[j]=nums[j+1];
		nums[j+1]=temp;
	}
}