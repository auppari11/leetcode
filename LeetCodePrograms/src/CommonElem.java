
public class CommonElem {
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
public ListNode comon(ListNode head,ListNode head1)
{
	ListNode temp=new ListNode(0);
	ListNode newNode=temp;
	
	while(head!=null && head1!=null)
	{
		if(head.getData()==head1.getData())
		{
			newNode.setNext(new ListNode(head.getData()));
			head=head.getNext();
			head1=head1.getNext();
			newNode=newNode.getNext();
		}
		else if(head.getData()>head1.getData())
		{
			head1=head1.getNext();
		}
		else if(head.getData()<head1.getData())
		{
			head=head.getNext();
		}
	}
	return temp.getNext();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonElem ce=new CommonElem();
		ce.insertAtEnd(1);
		ce.insertAtEnd(4);
		ce.insertAtEnd(5);
		CommonElem ce1=new CommonElem();
		ce1.insertAtEnd(2);
		ce1.insertAtEnd(3);
		ce1.insertAtEnd(4);
		System.out.println("***************");
		ce.print(ce.head);
		System.out.println("***************");
		ce.print(ce1.head);
		System.out.println("***************");
		ListNode ls=ce.comon(ce.head,ce1.head);
		ce.print(ls);
	}

}
