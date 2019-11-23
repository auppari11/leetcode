
import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	 public int lengthOfLongestSubstring(String s) {
		HashMap<Integer, Character> mp=new HashMap<>();	
		for(int i=0;i<=s.length()-1;i++)
		{
			if(!mp.containsKey(s.charAt(i)))
			{
				if(s.charAt(i-1)==s.charAt(i))
				{
					int top=mp.get(0);
					System.out.println("top value "+top);
					if(top==)
				}
			}
		}
//	      HashMap<Character,Integer> mp=new HashMap<>();
//	      char st[]=new char[s.length()-1] ;
////	      String newvla="";
//	      int max=0;
//	      for(int i=0, j=0;i<=s.length()-1;++i)
//	      {
//	    	  if(mp.containsKey(s.charAt(i)))
//	    	  {
//	    		  System.out.println(mp.get(s.charAt(i)));
//	    		  j=Math.max(j,mp.get(s.charAt(i))+1);
//	    		  System.out.println("i value"+i+" s.charAt(i) "+s.charAt(i)+" j "+j);
//	    	  }
//	    	  mp.put(s.charAt(i),i);
//	    	  max=Math.max(max, i-j+1);
//	    	  System.out.println("i-j+1 value"+(i-j+1)+" max  "+max );
////	    		  if((j>=1 && j<s.length()-1))
////	    		  {
////	    		  if((s.charAt(j-1)!=s.charAt(j) && s.charAt(j+1)==s.charAt(j)) )
////	    		  {
////	    			  System.out.println("check1");
////	    			st[i-1]=0; 
////	    		  }
////	    		  }
////	    	  }
//	          
//	      }
////	      for(int k=0;k<=st.length-1;k++)
////	      {
////	      newvla=newvla+st[k];
////	      }
////	      System.out.println(newvla);
////	      if(s.contains(newvla))
////	    	  
////	      {
////	    	  len=newvla.length();
////	    	  System.out.println(len);
////	      }
////	      else
////	      {
//	    	for (int p=0;p<=s.length()-1;p++)
//	    	{
//	    		System.out.println("check2 " + mp.values());
////	    		System.out.println("check2 " + mp.containsValue(i+1));
////	    		if(mp.containsValue(i) && mp.containsValue(i+1) )
////	    		{
////	    			newvla=newvla+mp.get(i)+mp.containsValue(i+1);
////	    			i++;
////	    		}
//	    	}
////	    	System.out.println(newvla);
//
////	      {
////	    	  if(newvla.charAt(i)==s.charAt(i))
////	    		  
////	    	  {
////	    		  
////	    	  }
////	      }
		 
	      
	      return str;
	    }
	 public int top()
	 {
		 return mp.
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubString ss=new LongestSubString();
		int p=ss.lengthOfLongestSubstring("babbbb");
		System.out.println(p);
	}

}
