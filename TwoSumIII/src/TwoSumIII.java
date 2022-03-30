import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumIII {
   public static void main(String args[]) {
	   TwoSum two = new TwoSum();
	   two.add(1);
	   two.add(3);
	   two.add(4);
	   two.add(7);
	   System.out.println(two.find(8));
   }
}

class TwoSum{
	List<Integer> list;  //这一题主要是考察语法的问题，怎么把这个list拿来最外层定义；
	public TwoSum() {
	   list = new ArrayList<>();
	}
	public void add(int number) {
	   list.add(number);
	}
	public boolean find(int value) {
		Map<Integer,Integer> map = new HashMap<>();
	     for(int i = 0 ; i< list.size();i++) {
	    	 int num = list.get(i);
	    	 int diff = value - num;
	    	 if(map.containsKey(diff)) {
	    		 return true;
	    	 }else {
	    		 map.put(num, i);
	    	 }
	     }
	     return false;
	}
}