
public class Selectionsort {
public void selectionsort(int[] arr)
{
	int min=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		min=i;
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[j]<arr[min])
				min=j;
		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
}
public void printArray(int[] arr1)
{
	for(int i=0;i<=arr1.length-1;i++)
	{
		System.out.println(arr1[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {2,45,84,3,7,21};
      Selectionsort ss=new Selectionsort();
      ss.selectionsort(arr);
      ss.printArray(arr);
	}

}
