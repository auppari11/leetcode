
public class sortedLinkedList {
	ListNode head=null;
	public void insert(int data)
	{
		if(head==null)
		{
			head=new ListNode(data);
			return;
		}
		ListNode curr=head,temp=null;
		ListNode newNode=new ListNode(data);
			while(curr!=null && curr.getData()<newNode.getData())
			{
				temp=curr;
				curr=curr.getNext();
			}
			newNode.setNext(curr);
			if(curr==head)
			head=newNode;
			else
				
			temp.setNext(newNode);
			
			
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
		sortedLinkedList sl=new sortedLinkedList();
		sl.insert(5);
		sl.insert(2);
		sl.insert(4);
		sl.insert(1);
		sl.insert(3);
		sl.print();
	}

}
