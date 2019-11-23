import java.util.HashMap;

public class HappyNumber {
	 public boolean isHappy(int n) {
		 HashMap<Integer, Integer> mp=new HashMap<>();
					return isHappyValue(n,mp);
		        
	    }
	 public boolean isHappyValue(int n,HashMap<Integer, Integer> mp)
	 {
		 if(n==1)
			{
		        return true;
			}
			else 
			{				
				int x=0,sum=0;
				if(!mp.containsKey(n))
				{
					mp.put(n,0);
					while(n>0)
				{
					System.out.println("n value "+n);
					x=n%10;
					System.out.println("x value "+x);
					n=n/10;
					sum=sum+(x*x);	
					
				}
					
					System.out.println("sum value "+sum);
					return isHappyValue(sum,mp);
				}
				else
				{
					return false;
				}
				
			}	 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumber hn=new HappyNumber();
		int n=4;
		boolean val=hn.isHappy(n);
		System.out.println(val);
	}

}
