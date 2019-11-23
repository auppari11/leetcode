import java.util.SortedMap;
import java.util.TreeMap;

public class HouseRobbery {
//	SortedMap<Integer, Integer> sm=new TreeMap<>();
public int rob(int[] nums) {
//	if(nums.length>0)
//	{
//		if(nums.length==1)
//		{
//			return nums[0];
//		}
//		else
//		{
//	 int i=0, sum1=nums[0],sum2=nums[1], k=0,cnt=0,chk=0;
//	while(i<=nums.length-1)
//	 {
//		 System.out.println("i val "+i);
//		 if(i+2<=nums.length-1)
//		 {
//		 for(int j=i+2;j<=nums.length-1;j=j+2)
//		 {
//			 if(j+1<=nums.length-1 )
//			 {
//				 
//				 if(cnt==0)
//				 {
//				 sum1=sum1+Math.max(nums[j],nums[j+1]);
//				 }else
//				 {
//					 sum2=sum2+Math.max(nums[j],nums[j+1]);
//				 }
//				 if(nums[j]<nums[j+1])
//				 {
//					 j=j+1;
//				 }
//				 System.out.println("j val "+j);
//				 
//			 }
//			 else
//			 {
//				 if(cnt==0)
//				 {
//				 sum1=sum1+nums[j];
//				 }else
//				 {
//					 sum2=sum2+nums[j];
//				 }
//				 
//			 }
//			 if(j+2>nums.length-1 && chk==0 )
//			 {
//				 System.out.println("here");
//				 i=1;
//				 cnt=1;
//				 chk=1;
//				 break;
//			 }
//			 chk=0;
//			 
//			
//		 }
//		 if(chk==0)
//		 {
//			 i=i+2;
//		 }
//		 }
//		 else
//		 {
//			 break;
//		 }
//		 
//	 }
//	 System.out.println(sum1);
//	 System.out.println(sum2);
//	 return Math.max(sum1,sum2);
//		}
//	}
	if (nums.length==0) return 0;
	if (nums.length==1) return nums[0];
	int val=0,val1=0,val2=0;
	if(nums.length>1)
	{
		if(nums.length==2)
		{
			val=Math.max(nums[0],nums[1]);
		}
		else
		{
			val1=nums[0];
			val2=Math.max(nums[0],nums[1]);
			for(int i=2;i<=nums.length-1;i++)
			{
				val=Math.max(nums[i]+val1,val2);
				val1=val2;
				val2=val;
				
			}
		}
		
	}
	return val;
    }
/*public int getMax(int[] nums1,int str)
{
	int val=nums1[str],cnt=0;
	for(int i=str;i<=nums1.length-1;i++)
	{
		
		if(i+2<nums1.length)
		{
			if(i+3<nums1.length)
			{
				if(i+4<nums1.length)
				{
					if(nums1[i+4]>=nums1[i+2] && nums1[i+4]>=nums1[i+3])
					{
						val=val+nums1[i+2];
						i=i+1;
						cnt=1;
					}
				}
				if(nums1[i+2]>=nums1[i+3] && cnt==0)
				{			
					val=val+nums1[i+2];
					i=i+1;
					cnt=0;
				}else 
				{
					if(cnt==0)
					{
					val=val+nums1[i+3];
					i=i+2;
					cnt=0;
					}
				}
				
			}
			else
			{
				val=val+nums1[i+2];
			}
		}
	}
	return val;*/
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRobbery hr=new HouseRobbery();
		int[] nums= {2,4,8,9,9,3};
		int val=hr.rob(nums);
		System.out.println(val);
	}

}
