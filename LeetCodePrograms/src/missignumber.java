
public class missignumber {
	 public int missingNumber(int[] arr) {
		 if(arr.length-1<=1) return 0;
	        int diff=arr[1]-arr[0],ret=0;
	        System.out.println(arr[1]-arr[0]+"arr[0]"+arr[0]+"arr[1]"+arr[1]);
	        for(int i=2;i<=arr.length-1;i++)
	        {
	        	if(arr[i]-arr[i-1]!=diff & diff>0)
	        	{
	        		if(diff<arr[i]-arr[i-1])
	        		{
	        			ret=arr[i-1]+diff;
	        			break;
	        		}
	        		diff=arr[i]-arr[i-1];
	        		ret=arr[i-2]+diff;
	        		break;
	        		
	        	}
	        	else if(arr[i]-arr[i-1]!=diff & diff<0)
	        	{
	        		if(diff<arr[i]-arr[i-1])
	        		{
	        			diff=arr[i]-arr[i-1];
	        			ret=arr[i-2]+diff;
	        			break;
	        		}
	        		ret=arr[i-1]+diff;
	        		break;
	        		
	        	}
	        	
	        	
	        }
	        return ret;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		missignumber mn=new missignumber();
		int[] arr= {100,300,400};
		System.out.println(mn.missingNumber(arr));
	}

}
