
public class AddList {
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
	public ListNode retAddList(ListNode head,ListNode head1)
	{
		
		if(head==null) return head1;
		else if(head1==null) return head;
		int cary=0;
		ListNode newNode=new ListNode(0);
		ListNode curr=newNode;
		while(head!=null && head1!=null)
		{
			int sum=head.getData()+head1.getData()+cary;
			cary=sum/10;
			sum=sum%10;
			curr.setNext(new ListNode(sum));
			curr=curr.getNext();
			head=head.getNext();
			head1=head1.getNext();
			
		}
		if(head!=null)
		{
			if(cary!=0)
			{
				curr.setNext(retAddList(head, new ListNode(cary)));
			}
			else
				curr.setNext(head);
		}else if(head1!=null)
		{
			if(cary!=0)
			{
				curr.setNext(retAddList(head1, new ListNode(cary)));
			}
			else
				curr.setNext(head1);
		}else if(cary!=0)
		{
			curr.setNext(new ListNode(0));
		}
			
		return newNode.getNext();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddList al=new AddList();
		al.insertAtEnd(3);
		al.insertAtEnd(4);
		al.insertAtEnd(3);
		AddList al1=new AddList();
		al1.insertAtEnd(5);
		al1.insertAtEnd(6);
		al1.insertAtEnd(4);
		System.out.println("first");
		al.print(al.head);
		System.out.println("second");
		al1.print(al1.head);
		ListNode ls=al.retAddList(al.head, al1.head);
		System.out.println("************");
		al1.print(ls);
	}

}
