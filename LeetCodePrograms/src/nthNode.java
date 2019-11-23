import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class nthNode {
	public ListNode head;
	public int getNode(int val)
	{
		List<Integer> hs=new ArrayList<>();
		ListNode current=head;
		while(current!=null)
		{
			hs.add(current.getData());
			current=current.getNext();
		}
		return val>hs.size()? 0:hs.get(hs.size()-val);
		
	}
	public int getnthNode(int val)
	{
		if(head==null)return 0;
		ListNode curr=head;
		int cnt=getLength();
		if(val>cnt) return 0;
		else
		val=cnt-val;
		for(int i=0;i<val;i++)
		{
			curr=curr.getNext();
		}
		return curr.getData();
	}
	public int getLength()
	{
		int len=0;
		ListNode current=head;
		while(current!=null)
		{
			len++;
			current=current.getNext();
		}
		return len;
	}
	public int getnodefromNth(int val)
	{
		ListNode pTemp=head,pNext=null;
		for(int i=1;i<val;i++)
		{
			pTemp=pTemp.getNext();
		}
		while(pTemp!=null)
		{
			if(pNext==null)
			{
				pNext=head;
			}
			else
			
				pNext=pNext.getNext();
			pTemp=pTemp.getNext();
			
		}
		if(pNext!=null)
			return pNext.getData();
		return 0;
	}
	public void push(int data)
	{
		if(head==null)
		{
			head=new ListNode(data);
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
	int count=1,num=0;
	char setVal='Y';
	public int nthNodefromEnd(ListNode head,int val)
	{
		if(val==count)
		{
			num=head.getData();
			val=-1;
			System.out.println("here val "+head.getData());
			nthNodefromEnd(null, val);
			
			
		}
		else if(val>0)
		{
		count++;
		nthNodefromEnd(head.getNext(), val); 
		
		
		}
		if(head==null || val==-1)
			return 0;
		else 
			return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nthNode nd=new nthNode();
		nd.push(1);
		nd.push(2);
		nd.push(3);
		nd.push(9);
		nd.push(5);
		nd.print();
		System.out.println("node here "+nd.getnthNode(4));
		System.out.println("node here1 "+nd.getNode(4));
		System.out.println("node here2 "+nd.getnodefromNth(4));
		System.out.println("node here3 "+nd.nthNodefromEnd(nd.head,2));
		
	}

}
