import java.util.Map.Entry;
import java.util.TreeMap;

public class Balloon {
	  public int maxNumberOfBalloons(String text) {
		  TreeMap<Character, Integer> tm=new TreeMap<>();
//		  int minval=1;
	        for(int i=0;i<=text.length()-1;i++)
	        {
	        	if(text.charAt(i)=='b' || text.charAt(i)=='a' || text.charAt(i)=='l'||text.charAt(i)=='o'|| text.charAt(i)=='n')
	        	{
//	        		minval=Math.min(minval, tm.getOrDefault(text.charAt(i), 0)+1);
	        	tm.put(text.charAt(i), tm.getOrDefault(text.charAt(i), 0)+1);
	        	
	        	}
	        }
	        if(tm.containsKey('b') && tm.containsKey('a') && tm.containsKey('l') && tm.containsKey('o') && tm.containsKey('n')) 
	        {
	        	if(tm.get('l')>=2 && tm.get('o')>=2)
	        	{
	        		int minval=tm.get('a');
	        		for(Entry<Character, Integer> m:tm.entrySet())
	        		{
	        			minval=Math.min(minval, m.getValue());
	        		}
	        		while(minval>0)
	        		{
	        			if((tm.get('l')>=2*minval && tm.get('o')>=2*minval))
	        			{
	        				return minval;
	        			}
	        			else minval--;
	        		}
	        	}
	        	else return 0;
	        }
	        else return 0;
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon b=new Balloon();
		System.out.println(b.maxNumberOfBalloons("leetcode"));
	}

}
