
public class dividetwo {
	 public int divide(int dividend, int divisor) {
		 int val=divisor>=0 ? divisor : -1*divisor ;
		 System.out.println("Integer.MAX_VALUE "+Integer.MAX_VALUE+" Integer.MIN_VALUE "+Integer.MIN_VALUE+1);
		 if(dividend>=Integer.MAX_VALUE) dividend=Integer.MAX_VALUE;
		 else if (dividend<=Integer.MIN_VALUE) dividend=Integer.MIN_VALUE;
		 int div=dividend>=0 ? dividend : -1*dividend ;
		 int cnt=0;
		System.out.println("div val "+dividend);
		System.out.println("val val "+val);
	       while(div>=val)
	       {
	    	   System.out.println("inside");
	    	   div=div-val;
	    	   cnt++;
	       }
	       if(divisor<0 && dividend<0 ) cnt=cnt;
	       else if(divisor<0 || dividend<0 ) cnt=-1*cnt;
	       return cnt;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dividetwo dt=new dividetwo();
		int val=dt.divide(-2147483648, -1);
		System.out.println(val);
	}

}
