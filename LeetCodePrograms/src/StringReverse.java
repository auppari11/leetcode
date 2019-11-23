/*Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: (-2)pow 31 to (2 pow 31)-1. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

import java.math.*;
public class StringReverse {
public int reverse(int x) {
	int result=0,newresult=0,temp=0;
	        	while(x!=0)
	        	{
	        	    temp=x%10;	
	        	    System.out.println("result"+result);
	        		newresult=result*10+temp;
	        		System.out.println((newresult-temp)/10);
	        		if((newresult-temp)/10 != result)
	        		{
	        			return 0;
	        		}
	        		result=newresult;
	        			x=x/10;
	        	}

     return result;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse sr=new StringReverse();
		int t=sr.reverse(-123);
		System.out.println(t);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);

	}

}
