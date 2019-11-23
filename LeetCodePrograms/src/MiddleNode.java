

public class MiddleNode {
	
	ListNode head=null;
	 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  } 
	public int getLength()
	{
		int length=0;
		ListNode currnt=head;
		while(currnt!=null)
		{
			length++;
			currnt=currnt.next;
		}
		return length;
	}
	  public ListNode middleNodeVal(ListNode head) {
		  
	     if(head==null) return  head;
	     int pos=0;
	     if(getLength()>0)
	     {
	    	 if(getLength()%2==0) pos=(int) Math.ceil(getLength()/2);
	    	 else if(getLength()%2!=0) pos=getLength()/2;
	     }
	     else return head;
	     
	     for(int i=1;i<=pos;i++)
	     {
	    	 removeFromBegin();
	     }
	    
	     return head;
	    }
	  public void removeFromBegin()
	  {
		  if(head==null) return;
		  ListNode curr=head;
		  head=curr.next;
		  curr.next=null;
	  }
	  public void insert(int data)
	  {
		  ListNode ln=new ListNode(data);
		  if(head==null) head=ln;
		  else
		  {
		  ln.next=head;
			head=ln;
		  }
	  }
	  public ListNode middleNodeVal1()
	  {
		  ListNode curr=head;
		  return middleNodeVal(curr);
	  }
	  public void print(ListNode head)
	  {
		  ListNode curr=head;
		  while(curr!=null)
		  {
			  System.out.println(curr.val);
			  curr=curr.next;
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleNode mn=new MiddleNode();
		
		mn.insert(5);
		mn.insert(4);
		mn.insert(3);
		mn.insert(2);
		mn.insert(1);
		mn.print();
		ListNode val=mn.middleNodeVal1();
		mn.print(val);
		
	}

}
