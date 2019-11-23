/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class TwoNumbers {
	
	static ListNode head1, head2;
	public static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x)
		{
			val=x;
			next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoNumbers linkedlist1=new TwoNumbers();
		
		linkedlist1.head1=new ListNode(9);
//		linkedlist1.head1.next=new ListNode();
//	    linkedlist1.head1.next.next=new ListNode(3);		
	    linkedlist1.head2=new ListNode(1);
	    linkedlist1.head2.next=new ListNode(9);
	    linkedlist1.head2.next.next=new ListNode(9);
	    linkedlist1.head2.next.next.next=new ListNode(9);
	    linkedlist1.head2.next.next.next.next=new ListNode(9);
	    linkedlist1.head2.next.next.next.next.next=new ListNode(9);
	    linkedlist1.head2.next.next.next.next.next.next=new ListNode(9);
	    linkedlist1.head2.next.next.next.next.next.next.next=new ListNode(9);
	    linkedlist1.head2.next.next.next.next.next.next.next.next=new ListNode(9);
	    linkedlist1.head2.next.next.next.next.next.next.next.next.next=new ListNode(9);
	    
//		linkedlist1.head2.next=new ListNode(6);
//	    linkedlist1.head2.next.next=new ListNode(4);
	    ListNode ln=linkedlist1.addTwoNumbers(head1, head2);
	    linkedlist1.printLl(ln);
	    
    }
	public void printLl(ListNode l1)
	{
		ListNode n=l1;
		System.out.println("Printing here");
		while(n!=null)
		{
			System.out.println(n.val);
			n=n.next;
		}
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode resultantList = null;
		   ListNode tail = null;
		   int carry=0,storedval=0;
		   int j,k;
		   while(l1!=null || l2!=null)
		   {  
			  if(l1!=null)
			  {
				  j=l1.val;
			  }
			  else
			  {
				 j=0; 
			  }
			  if(l2!=null)
			  {
				  k=l2.val;
			  }
			  else
			  {
				 k=0; 
			  }
			  System.out.println("j value "+j);
			  System.out.println("k value "+k);
			 if(j+k+carry>=10)
			 {
				 storedval=(j+k+carry)%10;
				 carry=(j+k+carry)/10;
			 }
			 else
			 {
				 storedval=(j+k)+carry;
				 carry=0;
			 }
			 System.out.println("storedval "+storedval);
			 System.out.println("carry "+carry);
			 ListNode temp = new ListNode(storedval);
			  if (resultantList == null ) {
	              resultantList = temp;
	              tail=temp;
	          } else  {
	              tail.next = temp;
	          }
			  tail = temp;
			  if(l1!=null)
			  {
				  l1=l1.next;
			  }
			  
			  if(l2!=null)
			  {
				  l2=l2.next;
			  }
		   }
		   if(carry==1)
		   {
			   ListNode temp = new ListNode(carry);
			   tail.next=temp;
			   
		   }
		   return resultantList;
	}
//public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//	   int val1,val2,val3,val4;
//	   ListNode resultantList = null;
//	   ListNode tail = null;
//	   
//	   val1=convertNum(l1);
//	   System.out.println(val1);
//	   val2=convertNum(l2);
////	   System.out.println(val2);
//	   val3=val1+val2;
////	   System.out.println(val3);
//	   if (val3==0)
//	   {
//		   resultantList=new ListNode(val3);
//		   return resultantList;
//	   }
//    
//int i=0;
//
//	   while(val3!=0)
//	   {
//		  val4=val3%10;
//		  ListNode temp = new ListNode(val4);
//		  if (resultantList == null ) {
//              resultantList = temp;
//          } else  {
//              tail.next = temp;
//          }
//		  tail = temp;
//		 i++;
//		  val3=(val3)/10;			  
//	   }
//
//	   return resultantList;
//        
//    }
//public int convertNum(ListNode l1)
//{
//	int value=0,i=0;
//	while(l1!=null)
//	{
//		value=value+(int)(l1.val*Math.pow(10,i));
////		System.out.println("i value"+i);
////		System.out.println((int)(l1.val*Math.pow(10,i)));
//		i++;
//		l1=l1.next;
//	}
//	return value;
//}
}


