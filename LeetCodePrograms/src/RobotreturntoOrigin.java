
public class RobotreturntoOrigin {
	   public boolean judgeCircle(String moves) {
	        int row=0,col=0;
	        for(int i=0;i<=moves.length()-1;i++)
	        {
	        	if(moves.charAt(i)=='U') col++;
	        	if(moves.charAt(i)=='D') col--;
	        	if(moves.charAt(i)=='R') row++;
	        	if(moves.charAt(i)=='L') row--;
	        }
	        return row==0 && col==0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotreturntoOrigin ro=new RobotreturntoOrigin();
		System.out.println(ro.judgeCircle("LL"));
	}

}
