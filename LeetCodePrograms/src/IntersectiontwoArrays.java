import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class IntersectiontwoArrays {
	  public int[] intersection(int[] nums1, int[] nums2) {
		  int i=0,j=0,k=0;
		  Arrays.sort(nums1);
		  Arrays.sort(nums2);
		  HashMap<Integer, Integer> mp=new HashMap<>();
		  
	        while(i<=nums1.length-1 && j<=nums2.length-1)
	        {
	        	if(nums1[i]==nums2[j])
	        	{
	        		if(!mp.containsKey(nums1[i])) mp.put(nums1[i], 1);
	        		
	        		i++;
	        		j++;
	        	}
	        	else if(nums1[i]>nums2[j]) j++;
	        	else i++;
	        	
	        }
	        int[] arr=new int[mp.size()];
	        for(Entry<Integer, Integer> m:mp.entrySet())
	        {
	        	arr[k++]=m.getKey();
	        }
	        return arr;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectiontwoArrays it=new IntersectiontwoArrays();
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		int[] val=it.intersection(nums1, nums2);
		for(int i=0;i<=val.length-1;i++)
		{
			System.out.println(val[i]);
		}
	}

}
