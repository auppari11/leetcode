/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.*/
import java.util.HashMap;

public class RemoveDuplicates {
public int removeDuplicates(int[] nums) {
	int len=0;
	if(nums.length==0) return 0;
	else if(nums.length==1) return 1;
	else if(nums.length>1)
	{
//		len=1;
	int i=0;
		for(int j=1;j<=nums.length-1;j++)
		{
			if(nums[j]!=nums[i])
			{
				i++;
				nums[i]=nums[j];
			}
		}
		len=i+1;
	}
	
//HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
//	for(int i=0;i<=nums.length-1;i++)
//	{
//		if(mp.isEmpty() || !mp.containsValue(nums[i]))
//		{
//			mp.put(len, nums[i]);
//			len++;
//		}
//	}
//	for(int k=0;k<=len-1;k++)
//	{
//		nums[k]=mp.get(k);
//	}
  return len;      
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicates rd=new RemoveDuplicates();
		int nums[]= {1,1,2};
		int d=rd.removeDuplicates(nums);
		System.out.println(d);
	}

}
