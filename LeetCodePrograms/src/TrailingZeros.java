import javax.naming.InitialContext;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TrailingZeros {
	
public int trailingZeroes(int n) {
	return n==0?0:n/5+trailingZeroes(n/5);
        	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrailingZeros tz=new TrailingZeros();
		int val=tz.trailingZeroes(20);
System.out.println(val);
	}

}
