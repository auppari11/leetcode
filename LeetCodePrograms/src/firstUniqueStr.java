import java.util.HashMap;

public class firstUniqueStr {
	 public int firstUniqChar(String s) {
		 if(s.length()==0) return -1;
		 HashMap<Character, Integer> mp=new HashMap<>();
		int cnt=1;
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 if(!mp.containsKey(s.charAt(i)) && (i+1)<=s.length()-1)
			 {
				for(int j=i+1;j<=s.length()-1;j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						cnt++;
					}
				}
				if(cnt==1)
				{
					return i;
				}
				else
				{
					mp.put(s.charAt(i),i);
					cnt=1;
				}
			 }
			 if(i==s.length()-1 && !mp.containsKey(s.charAt(i)))
			 {
				 return i;
			 }
				 
		 }	 
		 return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstUniqueStr fu=new firstUniqueStr();
		int val=fu.firstUniqChar("leetlcode");
		System.out.println(val);
	}

}
