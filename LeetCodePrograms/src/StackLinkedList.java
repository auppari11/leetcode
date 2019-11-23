public class StackLinkedList {
public ListNode head;
public void push(int data)
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
public int pop()
{
	if(head==null) return 0;
	int val=0;
	if(head.getNext()==null) 
		{
		val=head.getData();
		head=null;
		return val;
		}
	ListNode curr=head,prev=null;
   while(curr.getNext()!=null)
   {
	prev=curr;
	curr=curr.getNext();
   }
    val=curr.getData();
    prev.setNext(null);
    return val;
   
}
public boolean isEmpty()
{
	return head==null;
}
public int peek()
{
	if(head==null) return 0;
	ListNode curr=head;
   while(curr.getNext()!=null)
   {
	curr=curr.getNext();
   }
    return curr.getData();	
}
public void print()
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
		StackLinkedList sll=new StackLinkedList();
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.push(4);
		sll.push(5);
		sll.print();
		System.out.println("popped out "+sll.pop());
		System.out.println("popped out "+sll.pop());
		System.out.println("peek element  "+sll.peek());
	}

}
