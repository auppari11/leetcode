
public class HeapSort {
	public void sort(int arr[])
	{
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapSort(arr,n,i);
		}
		for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapSort(arr, i, 0); 
        }
		
	}
	public void heapSort(int[] arr,int n,int i )
	{
		int largest;
		while (i<=arr.length-1 && (2*i+1)<=arr.length-1 && (2*i+2)<=arr.length-1)
		{
			int l=2*i+1;
			int r=2*i+2;
			if(arr[2*i+1]>arr[2*i+2] )
			{
				largest=l;
			}
			else
			{
				largest=r;
			}
				
			if(arr[i]<arr[largest])
			{
				int temp=arr[i];
				arr[i]=arr[largest];
				arr[largest]=temp;
				heapSort(arr,n,largest);
			}
			i++;
			
		}
	}

	public void printArray(int[] arr)
	{
		for (int n=0;n<=arr.length-1;n++)
		{
			System.out.println(arr[n]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,11,13,5,6,7,84};
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);

	}

}
