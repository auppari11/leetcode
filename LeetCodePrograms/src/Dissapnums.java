import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Dissapnums {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 
	     List<Integer> ls=new ArrayList<Integer>();
	     if(nums.length==0) return ls;
	     Set<Integer> s=new HashSet<>();
	     for(int i=0;i<=nums.length-1;i++)
	     {
	    	 if(!s.contains(nums[i])) s.add(nums[i]);
	     }
//	     System.out.println(s);
	     for(int i=1;i<=nums.length;i++)
	     {
	    	 if(!s.contains(i)) ls.add(i);
	     }
	     return ls;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dissapnums da=new Dissapnums();
		int[] nums= {1,1};
		System.out.println(da.findDisappearedNumbers(nums));
	}

}
