

public class XORLlist {
public ListNode head=null;
public void insertVal(int data)
{
	if(head==null) head=new ListNode(data);
	else
	{
	ListNode p,q,newnode=new ListNode(data);
	for(p=head;(q=p.getNext())!=null;p=q);
	p.setNext(newnode^q);
	newnode
		
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XORLlist xr=new XORLlist();
		
	}

}
