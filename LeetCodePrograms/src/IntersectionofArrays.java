import java.util.Arrays;

public class IntersectionofArrays {
public int[] intersect(int[] nums1, int[] nums2) {
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	int j=0,k=0;
	int[] nums3 = new int[Math.min(nums1.length,nums2.length)];
//	int minle=Math.min(nums1.length,nums2.length);
	for(int i=0;i<=Math.min(nums1.length,nums2.length);i++)
	{
		j=0;
		if(nums1.length>nums2.length) {
			while(j<=nums1.length-1)
			{
				if(nums2[i]==nums1[j]) { 
					System.out.println(nums2[i]);
					nums3[k]=nums2[i];
					k++;
					break;
					}
				else j++;
			}
			
		}
		else if(nums1.length<nums2.length) {
			while(j<=nums2.length-1)
			{
				if(nums1[i]==nums2[j]) { 
					nums3[k]=nums1[i];
					k++;
					break;
					}
				else j++;
			}
			
		}
		
	}
	return nums3;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionofArrays ia=new IntersectionofArrays();
		int[] nums1= {1,2,2,1},nums2= {2,2},nums3;
		nums3=ia.intersect(nums1, nums2);
		for(int i=0;i<=nums3.length-1;i++)
		{
			System.out.println(nums3[i]);
		}
	}

}
