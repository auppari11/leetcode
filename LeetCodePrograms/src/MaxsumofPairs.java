import java.util.Arrays;

public class MaxsumofPairs {
	 public int arrayPairSum(int[] nums) {
		 int temp=0;
		 Arrays.sort(nums);
		 for(int i=0;i<=nums.length-1;i=i+2)
		 {
			 temp=temp+Math.min(nums[i],nums[i+1]);
		 }
	     return temp;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxsumofPairs mp=new MaxsumofPairs();
		int nums[]= {1,4,3,2};
		int val=mp.arrayPairSum(nums);
		System.out.println("val "+ val);
	}

}
