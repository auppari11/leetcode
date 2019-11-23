import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minabsval {
	  public List<List<Integer>> minimumAbsDifference(int[] arr) {
		  List<List<Integer>> ls=new ArrayList<>();
 	        if(arr.length<=1) return ls;
 	        Arrays.sort(arr);
 	        int minval=Math.abs(arr[1]-arr[0]);
 	        ls.add(Arrays.asList(arr[0],arr[1]));
 	        for(int i=2;i<=arr.length-1;i++)
 	        {
 	        	if(Math.abs(arr[i]-arr[i-1])==minval)
 	        	{
 	        		ls.add(Arrays.asList(arr[i-1],arr[i]));
 	        	}else if(Math.abs(arr[i]-arr[i-1])<minval)
 	        	{
 	        		minval=Math.abs(arr[i]-arr[i-1]);
 	        		ls.clear();
// 	        		while(!ls.isEmpty())
// 	        		{
// 	        			ls.remove(0);
// 	        		}
 	        		ls.add(Arrays.asList(arr[i-1],arr[i]));
 	        	}
 	        }
			return ls;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minabsval ms=new minabsval();
		int[] arr= {3,8,-10,23,19,-4,-14,27};
		System.out.println(ms.minimumAbsDifference(arr));
	}

}
