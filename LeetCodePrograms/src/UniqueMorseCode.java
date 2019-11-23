import java.util.HashMap;

public class UniqueMorseCode {
	 public int uniqueMorseRepresentations(String[] words) {
	        HashMap<Character, String> hs=new HashMap<Character, String>();
	        HashMap<String, String> hs1=new HashMap<String, String>();
	        hs.put('a',".-");	
	        hs.put('b',"-...");
	        hs.put('c',"-.-.");
	        hs.put('d',"-..");
	        hs.put('e',".");
	        hs.put('f',"..-.");
	        hs.put('g',"--.");
	        hs.put('h',"....");
	        hs.put('i',"..");
	        hs.put('j',".---");
	        hs.put('k',"-.-");
	        hs.put('l',".-..");
	        hs.put('m',"--");
	        hs.put('n',"-.");
	        hs.put('o',"---");
	        hs.put('p',".--.");
	        hs.put('q',"--.-");
	        hs.put('r',".-.");
	        hs.put('s',"..."); 
	        hs.put('t',"-");
	        hs.put('u',"..-");
	        hs.put('v',"...-");
	        hs.put('w',".--");
	        hs.put('x',"-..-");
	        hs.put('y',"-.--");
	        hs.put('z',"--..");
	        int cnt=0;
	        for(int i=0;i<=words.length-1;i++)
	        {
	        	String str=words[i],str1="";
	        	for(int j=0;j<=str.length()-1;j++)
	        	{
	        	  str1=str1+hs.get(str.charAt(j));
	        	}
	        	System.out.println(str+" "+str1);
	        	if( hs1.isEmpty() || !(hs1.containsValue(str1)))
	        			{
	        		hs1.put(str, str1);
	        		cnt++;
	        			}
	        }
	        return cnt;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueMorseCode um=new UniqueMorseCode();
		String[] words = {"gin", "zen", "gig", "msg"};
		int val=um.uniqueMorseRepresentations(words);
		System.out.println(val);
		System.out.println("val "+ g-a);
	}

}
