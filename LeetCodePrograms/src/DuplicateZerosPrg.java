
public class DuplicateZerosPrg {
	  public void duplicateZeros(int[] arr) {
	        if(arr.length>1)
	        {
	        	System.out.println(arr.length);
	        	for(int i=0;i<=arr.length-1;i++)
	        	{
	        		System.out.println(i);
	        		if(arr[i]==0 && i!=arr.length-1)
	        		{
	        			System.out.println("check");
	        			for(int j=arr.length-1;j>=i+1;j--)
	        			{
	        				arr[j]=arr[j-1];
	        			}
	        			arr[i+1]=0;
	        			i++;
	        		}
	        		}
	        }
	        for(int m=0;m<=arr.length-1;m++)
	        {
	        	System.out.println(arr[m]);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DuplicateZerosPrg dp=new DuplicateZerosPrg();
       int arr1[]= {0,0,0,0,0,0,0};
       dp.duplicateZeros(arr1);
	}

}
