import java.util.ArrayList;
import java.util.List;

class CLL{
	private int data;
	private CLL next;
	CLL(int data)
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
	public void setNext(CLL next)
	{
		this.next=next;
	}
	public CLL getNext()
	{
		return this.next;
	}
}
public class CList {
	private int len;
	private CLL tail;
	CList()
	{
		tail=null;
		len=0;
	}
	public int getLen()
	{
		return this.len;
	}
	public int cListLen(CLL tail)
	{
		int length=0;
		CLL currntnode=tail.getNext();
		while(currntnode!=tail)
		{
			length++;
			currntnode=currntnode.getNext();
		}
		return length;
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
		len++;
	}
	public void addToTail(int data)
	{
		addTohead(data);
		tail=tail.getNext();
		
	}
	public int peek()
	{
		return tail.getNext().getData();
	}
	public int tailPeek()
	{
		return tail.getData();
	}
	public void insertAtPos(int data,int pos)
	{
		if(pos<0) pos=0;
		else if(pos>len) pos=len;
		
		if(tail==null) return;
		if(pos==0) addTohead(data);
		else if(pos==len) addToTail(data);
		else {
			CLL currntNode=tail;
			for(int i=0;i<pos;i++)
			{
				currntNode=currntNode.getNext();
			}
			CLL newNode=new CLL(data);
			newNode.setNext(currntNode.getNext());
			currntNode.setNext(newNode);
			len++;
		}
	}
	public void removeFromHead()
	{
		if(tail==tail.getNext()) tail=null;
		CLL currntNode=tail.getNext();
		tail.setNext(currntNode.getNext());
		currntNode.setNext(null);
		len--;
		
	}
	public void removeFromTail()
	{
		if(tail==tail.getNext()) tail=null;
		CLL currntNode=tail.getNext();
		while(currntNode.getNext()!=tail)
		{
			currntNode=currntNode.getNext();
		}
		currntNode.setNext(tail.getNext());
		tail.setNext(null);
		tail=currntNode;
		len--;
	}
	public void removeData(int data)
	{
		if(tail==null) return;
		if(tail==tail.getNext() && tail.getData()==data)
		{
			tail=null;
			len=0;
			return;
		}
	    if(tail.getData()==data) removeFromTail();
	    else if(tail.getNext().getData()==data) removeFromHead();
	    else
	    {
	    	CLL currntNode=tail.getNext(),prevNode=tail;
	    	while(currntNode!=tail)
	    	{
	    		
	    		if(currntNode.getData()==data)
	    		{
	    			prevNode.setNext(currntNode.getNext());
	    			currntNode.setNext(null);
	    			len--;
	    			return;
	    		}
	    		prevNode=currntNode;
	    		currntNode=currntNode.getNext();
	    	}
	    	
	    }
	}
	public void removeAtPos(int pos)
	{
		if(pos<0)pos=0;
		else if(pos>len) pos=len;
		if(tail==null) return;
		if(pos==0) 
			{
			removeFromHead();
			
			}
		else if(pos==len)
		{
			removeFromTail();
		}
		else
		{
			CLL currntNode=tail,prevNode=null;
			
			for(int i=1;i<=pos;i++)
			{
				prevNode=currntNode;
				currntNode=currntNode.getNext();
			}
			prevNode.setNext(currntNode.getNext());
			currntNode.setNext(null);
			len--;
		}
	}
	public String toString()
	{
		String res="[";
		if(tail==null) return res+"]";
		res=res+tail.getData();
		CLL curr=tail.getNext();
		while(curr!=tail)	
		{
			res=res+","+curr.getData();
			curr=curr.getNext();
		}
		return res+"]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CList cl=new CList();
		cl.addTohead(3);
		cl.addTohead(2);
		cl.addTohead(1);
		cl.addToTail(5);
		cl.insertAtPos(4, 3);
		cl.PrintList();
		cl.removeFromHead();
//		cl.removeFromTail();
		System.out.println("**************");
		cl.PrintList();
		cl.removeAtPos(2);
		System.out.println("**************");
		cl.PrintList();
		cl.removeData(4);
		System.out.println("**************");
		cl.PrintList();
		System.out.println(cl.toString());
		
		
	}

}
