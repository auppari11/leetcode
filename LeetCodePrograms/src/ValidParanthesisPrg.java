
public class ValidParanthesisPrg {
public String removeOuterParentheses(String S) {
	if(S.length()<=1) return "";
	String str="";
	int cnt=0;
	for(int i=0;i<=S.length()-1;i++)
	{
		if(S.charAt(i)=='(' && S.charAt(i+1)==')' && i<S.length()-1)
		{
			str=str+"()";
			i++;
		}
		else {
			cnt++;
		}
	}
      if(cnt>=1)	
      return str;  
      else return "";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ValidParanthesisPrg vp=new ValidParanthesisPrg();
     String str=vp.removeOuterParentheses("()())");
     System.out.println(str);
	}

}
