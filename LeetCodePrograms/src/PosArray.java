
public class PosArray {
	 public int[] searchRange(int[] nums, int target) {
	        int[] a= {-1,-1};
	        int firstocc=-1,lastocc=-1;
	        for(int i=0;i<=nums.length-1;i++)
	        {
	        	System.out.println(nums[i]);
	        	if(nums[i]==target && firstocc==-1)
	        	{
	        		System.out.println("here");
	        		firstocc=i;
	        	}
	        	if(nums[i]==target && firstocc!=-1)
	        	{
	        		lastocc=i;
	        	}
	        }
	        if(firstocc!=-1 && lastocc==-1)
	        {
	        	a[0]=firstocc;
	        	a[1]=firstocc;
	        }
	        else if(firstocc!=-1 && lastocc!=-1)
	        {
	        	a[0]=firstocc;
	        	a[1]=lastocc;
	        }
	       
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PosArray pa=new PosArray();
		int[] nums= {1};
		int[] pa1=pa.searchRange(nums, 1);
		for (int i=0;i<=pa1.length-1;i++)
		{
			System.out.println(pa1[i]);
		}
	}

}
