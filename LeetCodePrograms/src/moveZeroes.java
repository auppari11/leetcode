
public class moveZeroes {
	 public void moveZeroes(int[] nums) {
		 int t=nums.length-1;
		 System.out.println("here");
		 for(int i=0;i<=t;i++)
		 {
			 System.out.println(nums[i]);
			 if(nums[i]==0)
			 {
				 System.out.println("i value "+i);
				 int p=i;
				 for(int k=i+1;k<=t;k++)
				 {
					if(nums[k]!=0)
					{
						nums[p]=nums[k];
						nums[k]=0;
						System.out.println("at k "+nums[k]);
						System.out.println("at i "+nums[p]);
						p++;
					}
				 }
				 t--;
			 }
		 }
	       
		 System.out.println("after coding");
		 for(int i=0;i<=nums.length-1;i++)
		 {
			 System.out.println(nums[i]);
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZeroes mz=new moveZeroes();
		int[] nums={0,1,0,3,12};
		mz.moveZeroes(nums);
	}

}
