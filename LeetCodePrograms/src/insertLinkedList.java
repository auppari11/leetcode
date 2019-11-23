
public class insertLinkedList {
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
public ListNode insertSort()
{
	if(head==null || head.getNext()==null) return null;
	ListNode newHead=new ListNode(head.getData());
	ListNode ptr=head.getNext();
	while(ptr!=null)
	{
		ListNode innerptr=newHead;
		ListNode next=ptr.getNext();
		if(ptr.getData()<=newHead.getData())
		{
			ListNode oldHead=newHead;
			newHead=ptr;
			newHead.setNext(oldHead);
		}else
		{
			while(innerptr.getNext()!=null)
			{
				if(ptr.getData()>innerptr.getData() && ptr.getData()<=innerptr.getNext().getData())
				{
					ListNode oldNxt=innerptr.getNext();
					innerptr.setNext(ptr);
					ptr.setNext(oldNxt);
				}
				innerptr=innerptr.getNext();
			}
			if(innerptr.getNext()==null && ptr.getData()>innerptr.getData())
			{
				innerptr.setNext(ptr);
				ptr.setNext(null);
			}
		}
		ptr=next;
			
	}
	return newHead;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertLinkedList il=new insertLinkedList();
		il.insertAtEnd(5);
		il.insertAtEnd(9);
		il.insertAtEnd(2);
		il.insertAtEnd(6);
		il.insertAtEnd(1);
		il.insertAtEnd(4);
		il.insertAtEnd(10);
		il.insertAtEnd(7);
		il.insertAtEnd(8);
		il.insertAtEnd(3);
		il.print(il.head);
		ListNode ls=il.insertSort();
		System.out.println("************************");
		il.print(ls);
	}

}
