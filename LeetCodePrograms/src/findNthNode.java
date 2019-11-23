
public class findNthNode {
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
	public int getnthNodeVal(int k)
	{
		ListNode curr=head;
		int len=0;
		int val=0;
		while(curr!=null)
		{
			len++;
			if(len%k==0) val=curr.getData();
			curr=curr.getNext();
		}
	
		return val;
	}
	public ListNode fromEnd(int k)
	{
	 ListNode mNode=head;
	 int i=0;
	 if(k<=0) return null;
	 for(i=0;i<k;i++)
	 {
		 if(head!=null)
			 head=head.getNext();
		 else
			 return null;
	 }
	 while(head!=null)
	 {
		 mNode=mNode.getNext();
		 head=head.getNext();
	 }
	 return mNode;
	}
public int findnbyknode(int k)
{
	ListNode curr=head;
	int i=1;
	while(curr!=null)
	{
		i=i+1;
		curr=curr.getNext();
		
	}
//	if(curr.getNext()!=null) i++;
	ListNode tra=head,prev=null;
	System.out.println("len "+i/k);
	for(int j=0;j<i/k;j++)
	{
		prev=tra;
		tra=tra.getNext();
	}
	return prev.getData();
}
public ListNode fracNode(int k)
{
	ListNode frac = null;
	int i=0;
	if(k<=0)
		return null;
	for(;head!=null;head=head.getNext())
	{
		if(i%k==0)
		{
			if(frac==null)
				frac=head;
			else frac=frac.getNext();
			
		}
		i++;
	}
	return frac;
}
public void reOrderList()
{
	if(head==null)
	{
		return ;
	}
	ListNode slwptr=head,fastptr=head.getNext();
	while(fastptr!=null && fastptr.getNext()!=null)
	{
		slwptr=slwptr.getNext();
		fastptr=fastptr.getNext().getNext();
	}
	
	ListNode head2=slwptr.getNext();
//	slwptr=slwptr.getNext();
	slwptr.setNext(null);
	
	head2=reverSeList(head2.getNext());
	 mergeList(head,head2);
}
public void mergeList(ListNode head1,ListNode head2)
{
	ListNode ptr=head1;
	headVal=ptr;
	head1=head1.getNext();
	boolean nextList1=false;
	while(head1!=null || head2!=null)
	{
		if((head2!=null && !nextList1) || (head1==null))
		{
			ptr.setNext(head2);
			head2=head2.getNext();
			nextList1=true;
			ptr=ptr.getNext();
		}
		else
		{
			ptr.setNext(head1);
			head1=head1.getNext();
			nextList1=false;
			ptr=ptr.getNext();
		}
	}
}
public ListNode reverSeList(ListNode head)
{
	if(head==null) return null;
	ListNode prev=null,next=null;
	ListNode curr=head;
	while(curr!=null)
	{
		next=curr.getNext();
		curr.setNext(prev);
		prev=curr;
		curr=next;		
	}
	return prev;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findNthNode fn=new findNthNode();
		fn.insertAtEnd(1);
		fn.insertAtEnd(2);
		fn.insertAtEnd(3);
		fn.insertAtEnd(4);
		fn.insertAtEnd(5);
		fn.insertAtEnd(6);
		fn.insertAtEnd(7);
		fn.insertAtEnd(8);
		fn.insertAtEnd(9);
		fn.insertAtEnd(10);
		fn.insertAtEnd(11);
		fn.insertAtEnd(12);
//		fn.insertAtEnd(13);
//		fn.insertAtEnd(14);
//		fn.insertAtEnd(15);
//		fn.insertAtEnd(16);
//		fn.insertAtEnd(17);
//		fn.insertAtEnd(18);
//		fn.insertAtEnd(19);
		fn.print(fn.head);
//		System.out.println(fn.getnthNodeVal(4));
//		ListNode ls=fn.fromEnd(3);
		System.out.println("after this");
//		fn.print(ls);
//		System.out.println(fn.findnbyknode(4));
//		ListNode ls=fn.fracNode(4);
//		ListNode ls=fn.reverSeList(fn.head);
		fn.reOrderList();
		fn.print(fn.headVal);
		
	}

}
