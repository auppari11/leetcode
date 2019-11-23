
public class reverseKNodes {
	ListNode head=null;
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
	public static ListNode reversKNodes(ListNode head,int k)
	{
		ListNode curr=head;
		ListNode next=null;
		ListNode prev=null;
		int cnt=k;
		while(curr!=null && cnt>0)
		{
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
			cnt--;
		}
		if(next!=null)
			head.setNext(reversKNodes(next, k));
		
		return prev;
	}
public ListNode nonrecswapNode(ListNode head,int k)
{
	ListNode curr=head;
	ListNode prevTail=null;
	ListNode prevCurr=head;
	while(curr!=null)
	{
		int cnt=k;
		ListNode tail=null;
				while(curr!=null && cnt>0)
				{
					ListNode next=curr.getNext();
					curr.setNext(tail);
					tail=curr;
					curr=next;
					cnt--;
				}
	
	if(prevTail!=null)
		prevTail.setNext(tail);
	else
		head=tail;
	prevTail=prevCurr;
	prevCurr=curr;
	}
	return head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseKNodes cp=new reverseKNodes();
		cp.insertAtEnd(1);
		cp.insertAtEnd(2);
		cp.insertAtEnd(3);
//		cp.insertAtEnd(3);
		cp.insertAtEnd(4);
		cp.insertAtEnd(5);
		cp.insertAtEnd(6);
		cp.insertAtEnd(7);
		
		cp.insertAtEnd(8);
		cp.insertAtEnd(9);
		cp.insertAtEnd(10);
		cp.insertAtEnd(11);
		cp.insertAtEnd(12);
//		ListNode ls=cp.reversKNodes(cp.head, 4);
		ListNode ls=cp.nonrecswapNode(cp.head,4);
		cp.print(ls);
	}

}
