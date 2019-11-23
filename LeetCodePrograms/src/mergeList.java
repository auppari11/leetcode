import java.util.HashMap;

public class mergeList {
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
	public void print(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
	public void merge(ListNode head1,ListNode head)
	{
		ListNode current=head1;
		for(int i=1;i<3;i++)
		{
			current=current.getNext();
		}
		ListNode curr=head;
		for(int i=1;i<3;i++)
		{
			curr=curr.getNext();
		}
		current.setNext(curr);
	}
	public ListNode checkVal=null;
	public ListNode checkMergeList(ListNode head1,ListNode head)
	{
		ListNode curr=head1;
		HashMap<Integer, ListNode> hs=new HashMap<>();
		while(curr!=null)
		{
			hs.put(curr.getData(), curr.getNext());
			curr=curr.getNext();
		}
		ListNode curr1=head;
		while(curr1!=null)
		{
			if(hs.containsValue(curr1.getNext()))
			{
				checkVal=curr1.getNext();
				return checkVal;
			}
			curr1=curr1.getNext();
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeList ml=new mergeList();
		ml.insert(1);
		ml.insert(2);
		ml.insert(3);
		ml.insert(4);
		ml.insert(5);
		mergeList ml1=new mergeList();
		ml1.insert(6);
		ml1.insert(7);
		ml1.insert(8);
		ml1.merge(ml1.head,ml.head);
		System.out.println("node1");
		ml.print(ml.head);
		System.out.println("node2");
		ml1.print(ml1.head);
		ListNode ls=ml.checkMergeList(ml1.head,ml.head);
		System.out.println("merge start list");
		ml.print(ml.checkVal);
//		System.out.println("here "+ls);
	}

}
