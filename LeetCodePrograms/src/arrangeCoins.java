
public class arrangeCoins {
	   public int arrangeCoins(int n) {
//		   int cnt=1,stepcnt=0;
//		   while(n>0)
//		   {
//			   stepcnt=0;
//			   for(int i=0;i<=cnt-1 && n>0 ;i++)
//			   {
//				 stepcnt++;
//				 n--;
//			   }
//			   if(cnt==stepcnt)
//			   {
//				   cnt++;
//			   }
//			   else
//			   {
//				   return cnt-1;
//			   }
//		   }
//		   return cnt-1;
		   int i=1;
		   while(n>0)
		   {
			   if(n-i>0)
			   {
				  n= n-i;
				  i++;
				  
			   }
			   else if(n-i<0)
			   {
				   return i-1;
			   }
			   else if(n-i==0)
			   {
				   n=n-i;
				   return i;
			   }
		   }
		   return 0;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrangeCoins ac=new arrangeCoins();
		System.out.println(ac.arrangeCoins(10));
	}

}
