
public class ClistBreak {
public CLL tail,tail2,tail1;
CLL head=null,head1=null;
public void addTohead(int data)
{
	CLL newNode=new CLL(data);
	if(tail==null)
	{
		tail=newNode;
		tail.setNext(tail);
	}else
	{
		newNode.setNext(tail.getNext());
		tail.setNext(newNode);
	}
}
public void PrintList()
{
	CLL curntNode=tail.getNext();
	while(curntNode!=tail)
	{
		System.out.println(curntNode.getData());
		curntNode=curntNode.getNext();
	}
	System.out.println(curntNode.getData());
}
public void PrintList2()
{
	CLL curntNode=tail2.getNext();
	while(curntNode!=tail2)
	{
		System.out.println(curntNode.getData());
		curntNode=curntNode.getNext();
	}
	System.out.println(curntNode.getData());
}
//public synchronized void insertAtEnd(ListNode node)
//{
//	if(head==null) head=node;
//	else
//	{
//		ListNode p,q;
//		for(p=head;(q=p.getNext())!=null;p=q);
//		p.setNext(node);
//			
//	}
//}
public void breakList(CLL node)
{
	CLL slow_ptr=tail.getNext();
	CLL fast_ptr=tail.getNext();
	System.out.println("tail val "+tail.getData());
	if(tail==null) return ;
	
	while(fast_ptr.getNext()!=null && fast_ptr.getNext().getNext()!=null)
	{
		fast_ptr=fast_ptr.getNext().getNext();
		slow_ptr=slow_ptr.getNext();
	}
	if(fast_ptr.getNext().getNext()==tail.getNext())
		fast_ptr=fast_ptr.getNext();
	tail1=node;
	if(node.getNext()!=tail.getNext())
		tail2=slow_ptr.getNext();
	fast_ptr.setNext(slow_ptr.getNext());
	slow_ptr.setNext(tail.getNext());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClistBreak cl=new ClistBreak();
		cl.addTohead(6);
		cl.addTohead(5);
		cl.addTohead(4);
		cl.addTohead(3);
		cl.addTohead(2);
		cl.addTohead(1);
		cl.PrintList();
		cl.breakList(cl.tail);
		System.out.println("after breaking");
		cl.PrintList();
		cl.PrintList2();
		
	}

}
