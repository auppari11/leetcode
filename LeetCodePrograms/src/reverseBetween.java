
public class reverseBetween {
	ListNode head,newhead;
	public class ListNode
	{
		int val;
		ListNode next;
		ListNode(int data)
		{
			val=data;
			next=null;
		}
	}
	public void pushData(int val)
	{
		if(head==null)
		{
			head=new ListNode(val);
		}
		else if(head!=null)
		{
			ListNode p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
				p.next= new ListNode(val);
		}
	}
	public ListNode insertData(int val,ListNode newhead)
	{
		System.out.println("inserting val "+val);
		//ListNode knode=newhead;
		if(newhead==null)
		{
			newhead=new ListNode(val);
			System.out.println("inserted val");
		}
		else if(newhead!=null)
		{
			ListNode p=newhead;
			while(p.next!=null)
			{
				p=p.next;

			}
			p.next= new ListNode(val);
		}
		return newhead;
	}
	
public ListNode reverseBetween(ListNode head, int m, int n) {
	System.out.println("here");
	if ( m>=n) return head;
	ListNode nhead=head;
	int cnt=1,pval=n;
	char inloop='N';
	while(nhead!=null)
	{
//		System.out.println("cnt "+cnt+" pval "+pval);
		if(m<=cnt && cnt<=pval)
		{
			System.out.println("check1");
			ListNode k=nhead;
			while(k!=null && pval-m>0)
			{
			  k=k.next;	
			  pval--;
			}
			newhead=insertData(k.val,newhead);
			System.out.println("val "+newhead.val);
			inloop='Y';
			if(pval==m) pval=0;
			pval=n-1;
			
		}
		else
		{
			System.out.println("check2");
			if(inloop=='N')
			newhead=insertData(nhead.val,newhead);
			else
			{
				newhead=insertData(nhead.val,newhead);
				while(n-m>0 )
				{
//					System.out.println("nhead.val "+nhead.val+" m "+m);
					nhead=nhead.next;
					m++;
				}
				inloop='N';
				
			}
			System.out.println("val "+newhead.val);
			nhead=nhead.next;
		}
		cnt++;
	}
	return newhead;
        
    }
public void loopVal2(ListNode n)
{
	ListNode k=n;
	System.out.println("data "+ k.val);
	while(k!=null)
	{
	  System.out.println("data "+ k.val);
	  k=k.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseBetween rb=new reverseBetween();
		rb.pushData(1);
		rb.pushData(2);
		rb.pushData(3);
		rb.pushData(4);
//		rb.pushData(5);
		ListNode newNodeHead=rb.reverseBetween(rb.head, 1, 4);
//		rb.loopVal2(newNodeHead);
		System.out.println(newNodeHead.val);
		while(newNodeHead!=null)
		{
		  System.out.println("data "+ newNodeHead.val);
		  newNodeHead=newNodeHead.next;
		}
		
	}

}
 