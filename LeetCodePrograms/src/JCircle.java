import java.util.ArrayList;
import java.util.List;

class CLList{
	private int data;
	private CLList next;
	private int value;
	CLList(int data)
	{
		this.data=data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return this.data;
	}
	public void setNext(CLList next)
	{
		this.next=next;
	}
	public CLList getNext()
	{
		return this.next;
	}
	public void setVal(int val)
	{
		value=val;
	}
	public int getVal()
	{
		return this.value;
	}
}
public class JCircle {
	 private int val=1;
	private CLList tail;
	public void addTohead(int data)
	{
		CLList newNode=new CLList(data);
		newNode.setVal(val++);
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
		CLList curntNode=tail.getNext();
//		System.out.println(tail.getNext().getVal());
		while(curntNode!=tail)
		{
			System.out.println(curntNode.getData()+" "+curntNode.getVal());
			curntNode=curntNode.getNext();
		}
		System.out.println(curntNode.getData()+" "+curntNode.getVal());
	}
	public int getLast(CLList head,int M)
	{
		CLList ls=head;
		for(int cnt=8;cnt>1;--cnt)
		{
			for(int i=0;i<M;++i)
			{
				ls=ls.getNext();
			}
			ls.setNext(ls.getNext().getNext());
		}
		return ls.getVal();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JCircle jc=new JCircle();
		jc.addTohead(1);
		jc.addTohead(2);
		jc.addTohead(3);
		jc.addTohead(4);
		jc.addTohead(5);
		jc.addTohead(6);
		jc.addTohead(7);
		jc.addTohead(8);
		jc.PrintList();
//		System.out.println("strat"+jc.tail.getData());
		System.out.println("last player "+jc.getLast(jc.tail.getNext().getNext(), 3));
		
	}

}
