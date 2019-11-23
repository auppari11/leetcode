import java.util.Stack;

public class BalanceSymbols {
	public boolean isValid(String s)
	{
		if(s.length()==0||s==null) return true;
	Stack<Character> sk=new Stack<>();
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)=='(')
		{
			sk.push(s.charAt(i));
		}
		else if(s.charAt(i)==')')
		{
			while(sk.peek()!='(')
			{
				sk.pop();
			}
			sk.pop();
		}else sk.push(s.charAt(i));
		
	}
	return sk.size()==0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalanceSymbols b=new BalanceSymbols();
		System.out.println(b.isValid("(AB(C)"));
	}

}
