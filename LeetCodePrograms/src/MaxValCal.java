
public class MaxValCal {
public int highestVal(int arr[])
{
	int tot=0;
	int tempSum1=0,tempSum2=0;
	int first=arr[0],second=arr[1],findex=0,sindex=1;
	if(arr[0]<arr[1])
	{
		first=arr[1];
		second=arr[0];
		findex=1;
		sindex=0;
	}
	
	for(int i=2;i<=arr.length-1;i++)
	{
		if(arr[i]>first)
		{
			second=first;
			first=arr[i];
			sindex=findex;
			findex=i;
		}
		else if(arr[i]>second && arr[i]<first)
		{
			second=arr[i];
			sindex=i;
		}
	}

	int sum=0,cal=0,maxval=0,temp=arr[0];
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=sum+arr[i];
	}
	if(sum>0)
	{
		for(int j=0;j<=arr.length-1;j++)
		{
			if(arr[j]>0 && j!=arr.length-1)
			{
				for(int k=j+1;k<=arr.length-1;k++)
				{
					cal=arr[j]+arr[k]+(k-j);
					maxval=Math.max(cal, temp);
					temp=maxval;
				}				
			}
		}
	}
	tempSum1=Math.max(temp,2*first);
	tempSum2=Math.max(temp,2*second);
	tot=Math.max(tempSum1, tempSum2);
	return tot;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxValCal mv=new MaxValCal();
		int[] arr1= {1,3,-3};
		int val=mv.highestVal(arr1);
		System.out.println(val);
	}
	

}
