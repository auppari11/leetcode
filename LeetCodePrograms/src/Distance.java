
public class Distance {
	  public int[] shortestToChar(String S, char C) {
		  int[] a=new int[S.length()];
	        if(S.length()==0 || (S.length()==1 && S.charAt(0)!=C)) return a;
	        int val=S.indexOf(C),val1=0;
	        System.out.println(val);
	        char chk='F';
	        int i=0,j=0;
	        while( i<=S.length()-1)
	        {
	        	if(val>=i && chk=='F')
	        	{
	        		a[j++]=val-i;
	        		if(val==i)
	        		{
	        			System.out.println(S);
		        		val1=(S.indexOf(C,val+1)==-1? i+1:S.indexOf(C,val+1))+1;	
	        		}
	        	}
	        	else
	        	{
	        		System.out.println("i va "+i+" val "+val+" val1 "+val1);
	        		if(i>val && i<=val1)
	        		{
	        			System.out.println("inside "+Math.min(i-val, val1-i));
	        			a[j++]=Math.min(i-val, val1-i);
	        			
	        			if(i==val1)
	        			{
	        				System.out.println("inside2");
	        				val=val1;
			        		val1=(S.indexOf(C,val+1)==-1? i+1:S.indexOf(C,val+1))+1;
	        			}
	        		}
	        		
	        		chk='N';
	        		
	        	}
	        	i++;
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d=new Distance();
		String s="loveleetcode";
		int[] a=new int[s.length()];
		a=d.shortestToChar(s, 'e');
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

	}

}
