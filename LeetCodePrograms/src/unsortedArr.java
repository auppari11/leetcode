import java.util.ArrayList;
import java.util.HashMap;

public class unsortedArr {
	public int findUnsortedSubarray(int[] nums) {
		   if(nums.length<=1) return 0;
		   int temp=0,temp1=0,strloop=0,p=0;
		   ArrayList<Integer> al=new ArrayList<>();
		   HashMap<Integer, Integer> mp=new HashMap<>();
		   for(int i=1;i<=nums.length-1;i++)
		   {
			   if(nums[i]<nums[i-1] ) 
				   {
				     if(temp==0) 
				    	 {
				    	  temp+=2;
				    	  mp.put(i, nums[i]);
				    	  mp.put(i-1, nums[i-1]);
				    	  strloop=1;
				    	 }
				     else
				     {
				    	 temp++;
				    	 mp.put(i, nums[i]);
				    	 if(temp1>=0)
				    	 {
//				    		 temp=temp1+temp;
				    		 for(int j=0;j<=al.size()-1;j++)
				    		 {
				    			 mp.put(al.get(j),nums[al.get(j)]);
				    			 al.remove(al.get(j));
				    		 }
//				    		 temp1=0;
				    	 }
				    	 strloop=0;
				    	
				     }
				   }
			   else if(strloop==1 || mp.containsValue(nums[i]))
			   {
				   temp1++;
				   al.add(i);
				   
			   }
				   
			   
		   }
		   return temp+temp1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unsortedArr ua=new unsortedArr();
		int[] nums= {1,3,2,3,3};
		System.out.println(ua.findUnsortedSubarray(nums));
	}

}
