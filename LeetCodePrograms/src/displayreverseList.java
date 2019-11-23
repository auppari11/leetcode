
public class displayreverseList {
	public ListNode head=null;
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
	public void print(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
	public void revrseList(ListNode head)
	{
		if(head==null) return ;
		revrseList(head.getNext());
		System.out.println(head.getData());
	}
	public int checkEvenorOdd()
	{
		ListNode check=head;
		while(check!=null && check.getNext()!=null)
		{
			check=check.getNext().getNext();
		}
		if(check==null) return 0;
		 return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayreverseList mf=new displayreverseList();
		mf.insert(1);
		mf.insert(2);
		mf.insert(3);
		mf.insert(4);
//		mf.insert(5);
		mf.print(mf.head);
		mf.revrseList(mf.head);
		System.out.println(mf.checkEvenorOdd());
	}

}
