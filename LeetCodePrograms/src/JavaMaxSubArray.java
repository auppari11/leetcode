
public class JavaMaxSubArray {

public int maxSubArray(int[] nums) {
//	int sum=0,tempsum=nums[0],K=nums.length,N=1,cnt=0,i=0,loopval=0;
//	while(K-(N-1)!=0)
//	{
//	i=0;
//	System.out.println("N value "+N);
//	for( i=0;i<=nums.length-1;i++)
//	{
//		loopval=i-1;
//		if((nums.length)-i>=K-(N-1))
//		{
//		while(cnt!=K-(N-1) && i<=nums.length-1)
//		{
//			System.out.println("i value "+i+" nums[i] value "+nums[i]);
//			System.out.println(cnt);
//		sum=sum+nums[i++];
////		i=i++;
//		cnt++;
//		}
//		System.out.println("sum "+sum);
//		if(tempsum>sum)
//		{
//			tempsum=tempsum;
//	    }
//		else
//		{
//			tempsum=sum;
//		}
//		sum=0;
//		cnt=0;
//		System.out.println("temp sum"+tempsum);
////		if(i>=nums.length-1)
////		{
////			p=i;
////		}
////		else
////		{
//			i=loopval+1;
////			continue;
////		}
//		}
//	}
//	N++;
//}
//	return tempsum;
	int maxnow=nums[0],maxall=nums[0];
	for(int i=1;i<=nums.length-1;i++)
	{
		maxnow=Math.max(nums[i],maxnow+nums[i]);
		maxall=Math.max(maxall, maxnow);
	}
     return maxall;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMaxSubArray jm=new JavaMaxSubArray();
		int[] arr= {-2,1,-3,4,-1,2,1};//,-5,4};
		int m=jm.maxSubArray(arr);
		System.out.println("final value "+m);

	}

}
