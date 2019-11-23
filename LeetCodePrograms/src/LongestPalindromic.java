
public class LongestPalindromic {
public String longestPalindrome(String s) {
        String m="",retval="";
        if(s=="")
        {
        	return "";
        }
       
        for(int i=s.length()-1;i>=0;i--)
        {
        	m=m+s.charAt(i);
        }
        System.out.println(m);
        int i=0;
       if(m.equals(s))
       {
    	   retval=m; 
       }
       else
       {
       for(i=0;i<=s.length()-1;i++)
       {
        	int j=m.indexOf(s.charAt(i));
        	System.out.println("j value "+j+" ");
        	System.out.println("i value "+i+" ");
        	 if((j+1)<=m.length()-1 && (i+1)<=s.length()-1)
        	 {
        		 if(m.charAt(j+1)==s.charAt(i+1))
        		 {
        		 for(int k=j;k<=m.length()-1;k++)
        		 {
        			 System.out.println("k value "+k+" "+m.charAt(k));
        			 System.out.println(s.length()-1);
        			 System.out.println("i value "+i+" "+s.charAt(i));
        			if(m.charAt(k)==s.charAt(i))
        			{
        			retval=retval+m.charAt(k); 
        			if(i<s.length()-1)
        			{	
        				
        			 i++;
        			 System.out.println("i here "+i);
        			}
        			else
        			{
        				break;
        			}
        			}
        			else
        			{
        				break;
        			}
        		 }
        		 }
        	 }
        }
       }
       if(retval=="")
       {
    	   retval=retval+s.charAt(0);
       }
       return retval;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestPalindromic lp=new LongestPalindromic();
		String p=lp.longestPalindrome("");
		System.out.println(p);
	}

}
