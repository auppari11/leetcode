import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class MedianofArray {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    double d1=0;
	    int size=nums1.length+nums2.length;
	    int[] x=new int[size];
	    for(int j=0;j<=nums1.length-1;j++)
	    {
	    	x[j]=nums1[j];
	    }

	    for(int j=0;j<=nums2.length-1;j++)
	    {
	    	x[nums1.length+j]=nums2[j];
	    }
	   Arrays.sort(x);
	   int m=(x.length-1)/2;
	   if(x.length%2==0)
	   {
		   d1=(double)(x[m]+x[m+1])/2;
	   }
	   else d1=x[m];
	   
	    return d1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums1= {1,3};
      int[] nums2= {2};
      
      MedianofArray m =new MedianofArray();
     double d= m.findMedianSortedArrays(nums1, nums2);
     System.out.println(d);
	}

}
