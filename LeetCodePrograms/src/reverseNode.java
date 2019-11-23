
public class reverseNode {
	ListNode head=null, headVal=null;
	public synchronized void insertAtEnd(int data)
	{
		ListNode node=new ListNode(data);
		if(head==null) head=node;
		else
		{
			ListNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q);
			p.setNext(node);
				
		}
	}
	public void print(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
public ListNode rotate(int k)
{
	if(head==null || head.getNext()==null)
		return head;
	ListNode str=head,rotateEnd=head;
	while(k-->0)
	{
		rotateEnd=rotateEnd.getNext();
		if(rotateEnd==null)
		{
			rotateEnd=head;
		}
	}
	if(str==rotateEnd)
		return head;
	while(rotateEnd.getNext()!=null)
	{
		rotateEnd=rotateEnd.getNext();
		str=str.getNext();
	}
	ListNode temp=str.getNext();
	rotateEnd.setNext(head);
	str.setNext(null);
	return temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNode fn=new reverseNode();
		fn.insertAtEnd(1);
		fn.insertAtEnd(2);
		fn.insertAtEnd(3);
		fn.insertAtEnd(4);
		fn.insertAtEnd(5);
		fn.insertAtEnd(6);
		fn.print(fn.head);
		System.out.println("******************");
		ListNode ls=fn.rotate(2);
		fn.print(ls);
		
	}

}
