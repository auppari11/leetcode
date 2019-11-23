
public class repeatedstringmatch {
	public int repeatedStringMatch(String A, String B) {
        int cnt=1;
        String val=A;
	        while(!A.contains(B) && A.length()>0 && B.length()>0)
	        {
	        	A=A+val;
	        	cnt=cnt+1;
                System.out.println(A);
	        	if(A.length()<=2*B.length() && A.contains(B)) return cnt;
	        	else if(A.length()>=2*B.length() && (!A.contains(B))) break;
	        }
        if(A.contains(B)) return 1;
	        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeatedstringmatch rs=new repeatedstringmatch();
		System.out.println(rs.repeatedStringMatch("a","aa"));

	}

}
