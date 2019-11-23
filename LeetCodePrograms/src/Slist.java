class ListNode
{
	private int data;
	private ListNode next;
	ListNode(int data)
	{
	this.data=data;	
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	public void setNext(ListNode next)
	{
		this.next=next;
	}
	public ListNode getNext()
	{
		return this.next;
	}
}
public class Slist {
	
	Slist()
	{
	 length=0;
	}
	ListNode head;
	private int length=0;
	public int getLength()
	{
		return length;
	}
	public synchronized ListNode getHead()
	{
		return head;
	}
	public synchronized void insertAtBegin(ListNode node)
	{
		node.setNext(head);
		head=node;
		length++;
	}
	public synchronized void insertAtEnd(ListNode node)
	{
		if(head==null) head=node;
		else
		{
//		ListNode current=head;
//		while(current!=null)
//		{
//			current=current.getNext();
//		}
//		current.setNext(node);
			ListNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q);
			p.setNext(node);
				
		}
		length++;
	}
	public void insert(int data,int position)
	{
		if(position<0) position=0;
		else if(position>length) position=length;
		
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			head=newNode;
			length++;
		}
		else if(position==0) 
		{
			insertAtBegin(newNode);
		}
		else if(position==length)
		{
			insertAtEnd(newNode);
		}
		else
		{
			ListNode current=head;
			for(int i=1;i<position;i++)
			{
				current=current.getNext();
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			length++;
		}
	}
	public  synchronized ListNode removeFromBegin()
	{
		ListNode node=head;
		if(node!=null) {
		 head=node.getNext();
		 node.setNext(null);
		}
		length--;
		return node;
	}
	public synchronized ListNode removeFromEnd()
	{
		if(head==null) return null;
		ListNode node=head,previousnode = null;
		while(node.getNext()!=null)
		{
			previousnode=node;
			node=node.getNext();
		}
		previousnode.setNext(null);
		length--;
		return node;
	}
	public synchronized void removeMatchedNode(ListNode node)
	{
		if(head==null) return;
		if(node.equals(head))
		{
			head=head.getNext();
			length--;
			return;
		}
		ListNode p=head,q=null;
		while(p.getNext()!=null)
		{
			q=p;
			if(node.equals(q))
			{
				p.setNext(q.getNext());
				length--;
				return;
			}
		}
		p=q;
	}
	public synchronized void removeatPos(int pos)
	{
		if(pos<0)
		{
			pos=0;
		}
		else if (pos>length)
		{
			pos=length;
		}
		if(head==null) return ;
			if(pos==0)
			{
				removeFromBegin();
			}
			else if(pos==length)
			{
				removeFromEnd();
			}
			else
			{
				ListNode p=head;
				for(int i=1;i<pos;i++)
				{
					p=p.getNext();
				}
				p.setNext(p.getNext().getNext());
				length--;
			}
		
	}
	public String toString()
	{
		String result="[";
		if(head==null) return result+"]";
		result=result+head.getData();
		ListNode current=head.getNext();
		while(current!=null)
		{
			result=result+","+current.getData();
			current=current.getNext();
		}
		return result+"]";
	}
	public String getPos(int data)
	{
		if(head==null) return "0";
		ListNode temp=head;
		int pos=0;
		while(temp!=null)
		{
			if(data==temp.getData()) return ""+pos;
			pos++;
			temp=temp.getNext();
		}
		return "Not found"; 
	}
	public void print()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.getNext();
		}
		
		System.out.println("length "+getLength());
	}
	public void clearList()
	{
		head=null;
		length=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Slist s=new Slist();
		s.insert(1, 0);
		s.insert(2, 1);
		s.insert(3, 2);
		s.insert(4, 3);
		s.insert(5, 2);
		s.insert(6, 4);
		s.insert(7, 5);
		s.print();
		s.removeFromBegin();
		System.out.println("*************");
		s.print();
		s.removeFromEnd();
		System.out.println("*************");
		s.print();
		s.removeatPos(2);
		System.out.println("*************");
		s.print();
		System.out.println("*************");
		System.out.println(s.toString());
		System.out.println(s.getPos(5));
		s.clearList();
		System.out.println(s.toString());
	}

}
