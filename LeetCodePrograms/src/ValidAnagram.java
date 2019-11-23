import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ValidAnagram {
public boolean isAnagram(String s, String t) {
	if(s.length()==t.length())
	{
		if(s.length()==0)
		{
			return true;
		}
      char[] s1=s.toCharArray();
      char[] t1=t.toCharArray();
      Arrays.sort(s1);
      Arrays.sort(t1);
      for(int i=0;i<=s.length()-1;i++)
        {
     int p=s.charAt(i)-'a';
     System.out.println("here "+p);
        }
      Arrays.equals(s1, t1);
//      for(int i=0;i<=s.length()-1;i++)
//      {
//    	  System.out.println("s1 "+s1[i]);
//    	  System.out.println("t1 "+t1[i]);
//    	  if(s1[i]!=t1[i])
//    	  {
//    		  return false;
//    	  }
//      }
      return true;
    }
	else return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidAnagram va=new ValidAnagram();
		boolean val=va.isAnagram("zfzf","zfzf");
		System.out.println(val);
	}

}
