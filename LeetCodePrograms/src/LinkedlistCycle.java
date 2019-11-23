public class LinkedlistCycle {
	ListNode head;
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
	public void loopVal(ListNode p)
	{
		System.out.println(p.val);
		
		while(p!=null)
		{
		  System.out.println("data "+ p.val);
		  p=p.next;
		}
//		int i=0;
//		while(i<val && k!=null)
//		{
//			k=k.next;
//			i++;
//		}
//		p.next=k;
	}
   /* public ListNode detectCycle(ListNode head) {
    	ListNode p=head,k=head;
		while(p!=null)
		{
		  System.out.println("data "+ p.val);
		  p=p.next;
		}
		int i=0;
		while(i<val && k!=null)
		{
			k=k.next;
			i++;
		}
		p.next=k;
		return p;
    }*/
	public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow){
                ListNode slow2 = head; 
                while (slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedlistCycle od=new LinkedlistCycle();
		od.pushData(10);
		od.pushData(20);
		od.pushData(30);
		od.pushData(40);
		od.pushData(50);
		od.pushData(60);
		od.pushData(70);
		ListNode n=od.detectCycle(od.head);
		od.loopVal(n);
		

	}

}
