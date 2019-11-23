import java.util.HashMap;

public class containsDuplicate {

public boolean containsDuplicate(int[] nums) {
	HashMap<Integer, Integer> mp =new  HashMap<>();
	for(int i=0;i<=nums.length-1;i++)
	{
	if(mp.containsKey(nums[i]))
	{
		return true;
	}
	else
	{
		mp.put(nums[i],i );
	}
	}
	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		containsDuplicate cd= new containsDuplicate();
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		boolean b=cd.containsDuplicate(nums);
		System.out.println(b);
	}

}
