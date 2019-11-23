import java.util.Hashtable;

public class checkList {
	public ListNode head;
	public ListNode last;
	public synchronized void insert(int data)
	{

		if(head==null)
		{
			head=new ListNode(data);
			last=head;
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
		last=newNode;
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
public void join(ListNode node)
{
	ListNode curr=head;
	for(int i=0;i<3;i++)
	{
		curr=curr.getNext();
	}
	node.setNext(curr);
}
public boolean checkCycle()
{
	ListNode current=head;
	Hashtable<Integer, ListNode> hs=new Hashtable<>();
	while(current!=null)
	{
		if(current.getNext()!=null && hs.containsValue(current.getNext()))
			return true;
		if(current.getNext()==null) return false;
		hs.put(current.getData(), current.getNext());
		current=current.getNext();
	}
	return false;
}
public boolean cyclecheck()
{
	ListNode slowptr=head,fastptr=head;
	
	while(fastptr!=null && fastptr.getNext()!=null)
	{
		fastptr=fastptr.getNext().getNext();
		slowptr=slowptr.getNext();
		if(slowptr==fastptr) return true;
	}
	return false;
}
public int findBeginLoop()
{
ListNode slowptr=head,fastptr=head;
boolean loop=false;
	
	while(fastptr!=null && fastptr.getNext()!=null)
	{
		fastptr=fastptr.getNext().getNext();
		slowptr=slowptr.getNext();
		if(slowptr==fastptr) 
			{
			 loop=true;
			 break;
			};
	}
	if(loop==true)
	{
		slowptr=head;
		while(fastptr!=null && fastptr.getNext()!=null)
		{
			fastptr=fastptr.getNext();
			slowptr=slowptr.getNext();
			if(slowptr==fastptr) return slowptr.getData();
		}
	}
	return 0;
}
public int LengthLoop()
{
ListNode slowptr=head,fastptr=head;
boolean loop=false;
	
	while(fastptr!=null && fastptr.getNext()!=null)
	{
		fastptr=fastptr.getNext().getNext();
		slowptr=slowptr.getNext();
		if(slowptr==fastptr) 
			{
			 loop=true;
			 break;
			};
	}
	if(loop==true)
	{
		slowptr=head;
		while(fastptr!=null && fastptr.getNext()!=null)
		{
			fastptr=fastptr.getNext();
			slowptr=slowptr.getNext();
			if(slowptr==fastptr) 
				break;
		}
		int len=1;
		while(fastptr.getNext()!=slowptr)
		{
			len++;
			fastptr=fastptr.getNext();
		}
		return len;
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkList cl=new checkList();
		cl.insert(1);
		cl.insert(2);
		cl.insert(3);
		cl.insert(4);
		cl.insert(5);
		cl.insert(6);
		cl.insert(7);
		cl.insert(8);
		cl.join(cl.last);
//		cl.print();
		System.out.println(cl.checkCycle());
		System.out.println("check "+cl.cyclecheck());
		System.out.println("check2 "+cl.findBeginLoop());
		System.out.println("get len "+cl.LengthLoop());
	}

}
