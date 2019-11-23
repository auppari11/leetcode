
public class checkPalindrome {
	ListNode head=null;
	public synchronized void insertAtEnd(int data)
	{
		ListNode node=new ListNode(data);
		if(head==null) head=node;
		else
		{
			ListNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q);
			p.setNext(node);
				
		}
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
	public boolean checkPalindrom()
	{
		if(head==null) return false;
		ListNode slowptr=head,fastptr=head;
		String str="";
		int i=0;
		while(fastptr.getNext()!=null && fastptr.getNext().getNext()!=null)
		{
			
			str=str+slowptr.getData();
			slowptr=slowptr.getNext();
			fastptr=fastptr.getNext().getNext();
			
			
		}
		System.out.println("slowptr"+slowptr.getData());
		str=str+slowptr.getData();
		slowptr=slowptr.getNext();
		System.out.println("slowptr"+slowptr.getData());
		if(fastptr.getNext()!=null) i=str.length()-1;
		else i=str.length()-2;
		System.out.println("i valye"+i);
		while(slowptr.getNext()!=null && i>=0)
		{
			System.out.println(Character.getNumericValue(str.charAt(i)));
			if(Character.getNumericValue(str.charAt(i))!=slowptr.getData())
				{
				return false;
				};
				slowptr=slowptr.getNext();
				i--;
		}
		if(Character.getNumericValue(str.charAt(i))!=slowptr.getData())
		{
		return false;
		};
		i--;
		System.out.println("i here val "+i);
		System.out.println("string val "+str);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindrome cp=new checkPalindrome();
		cp.insertAtEnd(1);
		cp.insertAtEnd(2);
		cp.insertAtEnd(3);
//		cp.insertAtEnd(3);
		cp.insertAtEnd(2);
		cp.insertAtEnd(1);
		cp.print();
		System.out.println(cp.checkPalindrom());
	}
	

}
