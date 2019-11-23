
public class myPow {
public double myPow(double x, int n) {
	if((int) x==1 || (int) x==0 ) return x;
        if(n==1)
        {
        	return x;
        }
        else if(n>1)
        {
        	if(n>2147483647) return 2147483647;
        	return x*myPow(x,n-1);
        }
        else
        	return (1/x)*myPow(x,(n)+1);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myPow mp=new myPow();
		double val=mp.myPow(1.00001, 123456);
		System.out.println(val);
	}

}
