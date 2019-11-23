import java.util.Stack;

public class JavaBrackets {
public static boolean isValid(String s) {
       Stack<Character> st=new Stack<Character>();
       for (char c:s.toCharArray())
       {
    	   System.out.println(c);
    	   if(c=='(')
    	   {
    		   st.push(')');
    		   System.out.println("check1");
    	   }
    	   else if(c=='[')
    	   {
    		   st.push(']');
    		   System.out.println("check2");
    	   }
    	   else if(c=='{')
    	   {
    		   st.push('}');
    		   System.out.println("check3");
    	   }
    	   else if(st.isEmpty() || st.pop()!=c)
    	   {
    		   System.out.println("check4");
    		   return false;
    	   }
    	   System.out.println(st.size());
       }
       System.out.println(st.size());
       return st.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     boolean val=isValid("[[]]");
     System.out.println(val);
	}

}
