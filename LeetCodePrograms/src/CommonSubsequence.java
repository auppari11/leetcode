
public class CommonSubsequence {
	 public int longestCommonSubsequence(String text1, String text2) {
		 if(text1==null || text2==null ) return 0;
		 int cnt=0,j=0,k=0,cnt1=0;
		 for(int i=0;i<=text1.length()-1;i++)
		 {
			 while(j<=text2.length()-1)
			 {
				 if(text1.charAt(i)==text2.charAt(j)) 
					 {
					 cnt++;
					 k=j;
					 break;
					 }
				 j++;
			 }
			 System.out.println("text1.charAt(i) "+text1.charAt(i)+" j "+j);
			 if(cnt==0) j=0;
			 else if(cnt>0 && j<=text2.length()-1)j=k+1;
			 else if(cnt>0 && j>text2.length()-1 && i<=text1.length()-1)
			 {
				 System.out.println("inside "+text1.charAt(i));
				 i--;
				 j=0;
				 cnt1=Math.max(cnt1, cnt);
				 System.out.println(cnt1);
				 cnt=0;
			 }
		 }
		 cnt1=Math.max(cnt1, cnt);
	       return cnt1; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonSubsequence cs=new CommonSubsequence();
		int val=cs.longestCommonSubsequence("abcde","ace");
		System.out.println("val "+val);
	}

}
