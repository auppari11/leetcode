import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate {
	 public List<Integer> findDuplicates(int[] nums) {
		 List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < nums.length; ++i) {
	            int index = Math.abs(nums[i])-1;
	            if (nums[index] < 0)
	                res.add(Math.abs(index+1));
	            nums[index] = -nums[index];
	        }
	        return res;
//	       List<Integer> ls =new ArrayList<Integer>();
//	       Set<Integer> s=new HashSet<>();
//	       for(int i=0;i<=nums.length-1;i++)
//	       {
//	    	   if(!s.contains(nums[i])) s.add(nums[i]);
//	    	   else if(s.contains(nums[i])) ls.add(nums[i]);
//	       }
//	       return ls;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicate dp=new duplicate();
		int[] nums= {4,3,2,7,8,2,3,1};
		System.out.println(dp.findDuplicates(nums));
	}

}
