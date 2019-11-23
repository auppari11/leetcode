import java.util.Stack;

public class MaxHist {
public int MaxRect(int[] A)
{
	Stack<Integer> s=new Stack<>();
	if(A==null ||A.length==0)
	{
		return 0;
	}
	int maxarea=0;
	int i=0;
	while(i<A.length)
	{
		if(s.isEmpty() || A[s.peek()]<=A[i])
		{
			s.push(i++);
		}
		else {
			int top=s.pop();
			maxarea=Math.max(maxarea, A[top]*(s.isEmpty()?i:i-s.peek()-1));
		}
	}
	while(!s.isEmpty())
	{
		int top=s.pop();
		maxarea=Math.max(maxarea, A[top]*(s.isEmpty()?i:i-s.peek()-1));
	}
	return maxarea;
}
public Stack<Integer> sort(Stack<Integer> stk)
{
	Stack<Integer> rstk=new Stack<>();
	while(!stk.isEmpty())
	{
		int tmp=stk.pop();
		while(!rstk.isEmpty() && rstk.peek()>tmp)
		{
			stk.push(rstk.pop());
		}
		rstk.push(tmp);
	}
	return rstk;
}
public int removeAdj(int[] A)
{
	int stkptr=-1;
	int i=0;
	while(i<A.length)
	{
		if(stkptr==-1 || A[stkptr]!=A[i])
		{
			stkptr++;
			A[stkptr]=A[i];
			i++;
		}else {
			while(i<A.length && A[stkptr]==A[i])
			i++;
				stkptr--;
				
		}
	}
//	for(int j=0;j<=A.length-1;j++)
//	{
//		System.out.println(A[j]);
//	}
	return stkptr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHist mh=new MaxHist();
		int[] val= {3,2,5,6,7,4,4};
//		int[] val={1,5,6,8,8,8,0,1,1,0,6,5,2};
		Stack<Integer> st=new Stack<>();
		st.push(5);
		st.push(9);
		st.push(2);
		st.push(4);
		st.push(1);
//		int index=mh.removeAdj(val);
		System.out.println(mh.MaxRect(val));
//		System.out.println(mh.sort(st));
//		for(int i=0;i<=index;i++)
//		{
//			System.out.println(val[i]);
//		}
	}

}
