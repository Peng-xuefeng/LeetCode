import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
   public static void main(String args[]) {
	   TwoSumII two = new TwoSumII();
	   int[] input = new int[] {2,7,5,11};
	   System.out.println(Arrays.toString(two.twoSum(input, 9)));
   }
}

class TwoSumII{
	 public int[] twoSum(int[] numbers, int target) {
	        int[] ns = new int[2];
	        if(numbers.length ==0) {
	            return ns;
	        }
	        else{
	            Map<Integer,Integer> map = new HashMap<>();
	            for(int i=0; i<numbers.length;i++){
	                int num = numbers[i];
	                int diff = target - num;
	                if(map.containsKey(diff)){
	                    ns[0]=i+1 < map.get(diff)? i+1:map.get(diff)+1;
	                    ns[1]=i+1 > map.get(diff)? i+1:map.get(diff)+1;
	                    return ns;
	                }
	                else{
	                    map.put(num,i);
	                }
	            }
	        }
	        return ns;
	    }
}