import java.util.HashMap;

public class wordPattern {
	  public boolean wordPattern(String pattern, String str) {
		  if(pattern.length()==0 || str.length()==0) return false;
		  
		 HashMap< Character, String> mp=new HashMap<>();
		 String arr[]=str.split(" ");
		 System.out.println(pattern.length());
		 if(pattern.length()==arr.length)
		 {
			 for(int i=0;i<=pattern.length()-1;i++)
			 {
				 System.out.println("pattern "+pattern.charAt(i)+" arr[i] "+arr[i]);
				 System.out.println(" mp.get(pattern.charAt(i)) "+mp.get(pattern.charAt(i)));
				 if( (mp.containsKey(pattern.charAt(i)) && !mp.get(pattern.charAt(i)).equals(arr[i]))
						 || (mp.containsValue(arr[i]) && !mp.containsKey(pattern.charAt(i))))
					 return false;
				 else if(!mp.containsKey(pattern.charAt(i)))
					 mp.put(pattern.charAt(i), arr[i]);
			 }
		 }
		 else return false;
		 return true;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordPattern wp=new wordPattern();
		System.out.println(wp.wordPattern("aba","cat cat cat dog"));
	}

}
