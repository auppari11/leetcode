import java.util.Stack;

public class span {

	public int[] Span(int[] Arr)
	{
		int[] spans=new int[Arr.length];
		for(int i=0;i<=Arr.length-1;i++)
		{
			int span=1;
			int j=i-1;
			while(j>=0 && Arr[j]<=Arr[j+1])
			{
				span++;
				j--;
			}
			spans[i]=span;
		}
		return spans;
	}
	public int[] Span1(int[] Arr)
	{
		int[] spans=new int[Arr.length];
		Stack stk= new Stack();
		int p=0;
		for(int i=0;i<=Arr.length-1;i++)
		{
			while(!stk.isEmpty() && Arr[i]>Arr[(int) stk.peek()])
			{
				stk.pop();
			}
			if(stk.isEmpty())
			{
				p=-1;
			}
			else 
				p=(int) stk.peek();
			spans[i]=i-p;
			stk.push(i);
		}
		return spans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		span s=new span();
		int[] val= {6,3,4,5,2};
		int[] span=s.Span1(val);
		for(int i=0;i<=span.length-1;i++)
		{
			System.out.println(span[i]);
		}
	}

}
