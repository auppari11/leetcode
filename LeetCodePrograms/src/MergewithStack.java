import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class MergewithStack {
	public ListNode head=null,retnode=null,arret=null;
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
	public ListNode mergeList1(ListNode head,ListNode head1)
	{
		ListNode curr=head;
		Stack<ListNode> ls=new Stack<>();
		while(curr.getNext()!=null)
		{
			ls.add(curr.getNext());
			curr=curr.getNext();
		}
		ListNode curr1=head1;
		Stack<ListNode> ls1=new Stack<>();
		while(curr1.getNext()!=null)
		{
			ls1.add(curr1.getNext());
			curr1=curr1.getNext();
		}
//		ListNode val=null;
		while(ls.peek()==ls1.peek())
		{
			retnode=ls.pop();
			ls1.pop();
		}
		
		return retnode;
			
	}
	public ListNode getMergeNum(ListNode head,ListNode head1)
	{
		ListNode curr=head;
		List<ListNode> ls=new ArrayList<ListNode>();
		
		while(curr.getNext()!=null)
		{
			ls.add(curr.getNext());
			curr=curr.getNext();
		}
		ListNode curr1=head1;
		while(curr1.getNext()!=null)
		{
			ls.add(curr1.getNext());
			curr1=curr1.getNext();
		}
		for(int i=0;i<=ls.size()-1;i++)
		{
			for(int j=i+1;j<=ls.size()-1;j++)
			{
				if(ls.get(i)==ls.get(j)) return ls.get(i);
			}
		}
		return null;
	}
	public ListNode getMergeList(ListNode head,ListNode head1)
	{
		ListNode curr=head,curr1=head1,list1=null,list2=null;
		int l1=0,l2=0,diff=0;
		
		while(curr.getNext()!=null)
		{
			curr=curr.getNext();
			l1++;
		}
		while(curr1.getNext()!=null)
		{
			curr1=curr1.getNext();
			l2++;
		}
		if(l1>l2)
		{
			list1=head;
			list2=head1;
			diff=l1-l2;
		}else
		{
			list1=head1;
			list2=head;
			diff=l2-l1;			
		}
		for(int i=0;i<diff;i++)
			list1=list1.getNext();
		
		while(list1!=null && list2!=null)
		{
			if(list1==list2) return list1;
			list1=list1.getNext();
			list2=list2.getNext();
		}
		
	return null;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergewithStack ml=new MergewithStack();
		ml.insert(1);
		ml.insert(2);
		ml.insert(3);
		ml.insert(4);
		ml.insert(5);
		MergewithStack ml1=new MergewithStack();
		ml1.insert(6);
		ml1.insert(7);
		ml1.insert(8);
		ml1.merge(ml1.head,ml.head);
		System.out.println("node1");
		ml.print(ml.head);
		System.out.println("node2");
		ml1.print(ml1.head);
//		ListNode ls=ml.mergeList1(ml.head, ml1.head);
//		ListNode ls=ml.getMergeNum(ml.head, ml1.head);
		ListNode ls=ml.getMergeList(ml.head, ml1.head);
		
		System.out.println("merge start list");
		ml.print(ls);
	}

}
