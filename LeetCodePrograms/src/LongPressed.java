
public class LongPressed {
	 public boolean isLongPressedName(String name, String typed) {
	     if(name.length()<=0 || typed.length()<=0 || name.length()>typed.length()) return false;
	     int val1cnt=0,j=0;
	     for(int i=0;i<=name.length()-1;i++)
	     {
	    	 val1cnt=1;
	    	 while(i+1<=name.length()-1)
	    	 {
	    		 
	    		 if(name.charAt(i)==name.charAt(i+1))
	    		 {
	    			 val1cnt++;
		                i++;
	    		 }
		                else break;
	    	 }
	    	 int p=0;
	    	 while(j<=typed.length()-1)
	    	 {
	    		 if(p==0 && name.charAt(i)!=typed.charAt(j))
	    		 {
	    			 return false;
	    		 }
	    		 else if(name.charAt(i)==typed.charAt(j))
		         {
		                j++;
		                p++;
		         }
	    		 else if (name.charAt(i)!=typed.charAt(j))
		                break;
	    	 }
	    	 System.out.println("i "+name.charAt(i));
	    	 System.out.println("p "+p);
	    	 System.out.println("val1cnt "+val1cnt);
	    	 if(p<val1cnt) return false;
	     }
	     if(j!=typed.length()) return false;
//	        int j=0;
//	        for(int i=0;i<=name.length()-1;i++)
//	        {
//	            int p=0;
//	            while(j<=typed.length()-1)
//	            {
//	                if(p==0 && name.charAt(i)!=typed.charAt(j))
//	                {
//	                // System.out.println("i val "+i);
//	                return false;
//	                }
//	                else if(name.charAt(i)==typed.charAt(j))
//	                {
//	                j++;
//	                p++;
//	                }
//	                else if (name.charAt(i)!=typed.charAt(j))
//	                break;
//	            }
//	            while(i+1<=name.length()-1)
//	            {
//	                if(name.charAt(i)==name.charAt(i+1))
//	                i++;
//	                else break;
//	            }
//	        }
//	        // System.out.println("j val "+j+" typed.length() "+typed.length());
//	        if(j!=typed.length()) return false;
	     return true;   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongPressed lp=new LongPressed();
		boolean val=lp.isLongPressedName("laiden", "laiden");
		System.out.println("val "+val);

	}

}
