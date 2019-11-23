import java.util.Arrays;
import java.util.HashMap;

public class thirdMax {
	  public int thirdMax(int[] nums) {
		  if(nums.length<=0) return 0;
		   Arrays.sort(nums);
		   HashMap<Integer, Integer> mp=new HashMap<>();
		   int j=0;
		   for(int i=0;i<=nums.length-1;i++)
		   {
			   if(!mp.containsValue(nums[i])) mp.put(j++, nums[i]);
		   }
		   System.out.println("val "+mp.size());
//		   if(mp.size()==3) return mp.get(0);
		   if(mp.size()>=3) return mp.get(mp.size()-3);
		   else if(mp.size()<3) return mp.get(mp.size()-1);
		   return 0;
	    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thirdMax tm=new thirdMax();
		int[] a= {3,3};
		System.out.println(tm.thirdMax(a));
	}

}
