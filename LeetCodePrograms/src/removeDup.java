
public class removeDup {
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
	public void getNonDup()
	{
		ListNode curr=head;
		if(curr==null || curr.getNext()==null) {
			return;
		}
		ListNode curr2,prev;
		while(curr!=null)
		{
			curr2=curr.getNext();
			prev=curr;
			while(curr2!=null)
			{
				if(curr.getData()==curr2.getData())
				{
					prev.setNext(curr2.getNext());
				}
				prev=curr2;
				curr2=curr2.getNext();
			}
			curr=curr.getNext();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDup rd=new removeDup();
		rd.insertAtEnd(1);
		rd.insertAtEnd(4);
		rd.insertAtEnd(5);
		rd.insertAtEnd(2);
		rd.insertAtEnd(6);
		rd.insertAtEnd(4);
		rd.print(rd.head);
		rd.getNonDup();
		System.out.println("***************");
		rd.print(rd.head);
	}

}
