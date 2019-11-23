
public class CountPrimes {
	
public int countPrimes(int n) {
	int cnt=0;
	boolean[] isnotPrime=new boolean[n];
	for(int i=2;i<n;i++)
	{
		if(isnotPrime[i]==false)
		{
			cnt++;
			for(int j=2;i*j<n;j++)
			{
				isnotPrime[i*j]=true;
			}
		}
	}
	
	return cnt;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimes cp = new CountPrimes();
		int val=cp.countPrimes(10);
		System.out.println(val);

	}

}
