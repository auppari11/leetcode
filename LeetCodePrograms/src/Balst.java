import java.util.HashMap;

public class Balst {
	 public int balancedString(String s) {
		 int qcnt=0,rcnt=0,ecnt=0,wcnt=0,overallcnt=0;
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 
			 if(s.charAt(i)=='Q') qcnt++;
			 else if(s.charAt(i)=='R') rcnt++;
			 else if(s.charAt(i)=='E') ecnt++;
			 else if(s.charAt(i)=='W') wcnt++;
//			 System.out.println((i+1)%4);
//			 if((i+1)%4==0) 
//				{
//				  if(qcnt>1)  overallcnt=overallcnt+(qcnt-1);
//				  if(rcnt>1)  overallcnt=overallcnt+(rcnt-1);
//				  if(ecnt>1)  overallcnt=overallcnt+(ecnt-1);
//				  if(wcnt>1)  overallcnt=overallcnt+(wcnt-1);
//				  qcnt=0;
//				  rcnt=0;
//				  ecnt=0;
//				  wcnt=0;
//				}
		 }
	      return (qcnt%4)+(rcnt%4)+(ecnt%4)+(wcnt%4);  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balst bl=new Balst();
		System.out.println(bl.balancedString("QQQQ"));
		
	}

}
