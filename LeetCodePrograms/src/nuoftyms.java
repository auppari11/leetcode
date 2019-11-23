
public class nuoftyms {
	 public int repeatedStringMatch(String A, String B) {
		 int cnt=1,n=A.length(),p=B.length()+2*n;
		 System.out.println(p);
	        while(!A.contains(B) && A.length()>0 && B.length()>0)
	        {
	        	A=A+A;
	        	cnt++;
	        	if(A.length()<=p && A.contains(B)) return cnt;
	        	else if(A.length()>p && (!A.contains(B))) break;
	        }
	        if(A.contains(B)) return 1;
	        return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nuoftyms nt=new nuoftyms();
		System.out.println(nt.repeatedStringMatch("abc","cabcabca"));
	}

}
