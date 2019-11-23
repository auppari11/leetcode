
public class repeatedsubstring {
	 public boolean repeatedSubstringPattern(String s) {
		 if(s.length()<=1) return false;
		 /*String str="";
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 str=str+s.charAt(i);
			 if(countoccur(s,str)>1)
			 {
				 if(countoccur(s,str)*str.length()<s.length() && str.length()<(s.length()/2))
				 continue;
				 else if (countoccur(s,str)*str.length()==s.length()) return true;
				 else return false;
			 }
			 else
				 return false;
		 }
	        return false;*/
		 String str=s+s;
		 return str.substring(1, str.length()-1).contains(s);
	    }
	/* public int countoccur(String s,String str)
	 {
		 int count=0,index=0;
		 while(true)
		 {
			 index=s.indexOf(str, index);
			 if(index!=-1)
			 {
				 count++;
				 index+=str.length();
			 }else {
				 break;
			 }
		 }
		 return count;
	 }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeatedsubstring rs=new repeatedsubstring();
		System.out.println(rs.repeatedSubstringPattern("abcaabca"));
		
	}

}
