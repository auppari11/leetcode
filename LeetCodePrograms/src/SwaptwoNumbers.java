
public class SwaptwoNumbers {

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
	public ListNode swapList()
	{
		ListNode curr=head,prev=null;
		while(curr.getNext()!=null)
		{
			prev=curr;
			curr=curr.getNext();
			int temp=prev.getData();
			prev.setData(curr.getData());
			curr.setData(temp);
			if(curr.getNext()!=null)
				curr=curr.getNext();
		}
		return head;
	}
	public ListNode recSwap(ListNode head)
	{
		ListNode ptrOne=null;
		if(head==null || head.getNext()==null) return ptrOne;
		else
		{
			ptrOne = head;
			ListNode ptrTwo = head.getNext();
			ListNode ptrTwoNext = ptrTwo.getNext();
			ptrTwo.setNext(head);
			ListNode newhead = ptrTwo;
			ptrOne.setNext(recSwap(ptrTwoNext));
			return newhead;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwaptwoNumbers st=new SwaptwoNumbers();
		st.insert(1);
		st.insert(2);
		st.insert(3);
		st.insert(4);
//		st.insert(5);
		st.print(st.head);
//		ListNode ls=st.swapList();
		ListNode ls=st.recSwap(st.head);
		System.out.println("after swap");
		st.print(ls);
	}

}
