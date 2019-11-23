
public class searchInsertPos {
public int searchInsert(int[] nums, int target) {
        if(nums.length==0) return 0;
        else 
        {    
        	for(int i=0;i<=nums.length-1;i++)
        	{
        		if(nums[i]>target || nums[i]==target)
        		{
        			return i;
        		}
        	}
        }
        return nums.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		searchInsertPos si=new searchInsertPos();
		int[] nums= {1,3,5,6};
		int val=si.searchInsert(nums, 0);
		System.out.println(val);
		
	}

}
