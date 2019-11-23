
public class StepsClimb {
	 public int climbStairs(int n) {
	       if(n==2 || n==1 || n==0)
	    	   return n;
	       else 
	    	   return climbStairs(n-1)+climbStairs(n-2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StepsClimb sc=new StepsClimb();
         int val=sc.climbStairs(8);
         System.out.println(val);
	}

}