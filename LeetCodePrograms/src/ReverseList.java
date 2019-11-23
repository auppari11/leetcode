
public class ReverseList {
	public ListNode head=null;
	public void insert(int data)
	{
		if(head==null)
		{
			head=new ListNode(data);
			return;
		}
		ListNode newNode= new ListNode(data);
		ListNode curr=head.getNext(),prev=head;
		while(curr!=null)
		{
			prev=curr;
			curr=curr.getNext();
		}
		prev.setNext(newNode);
		
	}
	public void print()
	{
		ListNode current=reversNode;
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
	ListNode reversNode=null;
	public ListNode reverseList(ListNode head)
	{
		ListNode current=head;
		ListNode prev=null,retnode=null,prent=null;
		char set='Y';
		if(current!=null)
		{
			ListNode next=current.getNext();
			current.setNext(prev);
			prev=current;
			current=next;
		}
//		System.out.println("val "+prev.getData());
		if(reversNode==null && head!=null)
			reversNode=new ListNode(prev.getData());
		else if(head!=null && reversNode!=null)
		{
			ListNode newnodeval=new ListNode(prev.getData());
			newnodeval.setNext(reversNode);
			reversNode=newnodeval;
		}
		if(head==null) return reversNode;
		else
			return	reverseList(current);
		 
			
			
	}
public void reverseLinkedlist(ListNode curr,ListNode[] head)
{
	if(curr==null)
	{
		return;
	}
	ListNode nxt=curr.getNext();
	if(nxt==null)
	{
		head[0]=curr;
		return;
	}
	reverseLinkedlist(nxt, head);
	nxt.setNext(curr);
	curr.setNext(null);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList rl=new ReverseList();
		rl.insert(1);
		rl.insert(2);
		rl.insert(3);
		rl.insert(9);
		rl.insert(5);
//		rl.reverseList(rl.head);
//		rl.print();
		ListNode[] ls = null;
		rl.reverseLinkedlist(rl.head, ls);
		for(int i=0;i<=ls.length-1;i++)
		{
			System.out.println(ls[i]);
		}
	}

}
