
public class BalancedString  {
	   public int balancedStringSplit(String s) {
		   if(s.length()<=1) return 0;
		   int cnt=0,tcnt=0;
		   for(int i=0;i<=s.length()-1;i++)
		   {
			   if(s.charAt(i)=='L') cnt--;
			   else if(s.charAt(i)=='R') cnt++;
			   if(cnt==0) tcnt++;
		   }
	      return tcnt;  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedString bs=new BalancedString();
	System.out.println(bs.balancedStringSplit("LLLLRRRR"));	
	}

}
