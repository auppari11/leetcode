import java.util.Arrays;

public class FirstMissingPositive {

public int firstMissingPositive(int[] nums) {
	Arrays.sort(nums);
	int min=1,i=0;
    while(i<=nums.length-1)
    {
    	if(nums[i]>0)
    	{
    		System.out.println("here "+i);
    		if(i<nums.length-1)
    		{
    		while(nums[i]==nums[i+1] && (i+1)<nums.length-1) 
    		{
    			System.out.println(i);
    			i++;
    		}
    		}
    			
    		System.out.println("after "+i);
    		if(nums[i]==min)
    		{
    			min++;
    		}
    		else break;
    	}
    	if(i==nums.length-1)
    	{
    		return min;
    	}
    	i++;
    }
    return min;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingPositive fmp=new FirstMissingPositive();
		int[] arr= {7,8,9,11,12};
		int m=fmp.firstMissingPositive(arr);
		System.out.println(m);
	}

}
