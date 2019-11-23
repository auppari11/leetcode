
public class PrimeArrangements {
	   public void rotate(int[] nums, int k) {
		   
		   int[] arr=new int[k];
		   int val=k+1,p=nums.length-1,intval=0,i=val;
		   while(i<=p)
		   {
			   if(intval<=k-1)    
				   {
				   arr[intval++]=nums[i];
				   i++;
				   if(intval==k)
				   {
					   i=k;
					   p=0;
				   }
				   
				   }
			   else
			   {
				nums[k]=nums[i];
			   }
		   }
		   for(int j=0;j<=arr.length-1;j++)
		   {
			   nums[j]=arr[j];
		   }
		   for(int m=0;m<=arr.length-1;m++)
		   {
			   System.out.println(nums[m]);
		   }
	        
	    }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeArrangements pa=new PrimeArrangements();
		int nums[]= {1,2,3,4,5,6,7};
		pa.rotate(nums, 3);
	}

}
