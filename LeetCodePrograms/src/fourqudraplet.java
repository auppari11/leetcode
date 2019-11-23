import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourqudraplet {
	 public List<List<Integer>> fourSum(int[] nums, int target) {
		 List<List<Integer>> ls=new ArrayList<>();
	        if(nums.length==0) return ls;
	        Arrays.sort(nums);
	        for(int i=0;i<=nums.length-4;i++)
	        {
	        	if(i==0 ||(i>0 && nums[i]!=nums[i-1]))
	        	{
	        		for(int j=i+1;j<=nums.length-3;j++)
	        		{
	        			if(j==i+1 || (j>0 && nums[j]!=nums[j-1]))
	        			{
	        				int low=j+1;
	        				int high=nums.length-1;
	        				int sum=target-(nums[i]+nums[j]);
	        				while(low<high)
	        				{
	        					if(nums[low]+nums[high]==sum)
	        					{
	        						ls.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
	        						while(low<high && (nums[low]!=nums[low+1]))low++;
	        						while(low<high && (nums[high]!=nums[high-1]))high--;
	        						low++;
	        						high--;
	        					}
	        					else if(nums[low]+nums[high]>sum) high--;
	        					else low++;
	        				}
	        			}
	        		}
	        	}
	        }
	        return ls;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fourqudraplet fp=new fourqudraplet();
		List<List<Integer>> ls=new ArrayList<>();
		int[] arr={-3,-2,-1,0,0,1,2,3};
		ls=fp.fourSum(arr, 0);
		System.out.println(ls);
		
	}

}
