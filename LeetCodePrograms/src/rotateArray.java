
public class rotateArray {
	public void rotate(int[] nums, int k) {
		for(int i=1;i<=k;i++)
		{
			int temp=nums[nums.length-1];
			int j=nums.length-2;
			while(j>=0)
			{
				nums[j+1]=nums[j];
				j--;
			}
			nums[0]=temp;
		}
		
	for(int i=0;i<=nums.length-1;i++)
	{
		System.out.println(nums[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateArray ra=new rotateArray();
		int[] nums= {1,2};
		ra.rotate(nums, 3);
	}

}
