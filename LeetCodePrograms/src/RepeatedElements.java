import java.sql.Array;
import java.util.Arrays;

public class RepeatedElements {

	 public int repeatedNTimes(int[] A) {
		 Arrays.sort(A);
        for (int i=1;i<=A.length-1;i++)
        {
        	if(A[i-1]==A[i])
        	{
        		return A[i];
        	}
        }
        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedElements re=new RepeatedElements();
		int [] n= {5,1,5,2,5,3,5,4};
		int val=re.repeatedNTimes(n);
   System.out.print(val);
	}

}
