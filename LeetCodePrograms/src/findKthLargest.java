import java.util.TreeSet;

public class findKthLargest {
	  public int findKthLargest(int[] nums, int k) {
	       TreeSet<Integer> s=new TreeSet<>();
	       for(int i=0;i<=nums.length-1;i++)
	       {
	    	   if(!s.contains(nums[i])) s.add(nums[i]);
	    	   
	       }
	       System.out.println(s);
	       int cnt=1,n=(nums.length-k-1);
	       System.out.println(n);
	      while(cnt<=n-1)
	      {
	    	  s.remove(s.first());
	    	  cnt++;
	      }
	     
	       System.out.println(s);
	       return s.first();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findKthLargest fk=new findKthLargest();
//		int[] nums= {3,2,3,1,2,4,5,5,6};
		int[] nums= {3,2,1,5,6,4};
		System.out.println(fk.findKthLargest(nums, 2));
	}

}
