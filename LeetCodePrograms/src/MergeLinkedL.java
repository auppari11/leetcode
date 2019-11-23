/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeLinkedL {
	static ListNode head1,head2;
	static int len1=0;
	static int len2=0;
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resullist=null;
        LinkedList<Integer> ss=new LinkedList<>();
        ListNode tail=null;;
        int j=0,p=0;
        while(l1!=null || l2!=null)
        {
        	if(l1!=null)
        	{
        		
        		ss.add(l1.val);
        	}
        	if(l2!=null)
        	{
        		ss.add(l2.val);
        	}
           if(l1!=null)
		  {
			  l1=l1.next;
		  }	
  	if(l2!=null)
	  {
		  l2=l2.next;
	  }	
        
        }
        Collections.sort(ss);
//        System.out.println(ss);
        for(int m=0;m<ss.size();m++)
        {
//        	System.out.println(ss.get(m));
        	ListNode temp = new ListNode(ss.get(m));
			  if (resullist == null ) {
				  resullist = temp;
	              tail=temp;
	          } else  {
	              tail.next = temp;
	          }
			  tail = temp;
        }
        return resullist;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeLinkedL l1=new MergeLinkedL();
		l1.head1=new ListNode(3);
		l1.head1.next=new ListNode(5);
		l1.head1.next.next=new ListNode(7);
		
		len1=3;
		len2=3;
		
		l1.head2=new ListNode(1);
		l1.head2.next=new ListNode(9);
//		l1.head2.next.next=new ListNode(7);
		ListNode resullist1=null;
		
		resullist1=l1.mergeTwoLists(l1.head1,l1.head2);
		l1.printLl(resullist1);
	}

}

