import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqTri {
public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls =new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length==0) return ls;
        for(int i=0;i<=nums.length-3;i++)
        {
        	if(i==0 ||(i>0 && nums[i]!=nums[i-1]) )
        	{
        		int low=i+1;
        		int high=nums.length-1;
        		int sum=0-nums[i];
        		while(low<high)
        		{
        			if(nums[low]+nums[high]==sum)
        			{
        				ls.add(Arrays.asList(nums[i],nums[low],nums[high]));
        				while(low<high && nums[low]==nums[low+1])low++;
        				while(low<high && nums[high]==nums[high-1])high--;
        				low++;
        				high--;
        			}
        			else if(nums[low]+nums[high]>sum) high--;
        			else low++;
        		}
        		
        	}
        }
        return ls;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqTri ut=new UniqTri();
		List<List<Integer>> ls1 =new ArrayList<>();
		int[] arr= {-1, 0, 1, 2, -1, -4};
		ls1=ut.threeSum(arr);
		System.out.println(ls1);
	}

}
