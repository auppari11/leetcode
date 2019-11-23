import java.util.HashMap;
import java.util.Map.Entry;

public class Bigram {
	public String[] findOcurrences(String text, String first, String second) {
		if(text.length()==0 )return null;
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
//		String s1=text.replace(first+" "+second, "$");
		String[] A1=text.split("\\s+");
		int k=0;
	    for(int i=0;i<=A1.length-1;i++)
	    {
//	    	System.out.println(A1[i].equalsIgnoreCase("$"));
	    	if(i+2<=A1.length-1)
	    	{
	    	if((A1[i]+" "+A1[i+1]).equalsIgnoreCase(first+" "+second))
	    	{
//	    		System.out.println("inside");
	    		hs.put(k, A1[i+2]);
	    		k++;
	    	}
	    	}
	    }
	    String[] A=new String[hs.size()];
	    for(int i=0;i<=hs.size()-1;i++)
	    {
	    	A[i]=hs.get(i);	
	    }
        return A;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bigram bg=new Bigram();
		String[] A=bg.findOcurrences("alice is a good girl she is a good student","a","good");
         for(int i=0;i<=A.length-1;i++)
         {
        	 System.out.println(A[i]);
         }
	}

}
