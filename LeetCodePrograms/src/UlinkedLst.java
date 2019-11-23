import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;

public class UlinkedLst<E> extends AbstractList<E> implements List<E>,Serializable{
	private class ListNode{
		ListNode next;
		ListNode prev;
		int numElements=0;
		Object[] elements;
		ListNode()
		{
			elements=new Object[nodeCapacity];
		}
		
	}
private int nodeCapacity;
private int size=0;
private ListNode firstNode;
private ListNode lastNode;
public UlinkedLst(int nodeCapacity) throws IllegalArgumentException{
	if(nodeCapacity<3) {
		throw new IllegalArgumentException("nodeCapacity <8");
	}
	this.nodeCapacity=nodeCapacity;
	firstNode=new ListNode();
	lastNode=firstNode;
	
}
public UlinkedLst()
{
	this(5);
}
public boolean isEmpty()
{
	return (size==0);
}
public void addElem(int index,E element) throws IndexOutOfBoundsException{
	if(index<0 || index>size) {
		throw new IndexOutOfBoundsException();
	}
	ListNode node;
	int p=0;
	if(size-index>index)
	{
		node=firstNode;
		while(p<=index-node.numElements)
		{
			p+=node.numElements;
			node=node.next;
		}
	}else
	{
		node=lastNode;
		p=size;
		while((p-=node.numElements)>index)
		{
			node=node.prev;
		}
	}
	insertintoNode(node,index-p,element);
}
public void insertintoNode(ListNode node,int ptr,E element)
{
	if(node.numElements==nodeCapacity)
	{
		ListNode newNode=new ListNode();
		int elementsToMove=nodeCapacity/2;
		int startIndex=nodeCapacity-elementsToMove;
		for(int i=0;i<elementsToMove;i++)
		{
			newNode.elements[i]=node.elements[startIndex+i];
			node.elements[startIndex+i]=null;
			
		}
		node.numElements-=elementsToMove;
		newNode.numElements=elementsToMove;
		newNode.next=node.next;
		newNode.prev=node;
		if(node.next!=null)
		{
			node.next.prev=newNode;
		}
		node.next=newNode;
		if(node==lastNode)
			lastNode=newNode;
		if(ptr>node.numElements)
		{
			node=newNode;
			ptr-=newNode.numElements+1;
		}
	}
	for(int i=node.numElements;i>ptr;i--)
	{
		node.elements[i]=node.elements[i-1];
		
	}
	node.elements[ptr]=element;
	node.numElements++;
	size++;
	modCount++;
}
private void removeFromNode(ListNode node,int ptr)
{
	node.numElements--;
	for(int i=ptr;i<node.numElements;i++)
	{
		node.elements[i]=node.elements[i+1];
	}
	node.elements[node.numElements]=null;
	if(node.next!=null && node.next.numElements+node.numElements<=nodeCapacity)
	{
		mergeWithNextNode(node);
	}
	else if(node.prev!=null && node.prev.numElements+node.numElements<=nodeCapacity)
	{
		mergeWithNextNode(node.prev);
	}
	size--;
	modCount++;
}
public void mergeWithNextNode(ListNode node)
{
	ListNode curr=node.next;
	for(int i=0;i<curr.numElements;i++)
	{
		node.elements[node.numElements+i]=curr.elements[i];
		curr.elements[i]=null;
	}
	node.numElements+=curr.numElements;
	if(curr.next!=null)
	{
		curr.next.prev=node;
	}
	node.next=curr.next.next;
	if(curr==lastNode)
	{
		lastNode=node;
	}
}
public E remove(int index) throws IndexOutOfBoundsException
{
	if(index<0 || index>=size)
	{
		throw new IndexOutOfBoundsException();
	}
	E element=null;
	ListNode node;
	int p=0;
	if(size-index>index)
	{
		node=firstNode;
		while(p<=index-node.numElements)
		{
			p+=node.numElements;
			node=node.next;
		}
			
	}
	else
	{
		node=lastNode;
		p=size;
		while((p-=node.numElements)>index)
		{
			node=node.prev;
		}
	}
	element=(E) node.elements[index-p];
	removeFromNode(node, index-p);
	return element;
	
}
public boolean add(E e)
{
	insertintoNode(lastNode, lastNode.numElements, e);
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UlinkedLst<Integer> ul=new UlinkedLst<>();
		ul.add(1);
		ul.add(2);
		ul.add(3);
		ul.add(4);
		ul.add(5);
		ul.add(6);
		ul.addElem(5, 7);
		ul.addElem(2, 9);
		System.out.println(ul.remove(2));
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
