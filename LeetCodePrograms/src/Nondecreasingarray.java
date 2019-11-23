
public class Nondecreasingarray {

	 public boolean checkPossibility(int[] nums) {
	       int cnt=0;
	       for(int i=1;i<=nums.length-1 && cnt<=1;i++)
	       {
	    	   
	    		   if(nums[i-1]>nums[i])
	    		   {
	    			   cnt++;
	    			   
	    				if(i-2<0 || nums[i-2]<=nums[i])  
	    			   nums[i-1]=nums[i];
	    				else 
	    			  nums[i]=nums[i-1];
	    		   }
	    		   
	       }
	      return cnt<=1;
//	        	for(int i=0;i<=nums.length-1;i++)
//	        	{
////	        		System.out.println(i);
//	        		if(i+1<=nums.length-1)
//	        		{
//	        			System.out.println("Here");
//	        			if(nums[i]+1!=nums[i+1])
//	        			{
//	        				cnt++;
//	        			}
//	        			System.out.println("cnt "+cnt);
//	        			if(cnt==1 && chk2==0)
//	        			{
//	        				p=i;
//	        				chk2++;
//	        			}
//	        			if(cnt==2 && chk==0)
//	        			{
//	        				System.out.println(nums[i+1]-nums[i-1]);
//	        				if(nums[i+1]-nums[i-1]!=2 && ((nums[i+1]>=0 && nums[i-1]>=0)||(nums[i+1]<0 && nums[i-1]<0)))
//	        				{
//	        					return false;
//	        				}
//	        				else if(nums[i+1]-nums[i-1]!=3 && ((nums[i+1]>=0 && nums[i-1]<0)))
//	        				{
//	        					return false;
//	        				}
//	        				else
//	        					chk++;
//	        			}
//	        		}
//	        		
//	        	}
//	        	System.out.println(p);
//	        	if(cnt==1 && (p==0 || p+1==nums.length-1))
//	        	{
//	        		System.out.println("hr2");
//	        		return true;
//	        	}
//	        	else if (cnt==1)
//	        	{
//	        		return false;
//	        	}
//	        	return true;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nondecreasingarray na=new Nondecreasingarray();
		int nums[]= {2,3,3,2,4};
		boolean val=na.checkPossibility(nums);
		System.out.println(val);
	}

}
