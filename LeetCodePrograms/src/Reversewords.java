
public class Reversewords {
	 public String reverseWords(String s) {
		 if(s.length()<=1) return s;
		 String s1[]=s.split("\\s+");
		 for(int p=0;p<=s1.length-1;p++)
		 {
			 char[] str=s1[p].toCharArray();
			 int i=0,j=str.length-1; 
		 while(i<=j)
		 {
			 str[j]=s1[p].charAt(i);
			 str[i]=s1[p].charAt(j);
			 i++;
			 j--;
		 }
		  s1[p]=new String(str);
		 }
		 String sf="";
		 for(int k=0;k<=s1.length-1;k++)
		 {
			 if(k==s1.length-1) sf=sf+s1[k];
			 else
			 sf=sf+s1[k]+" ";
		 }
		 return sf;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversewords rs=new Reversewords();
		String p=rs.reverseWords("Let's take LeetCode contest");
		System.out.println(p);
	}

}
