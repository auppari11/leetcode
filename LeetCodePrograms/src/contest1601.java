import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contest1601 {
	 public List<List<Integer>> findSolution( int z) {
	        List<List<Integer>> ls=new ArrayList<>();
	        int i=1,j=1;
	       while(i<=z && j<=z)
	       {
	    	   if(i*j==z) 
	    	   {
	    		   ls.add(Arrays.asList(i,j));
	    		   i++;
	    		   j=1;
	    	   }
	    	   else if(i*j>z)
	    	   {
	    		     i++;
	    		     j=1;
	    	   }
	    	   else 
	    	   {
	    		   j++;
	    	   }
	       }
	        return ls;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contest1601 c=new contest1601();
		System.out.println(c.findSolution(5));
	}

}
