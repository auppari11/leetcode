
public class BubbleSort {

	public void sort(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs= new BubbleSort();
		int[] arr= {6,3,7,1,9};
		bs.sort(arr);
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
