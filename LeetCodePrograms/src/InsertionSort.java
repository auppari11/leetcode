
public class InsertionSort {

	public void insertSort(int[] arr1)
	{
		for (int i=0;i<=arr1.length-1;i++)
		{
			for (int j=i+1;j<=arr1.length-1;j++)
			{
				if(arr1[j]<=arr1[i])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
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
		InsertionSort is=new InsertionSort();
		int[] arr1= {3,7,2,9,1,11};
		is.insertSort(arr1);
		is.printArray(arr1);

	}

}
