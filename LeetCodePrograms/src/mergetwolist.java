

public class mergetwolist {
public ListNode head=null,head1=null;
public ListNode mergeList(ListNode head,ListNode head1)
{
	if(head==null) return head1;
	if(head1==null) return head;
	ListNode revNode=new ListNode(0);
	if(head.getData()<=head1.getData())
	{
		revNode=head;
		revNode.setNext(mergeList(head.getNext(),head1));
	}else {
		revNode=head1;
		revNode.setNext(mergeList(head, head1.getNext()));
	}
	return revNode;
}
public ListNode getMergeListCheck(ListNode head,ListNode head1)
{
//	ListNode curr=head,curr1=head1;
	ListNode newNode=new ListNode(0);
	ListNode revNode=newNode;
	while(head!=null && head1!=null)
	{
		if(head.getData()<=head1.getData())
		{
//			if(revNode==null)			revNode=curr;
//			else
			revNode.setNext(head);
			
			head=head.getNext();
			
		}
		else
		{
//			if(revNode==null)			revNode=curr1;
//			else
			revNode.setNext(head1);
			
			head1=head1.getNext();
		}
		revNode=revNode.getNext();
	}
	if(head!=null) revNode.setNext(head);
	else if(head1!=null) revNode.setNext(head1);
	return newNode.getNext();
}
public void insert(ListNode node)
{

	if (head == null) {
		head = node;
	} else {
		ListNode temp = head;
		while (temp.getNext() != null)
			temp = temp.getNext();

		temp.setNext(node);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergetwolist ml=new mergetwolist();
		ListNode head=new ListNode(1);
		ml.insert(head);
		ml.insert(new ListNode(3));
		ml.insert(new ListNode(5));
		ml.insert(new ListNode(7));
		mergetwolist ml1=new mergetwolist();
		ListNode head1=new ListNode(2);
		ml1.insert(head1);
		ml1.insert(new ListNode(4));
		ml1.insert(new ListNode(6));
		System.out.println("first");
		ml1.print(head);
		System.out.println("second");
		ml1.print(head1);
//		ListNode l1=ml1.mergeList(head,head1);
		ListNode l1=ml1.getMergeListCheck(head,head1);
		System.out.println("merged List");
		ml1.print(l1);
	}

}
