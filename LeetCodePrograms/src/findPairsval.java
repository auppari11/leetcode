import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class findPairsval {
	 public int findPairs(int[] nums, int k) {
		 if(nums.length<=1 || k<0) return 0;
		 int cnt=0;
		 HashMap<Integer,Integer> mp=new HashMap<>();
		 for(int i=0;i<=nums.length-1;i++)
		 {
			mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1) ;
		 }
		
		for(Entry<Integer, Integer> m:mp.entrySet())
		{
			if(k==0)
			{
				if(m.getValue()>=2)
				{
					cnt++;
				}
			}
			else
			{
				if(mp.containsKey(m.getKey()+k))
				{
					cnt++;
				}
			}
		}
		 return cnt;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPairsval fps=new findPairsval();
		int[] nums= {1,3,1,5,4};
		int k=2;
		System.out.println(fps.findPairs(nums, k));

	}

}
