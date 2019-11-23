class DLL{
	private int data;
	private DLL next;
	private DLL prev;
	DLL(int data,DLL prev,DLL next)
	{
		this.data=data;
		this.prev=prev;
		this.next=next;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	public void setNext(DLL next)
	{
		this.next=next;
	}
	public DLL getNext()
	{
		return next;
	}
	public void setPrev(DLL prev)
	{
		this.prev=prev;
	}
	public DLL getPrev()
	{
		return prev;
	}
}
public class Dlist {
	private int length;
	private DLL head;
	private DLL tail;
	Dlist()
	{	
		length=0;
	}
 private int getLength()
 {
	 return length;
 }
 public synchronized void insertAtBegin(int data)
 {
	 if(head==null)
	 {
		 head=new DLL(data, null, null);
		 tail=head;
		 length++;
		 return;
	 }
	 DLL newnode=new DLL(data, null, head);
	 head.setPrev(newnode);
	 head=newnode;
	 length++;
 }
 public void insertAtEnd(int data)
 {
	 if(head==null)
	 {
		 head=new DLL(data, null, null);
		 tail=head;
		 length++;
		 return; 
	 }
	 DLL newnode=new DLL(data,tail,null);
	 tail.setNext(newnode);
	 tail=newnode;
	 length++;
 }
 public void insertAtSpecificPos(int data,int pos)
 {
	 if(pos<0) pos=0;
	 else if(pos>getLength()) pos=getLength();
	 if(head==null) return;
	 if(pos==0) insertAtBegin(data);
	 else if(pos==getLength()) insertAtEnd(data);
	 else
	 {
		 DLL currentnode=head;
		 for(int i=1;i<pos;i++)
		 {
			 currentnode=currentnode.getNext();
		 }
		 DLL newNode=new DLL(data, currentnode, currentnode.getNext());
		 currentnode.getNext().setPrev(newNode);
		 currentnode.setNext(newNode);
		 length++;
	 }
 }
 public void print()
 {
	 DLL current=head;
	 while(current!=null)
	 {
		 System.out.println(current.getData());
		 current=current.getNext();
	 }
 }
 public void remove(int pos)
 {
	 if(pos<0) pos=0;
	 if(pos>length) pos=length;
	 if(head==null) return;
	 if(pos==0)
	 {
		 head=head.getNext();
		 head.setPrev(null);
	 }
	 else if(pos==length)
	 {
		 tail=tail.getPrev();
		 tail.setNext(null);
	 }else
	 {
		 DLL currentNode=head;
		 for(int i=1;i<pos;i++)
		 {
			 currentNode=currentNode.getNext();
		 }
		 currentNode.setNext(currentNode.getNext().getNext());
		 currentNode.getNext().setPrev(currentNode);
	 }
	 length--;
 }
 public synchronized void removeMatched(DLL node)
 {
	 if(head==null) return;
	 if(node.equals(head))
	 {
		 head=head.getNext();
		 if(head==null) tail=null;
		 length--;
		 return;
	 }
	 DLL currnt=head;
	 while(currnt!=null)
	 {
		 if(node.equals(currnt))
		 {
			 node.getPrev().setNext(node.getNext());
			 node.getNext().setPrev(node.getPrev());
			 node.setPrev(null);
			 node.setNext(null);
			 length--;
			 return;
		 }
		 currnt=currnt.getNext();
	 }
 }
 public int getPos(int data)
 {
	 if(head==null) return 0;
	 DLL current=head;
	 int pos=0;
	 while(current!=null)
	 {
		 pos++;
		 if(current.getData()==data)
		 {
			return pos; 
		 }
		current=current.getNext(); 
	 }
	 return 0;
 }
 public String toString()
 {
	 String res="[";
	 if(head==null) return res+"]";
	 res=res+head.getData();
	 DLL currnt=head.getNext();
	 while(currnt!=null)
	 {
		res=res+","+currnt.getData();
		currnt=currnt.getNext();
	 }
	 return res+"]";
 }
 public void clearList()
 {
	 head=null;
	 tail=null;
	 length=0;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dlist dl=new Dlist();
		dl.insertAtBegin(1);
		dl.insertAtBegin(2);
		dl.insertAtBegin(3);
		dl.insertAtEnd(4);
		dl.insertAtSpecificPos(5, 3);
		dl.print();
		dl.remove(2);
		dl.remove(4);
		dl.remove(1);
		System.out.println("*******************");
		dl.print();
		System.out.println(dl.toString());
		System.out.println("get pos "+dl.getPos(5));
		dl.clearList();
		System.out.println(dl.toString());
		
	}

}
