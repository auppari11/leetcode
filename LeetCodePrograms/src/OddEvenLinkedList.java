
public class OddEvenLinkedList {
	Node head;
	static Node newhead;
	int cnt=0;
	public class Node
	{
		int data;
	    Node nxt;
		Node(int data)
		{
			this.data=data;
			nxt=null;
		}
	}
	public void pushData(int val)
	{
		if(head==null)
		{
			head=new Node(val);
		}
		else if(head!=null)
		{
			Node p=head;
			while(p.nxt!=null)
			{
				p=p.nxt;
			}
				p.nxt= new Node(val);
		}
		cnt++;
	}
public Node oddEvenList(Node newhead) {
	Node p=head;
	int cnt1=1,cnt2=1;
	while(p!=null)
	{
		if(cnt1%2==1)
		{
			if (newhead==null)
			{
				newhead=new Node(p.data);
			}
			else if(newhead!=null)
			{
				Node k=newhead;
				while(k.nxt!=null){
					k=k.nxt;					
				}
				k.nxt=new Node(p.data);
			}
		}
		cnt1++;
	  p=p.nxt;
	} 
	p=head;
	while(p!=null)
	{
		if(cnt2%2==0)
		{
			if (newhead==null)
			{
				newhead=new Node(p.data);
			}
			else if(newhead!=null)
			{
				Node k=newhead;
				while(k.nxt!=null){
					k=k.nxt;					
				}
				k.nxt=new Node(p.data);
			}
		}
		cnt2++;
	  p=p.nxt;
	}
	return newhead;
    } 
	public void loopVal()
	{
		Node p=head;
		while(p!=null)
		{
		  System.out.println("data "+ p.data);
		  p=p.nxt;
		}
	}
	public void loopVal2(Node n)
	{
		Node k=n;
//		System.out.println("data "+ k.data);
		while(k!=null)
		{
		  System.out.println("data "+ k.data);
		  k=k.nxt;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenLinkedList od=new OddEvenLinkedList();
		od.pushData(10);
		od.pushData(20);
		od.pushData(30);
		od.pushData(40);
		od.pushData(50);
		od.pushData(60);
		od.pushData(70);
//		od.loopVal();
		 
		Node n=od.oddEvenList(newhead);
		System.out.println("after this "+od.cnt);
				od.loopVal2(n);
	}

}
