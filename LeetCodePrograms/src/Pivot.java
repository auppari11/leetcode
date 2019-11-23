
public class Pivot {
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
	public ListNode rotList(int k)
	{
		ListNode root=new ListNode(0);
		ListNode pivot=new ListNode(k);
		ListNode rootnxt=root,pivotnxt=pivot;
		ListNode curr=head;
		while(curr!=null)
		{
			ListNode nxt=curr.getNext();
			if(curr.getData()>=k)
			{
				pivotnxt.setNext(curr);
				pivotnxt=curr;
				pivotnxt.setNext(null);
			}else {
				rootnxt.setNext(curr);
				rootnxt=curr;
			}
			curr=nxt;
			
		}
		rootnxt.setNext(pivot.getNext());
		return root.getNext();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pivot p=new Pivot();
		p.insertAtEnd(1);
		p.insertAtEnd(4);
		p.insertAtEnd(3);
		p.insertAtEnd(2);
		p.insertAtEnd(5);
		p.insertAtEnd(2);
		p.print(p.head);
		ListNode ls=p.rotList(3);
		System.out.println("***********");
		p.print(ls);
	}

}
