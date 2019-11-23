import java.util.HashMap;

public class TwoSum {
	 public int[] twoSum(int[] numbers, int target) {
		 HashMap<Integer, Integer> mp=new HashMap<>();
		 int[] retVal=new int[2];
		 for(int i=0;i<=numbers.length-1;i++)
		 {
			 mp.put(numbers[i],i);
		 }
		 int i=0,val = 0;
		 while(i<=numbers.length-1)
		 {
			 int temp=target-numbers[i];
			 
			 if(mp.containsKey(temp)) 
				 {
				 val=mp.get(temp);
				 break;
				 }
			 else  i++;
		
		 }
		 if(i<=numbers.length-1)
		 {
	       retVal[0]=i+1;
	       retVal[1]=val+1;
		 }
	       return retVal;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoSum ts =new TwoSum();
		int[] nums= {2,7,11,15};
		int[] val;
		val= ts.twoSum(nums, 9);
		for(int i=0;i<=val.length-1;i++)
		{
			System.out.println("values "+val[i]);
		}
	}

}
