
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ArrayInter {
public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
	List<Integer> ls1=new ArrayList<>();
        if(arr1.length==0 || arr2.length==0|| arr3.length==0)
        	return ls1;
	HashMap<Integer, Integer> mp=new HashMap<>();
	for(int i=0;i<=arr1.length-1;i++)
	{
		mp.put(arr1[i],0);
	}
	for(int j=0;j<=arr2.length-1;j++)
	{
		if(mp.containsKey(arr2[j]))
		{
			mp.replace(arr2[j], 1);
		}
	}
	for(int j=0;j<=arr3.length-1;j++)
	{
		if(mp.containsKey(arr3[j]) && mp.get(arr3[j])==1)
		{
			ls1.add(arr3[j]);
		}
	}
	return ls1;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayInter ai=new ArrayInter();
    List<Integer> ls=new ArrayList<>();
    int arr1[]={1,2,3,4,5};
    int arr2[]={1,2,5,7,9};
    int arr3[]={1,3,4,5,8};
    ls=ai.arraysIntersection(arr1,arr2,arr3);
    for(int j=0;j<=ls.size()-1;j++)
    {
    	System.out.println(ls.get(j));
    }
    		}

}
