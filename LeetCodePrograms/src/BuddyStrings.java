import java.util.HashMap;

public class BuddyStrings {
	 public boolean buddyStrings(String A, String B) {

		 if(A.length()==0 || B.length()==0 || A.length()!=B.length())
			 return false;
		 System.out.println("len "+A.length());
		 int i=0,j=0,cnt=0,val=0,first=-1,second=-1;
//		 if(A.length()==2) 
//		 {
//			 if(A.charAt(0)==B.charAt(1) && A.charAt(1)==B.charAt(0)) return true;
//			 else return false;
//		 }
		 HashMap<Character, Integer> mp=new HashMap<>();
		 while(i<=A.length()-1)
		 {
			 if(A.charAt(i)==B.charAt(j))
			 {
				 if(mp.containsKey(A.charAt(i))) val++;
				 else mp.put(A.charAt(i), 0);
				 i++;
				 j++;
				 
			 }
			 else if(A.charAt(i)!=B.charAt(j))
			 {
				 cnt++;
				  if(first==-1) first=i;
				  else if(second==-1) second=i;
				  else return false;
					 
					i++;
					j++;
			 }
			 else
			 {
				 return false;
			 }
		 }
//		 if(val==A.length()-1 && A.length()>2) cnt=2;
//		 else if(A.length()==2 && cnt==2) val=1;
		
		 System.out.println(A.charAt(first) +" "+B.charAt(second)+" "+first+" "+second);
		 System.out.println(A.charAt(second)+" "+B.charAt(first));
		 if(cnt==2 && (A.charAt(first)==B.charAt(second) && B.charAt(first)==A.charAt(second)))
			 System.out.println("HI");
	        return  (val>1) || (cnt==2 && A.charAt(first)==B.charAt(second) && B.charAt(first)==A.charAt(second));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyStrings bs=new BuddyStrings();
		System.out.println(bs.buddyStrings("ab","ca"));

	}

}
