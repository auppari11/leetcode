import java.util.Stack;

public class inftoPos {
	static int prec(char c)
	{
		switch(c)
				{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
				}
		return -1;
	}
public String PostFix(String infix)
{
	if(infix.length()<=2 || infix==null) return infix;
	Stack<Character> st=new Stack<>();
	String Postfix="";
	
	for(int i=0;i<=infix.length()-1;i++)
	{
		if(Character.isLetterOrDigit(infix.charAt(i)))
		{
			Postfix=Postfix+infix.charAt(i);
		}
		else if(infix.charAt(i)=='(')
		{
			st.push(infix.charAt(i));
		}
		else if(infix.charAt(i)==')')
		{
			while(!st.isEmpty() && st.peek()!='(')
				Postfix=Postfix+st.pop();
			if (!st.isEmpty() && st.peek() != '(') 
                return "Invalid Expression";                 
            else
            	st.pop(); 
		}
		else
		{
			while(!st.isEmpty() && prec(infix.charAt(i))<=prec(st.peek()))
			{
				if(st.peek() == '(') 
                    return "Invalid Expression"; 
				Postfix += st.pop(); 
			}
			st.push(infix.charAt(i));
			
		}
	}
	while(!st.isEmpty())
	{
		if(st.peek() == '(') 
            return "Invalid Expression"; 
		Postfix += st.pop(); 
	}
	return Postfix;
	
}
public int retVal(String Postfix)
{
	Stack<Integer> s=new Stack<>();
	for(char c:Postfix.toCharArray())
	{
		if(c=='+')
		{
			int op1=s.pop();
			int op2=s.pop();
			s.push(op1+op2);
		}
		else if(c=='*')
		{
			int op1=s.pop();
			int op2=s.pop();
			s.push(op1*op2);
		}
		else if(c=='/')
		{
			int op1=s.pop();
			int op2=s.pop();
			s.push(op2/op1);
		}
		else if(c=='-')
		{
			int op1=s.pop();
			int op2=s.pop();
			s.push(op2-op1);
		}
		else
		{
			s.push(Character.getNumericValue(c));
		}
	}
	return s.peek();
}
public int minStack(String s)
{
	Stack<Integer> min=new Stack<>();
	for(char c:s.toCharArray())
	{
		if(min.isEmpty())
		{
			min.push(Character.getNumericValue(c));
		}
		else
		{
			int val=Math.min(Character.getNumericValue(c), min.peek());
			if(min.peek()!=val)
				min.push(val);
		}
	}
	return min.peek();
}
public boolean PalindromeCheck(String s)
{
	if(s==null) return false;
	int low=0,high=s.length()-1;
	while(low<high)
	{
		if(s.charAt(low)==s.charAt(high)) 
		{
		low++;
		high--;
		}
		else return false;
		
	}
	if(low<high) return false;
	else
	return true;
}
public boolean PalindromStack(String s)
{
	if(s==null) return false;
	Stack<Character> st=new Stack<>();
	int enc=0;
	for(char c:s.toCharArray())
	{
		if(c=='X')
		{
			enc=1;
		}
		else if(enc==0)
		{
			st.push(c);
		}
		else if(enc==1)
		{
			if(st.pop()!=c) return false;
		}
		
	}
	return st.isEmpty();
}
public void reverseStack(Stack s)
{
	if(s.isEmpty()) return;
	int temp=(int) s.pop();
	reverseStack(s);
	insertAtBottom(s,temp);
}
public void insertAtBottom(Stack s,int data)
{
	if(s.isEmpty()) {
		s.push(data);
		return;
	}
	int temp=(int) s.pop();
	insertAtBottom(s, data);
	s.push(temp);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inftoPos ip=new inftoPos();
		System.out.println(ip.PostFix("1*2+3"));
		System.out.println(ip.retVal("12*3+"));
		System.out.println("min "+ip.minStack("2315"));
		System.out.println("pal "+ip.PalindromStack("abbXbaba"));
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		ip.reverseStack(s);
		System.out.println(s);
		
	}

}
