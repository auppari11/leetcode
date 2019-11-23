import java.util.Hashtable;

public class Middleoflist {
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
	public int getMiddleNode()
	{
		int len=0;
		ListNode curr=head;
		while(curr!=null)
		{
			len++;
			curr=curr.getNext();
		}
		System.out.println("len "+len);
		ListNode curr1=head;
		for(int i=1;i<Math.floor(len/2)+1;i++)
		{
			curr1=curr1.getNext();
		}
		
		return curr1.getData()
				;
	}
	public int getMiddHash()
	{
		Hashtable<Integer, ListNode> hs=new Hashtable<>();
		ListNode curr=head;
		while(curr.getNext()!=null)
		{
			hs.put(curr.getData(), curr.getNext());
			curr=curr.getNext();
		}
//		System.out.println(curr.getData());
//		curr=null;
//		hs.put(curr.getData(), curr);
//		System.out.println(hs.size()+1);
		int val=(int) (Math.floor((hs.size()+1)/2)+1);
		System.out.println((hs.size()+1)-val);
		System.out.println(hs.keySet());
		return (int) hs.keySet().toArray()[((hs.size()+1)-val)-1];
	}
	public int getMiddList()
	{
		ListNode ptr1=head,ptr2=head;
		int i=0;
		while(ptr2.getNext()!=null)
		{
			if(i==0)
			{
				ptr2=ptr2.getNext();
				i=1;
			}else
			{
				ptr1=ptr1.getNext();
				ptr2=ptr2.getNext();
				i=0;
			}
		}
		return ptr1.getData();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Middleoflist mf=new Middleoflist();
		mf.insert(1);
		mf.insert(2);
		mf.insert(3);
		mf.insert(4);
//		mf.insert(5);
		mf.print(mf.head);
//		System.out.println(mf.getMiddleNode());
//		System.out.println(mf.getMiddHash());
		System.out.println(mf.getMiddList());
//		mf.print(ls);

	}

}
