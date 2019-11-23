import java.util.HashMap;
import java.util.Map.Entry;

public class Linearvalue {

public int singleNumber(int[] nums) {
	
        int k=0;
HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();	
for(int i=0;i<=nums.length-1;i++)
{
	if(mp.isEmpty() || !mp.containsKey(nums[i]))
	{
		mp.put(nums[i], 0);
	}
	else
	{
		mp.put(nums[i],1);
	}
}
for(Entry<Integer, Integer> mp1: mp.entrySet())
{
	if(mp1.getValue()==0)
	{
		 k= mp1.getKey();
		
	}
}
return k;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linearvalue lv=new Linearvalue();
		int[] arr= {4,1,2,1,2};
		int val=lv.singleNumber(arr);
		System.out.println(val);
		
	}

}
