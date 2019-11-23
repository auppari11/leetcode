import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaRemoveElem {
public int removeElement(int[] nums, int val) {
	int len=0,j=nums.length-1,i=0;
//	List<Integer> aarlist=IntStream.of(nums).boxed().collect(Collectors.toList());
	if(nums.length==0 ||(nums.length==1 && nums[0]==val)) return 0;
	else if ((nums.length==1 && nums[0]!=val)) return 1;

	if(nums.length==2)
{
   if(nums[0]==val && nums[1]==val) return 0;
   else if(nums[0]==val || nums[1]==val )
	   {
	       if(nums[0]==val) nums[0]=nums[1];
	   return 1;
	   }
   else return 2;
}
	
while (i<j && nums.length>2)
{
	if(nums[i]==val)
	{
		while(nums[j]==val && j>i)
		{
			j--;
		}
		int temp=nums[j];
		nums[j]=nums[i];
		nums[i]=temp;
		j--;
		
	}
	i++;
}
for(int p=0;p<=nums.length-1;p++)
{
	System.out.println(nums[p]);
	if(nums[p]!=val)
	{
		len++;
	}
}
return len;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaRemoveElem jrm=new JavaRemoveElem();
		int[] arr= {4,5};
		int n=jrm.removeElement(arr,5);
		System.out.println("n value"+n);
	}

}
