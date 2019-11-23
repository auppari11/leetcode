import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal<T> {

	Stack<T> s1=new Stack<>();
	Stack<T> s2=new Stack<>();
	Queue<T> q1=new LinkedList<>();
	Queue<T> q2=new LinkedList<>();
	public static Queue<Integer> reverseQueue(java.util.Queue<Integer> q)
	{
		Stack<Integer> st=new Stack<>();
		while(!q.isEmpty())
			st.push(q.remove());
		while(!st.isEmpty())
			q.add(st.pop());
		return q;
		
	}
	public void enque(T data)
	{
		s1.push(data);
	}
	public T deQueue()
	{
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public void push(T data)
	{
		if(q1.isEmpty()) q2.offer(data);
		else q1.offer(data);
	}
	public T pop()
	{
		int i=0,size;
		if(q2.isEmpty()) {
			size=q1.size();
			while(i<size-1)
			{
				q2.offer(q1.poll());
				i++;
			}
			return q1.poll();
		}else
		{
				size=q2.size();
				while(i<size-1)
				{
					q1.offer(q2.poll());
					i++;
				}
				return q2.poll();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueReversal<Integer> qr=new QueueReversal<Integer>();
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
//		q=QueueReversal.reverseQueue(q);
//		System.out.println(q);
//		qr.enque(1);
//		qr.enque(2);
//		qr.enque(3);
//		qr.deQueue();
//		System.out.println(qr.s1);
//		System.out.println("s2 "+qr.s2);
//		qr.enque(5);
//		qr.enque(6);
//		qr.deQueue();
//		System.out.println(qr.s1);
//		System.out.println("s2 "+qr.s2);
		qr.push(1);
		qr.push(2);
		qr.push(3);
		System.out.println(qr.q1);
		System.out.println(qr.q2);
		qr.pop();
		qr.push(4);
		System.out.println(qr.q1);
		System.out.println(qr.q2);
	}

}
