import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
	  public String toGoatLatin(String S) {
	        String[] arr=S.split(" ");
	     Set<Character> s=new HashSet<>();
	     s.add('a');
	     s.add('e');
	     s.add('i');
	     s.add('o');
	     s.add('u');
	    
	       for(int i=0;i<=arr.length-1;i++)
	       {
	    	   String val=arr[i];
	    		   if(s.contains(Character.toLowerCase(val.charAt(0))))
	    		   {
	    			 val=val+"ma";
	    		   }
	    		   else if(!s.contains(Character.toLowerCase(val.charAt(0))))
	    		   {
	    			   val=val+val.charAt(0)+"ma";
	    			   val=val.substring(1, val.length());
	    			  
	    		   }
	    		   int j=1;
	    		 while(j<=i+1)
	    		 {
	    			val=val+"a";
	    			j++;
	    		 }
	    		 arr[i]=val;
	       	}  
	       return String.join(" ", arr);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoatLatin gl=new GoatLatin();
		System.out.println(gl.toGoatLatin("I speak Goat Latin"));
	}

}
