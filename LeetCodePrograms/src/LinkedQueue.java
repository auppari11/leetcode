
public class LinkedQueue {
	private int length;
	private ListNode front,rear;
	public LinkedQueue() {
		length=0;
		front=rear=null;
	}
public void enqueue(int data)
{
	ListNode ls=new ListNode(data);
	if(isEmpty())
	{
		front=ls;
	}else
	{
		rear.setNext(ls);
	}
	rear=ls;
	length++;
}
public void dequeue()
{
	if(isEmpty()) return;
	front=front.getNext();
	length--;
	if(isEmpty())
		rear=null;	
}
public boolean isEmpty()
{
	return length==0;
}
public String toString()
{
	String s="[";
	ListNode curr=front;
	while(curr!=null)
	{
		s=s+curr.getData()+",";
		curr=curr.getNext();
	}
	return s+"]";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue lq=new LinkedQueue();
		lq.enqueue(1);
		lq.enqueue(2);
		lq.enqueue(3);
		lq.enqueue(4);
		lq.enqueue(5);
		System.out.println(" elements "+lq.toString());
		
		
	}

}
