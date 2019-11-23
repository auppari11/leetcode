import java.util.Arrays;
import java.util.HashMap;

public class uniqueo {

	    public boolean uniqueOccurrences(int[] arr) {
	        if(arr.length==0) return true;
	        HashMap<Integer,Integer> mp=new HashMap<>();
	        Arrays.sort(arr);
	        for(int i=0;i<=arr.length-1;i++)
	        {
	            int count=1;
	            for (int j=i+1;j<=arr.length-1;j++)
	            {
	                if(!(mp.containsValue(arr[j])) && arr[j]==arr[i])
	                {
	                    count++;
	                    
	                }
	            }
	            
	            	System.out.println("count "+ count +" "+arr[i] );
	            if(!(mp.isEmpty()) &&  !mp.containsValue(arr[i]))
	                {
	                	if(mp.containsKey(count))
	                				return false;
	                	else
	    	            {
	    	                mp.put(count,arr[i]);
	    	            }
	                }
	                	else if(mp.isEmpty())
	                	{
	                		 mp.put(count,arr[i]);
	                	}
	            
	                
	            
	        }
	        
	        return true;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueo uq=new uniqueo();
		int[] arr= {-3,0,1,-3,1,1,1,-3,10,0};
		boolean val=uq.uniqueOccurrences(arr);
		System.out.println(val);
	}

}
