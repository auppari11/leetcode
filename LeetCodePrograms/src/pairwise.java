import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class pairwise {
public static boolean checkStackPairwise(Stack<Integer> s)
{
	Queue<Integer> q=new LinkedList<Integer>();
	boolean pairwise=true;
	while(!s.isEmpty())
	{
		q.add(s.pop());
	}
	while(!q.isEmpty())
	{
		s.push(q.remove());
	}
	while(!s.isEmpty())
	{
		int n=s.pop();
		q.add(n);
		if(!s.isEmpty())
		{
			int m=s.pop();
			q.add(m);
			if(Math.abs(n-m)!=1)
			{
				pairwise=false;
			}
		}
	}
	while(!q.isEmpty())
		s.push(q.remove());
	
	return pairwise;
}
public Queue<Integer> splitandAdd(Queue<Integer> q)
{
	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	int rear=0;
	int len=q.size()/2;
	int i=0;
	while(i<=len-1)
	{
		q1.add(q.remove());
		i++;
	}
	while(!q1.isEmpty() && !q.isEmpty())
	{
		q2.add(q1.remove());
		q2.add(q.remove());
	}
	while(!q1.isEmpty())
	{
		q2.add(q1.remove());
	}
	while(!q.isEmpty())
	{
		q2.add(q.remove());
	}
	return q2;
}
public Queue<Integer> reversefewEle(Queue<Integer> q,int k)
{
	Stack<Integer> s=new Stack<>();
	Queue<Integer> q1=new LinkedList<>();
	for(int i=0;i<k;i++)
	{
		s.push(q.remove());
	}
	while(!s.isEmpty())
	{
		q1.add(s.pop());
	}
	while(!q.isEmpty())
	{
		q1.add(q.remove());
	}
	return q1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pairwise pw=new pairwise();
//		Stack<Integer> s=new Stack<>();
//		s.push(4);
//		s.push(5);
//		s.push(-2);
//		s.push(-3);
//		s.push(11);
//		s.push(7);
//		s.push(5);
//		s.push(6);
//		s.push(20);
//		System.out.println(pw.checkStackPairwise(s));
		Queue<Integer> q=new LinkedList<>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
//		System.out.println(pw.splitandAdd(q));
		System.out.println(pw.reversefewEle(q, 4));
	}

}
