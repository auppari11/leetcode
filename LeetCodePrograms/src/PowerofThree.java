import java.util.HashMap;

public class PowerofThree {
	public boolean isPowerOfThree(int n) {
		
		if(n<=0) return false;
		
		while(n>0)
		{
			if(n==1)
			{
				return true;
			}
			else if(n%3!=0)
				return false;
			else
				n=n/3;
		}
		return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerofThree pt=new PowerofThree();
		boolean b=pt.isPowerOfThree(-3);
		System.out.print(b);
	}

}
