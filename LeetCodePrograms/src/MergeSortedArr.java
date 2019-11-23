import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArr {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> np=new ArrayList<Integer>();
        for(int i=0;i<=m-1;i++)
        {
        	np.add(nums1[i]);
        }
        for(int i=0;i<=n-1;i++)
        {
        	np.add(nums2[i]);
        }
        Collections.sort(np);
        for(int i=0;i<=np.size()-1;i++)
        {
        	nums1[i]=np.get(i);
        	System.out.println(nums1[i]);
        }
//       np.sort(nums1);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArr ms =new MergeSortedArr();
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		ms.merge(nums1,3,nums2,3);

	}

}
