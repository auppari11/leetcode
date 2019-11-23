import java.util.HashMap;
import java.util.Map;

public class MajorityElem {

public int majorityElement(int[] nums) {
	int size=nums.length/2;
	HashMap<Integer, Integer> mp=new HashMap<>();
	int cnt=1;
	for(int j=0;j<nums.length;j++)
	{
		if(!mp.containsKey(nums[j]))
		{
		cnt=1;
		for(int k=j+1;k<nums.length;k++)
		{			
			System.out.println(nums[j]);
			if(nums[j]==nums[k])
			{
				cnt++;
			}

//			System.out.println("cnt val"+cnt);
		}
	}
		if(!mp.containsKey(nums[j]))
		{
		mp.put(nums[j], cnt);
		}
	}
	int val=0;
	for(Map.Entry<Integer, Integer> mp1:mp.entrySet())
	{
		System.out.println("key "+mp1.getKey()+" "+" value "+mp1.getValue());
		if(mp1.getValue()>size)
		{
			val=mp1.getKey();
		}
	}
        return val;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElem me=new MajorityElem();
		int[] arr= {3,2,3};
		int val=me.majorityElement(arr);
		System.out.println(val);

	}

}
