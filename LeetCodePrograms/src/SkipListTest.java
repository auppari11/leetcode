import java.util.Random;

public class SkipListTest<T extends Comparable<T>,U> {
	private class Node{
		public T key;
		public U value;
		public long level;
		public Node next;
		public Node down;
		public Node(T key,U value,long level,Node next,Node down)
		{
			this.key=key;
			this.value=value;
			this.level=level;
			this.next=next;
			this.down=down;
		}
	}
	private Node head;
	private Random _random;
	private long size;
	private double _p;
	private long level()
	{
		long level=0;
		System.out.println(_random.nextDouble());
		while(level<=size && _random.nextDouble()<_p) {
			level++;
		}
		return level;
	}
	public SkipListTest()
	{
		head=new Node(null, null, 0, null, null);
		_random=new Random();
		size=0;
		_p=0.5;
	}
	public void add(T key,U value)
	{
		long level=level();
		if(level>head.level)
		{
			head=new Node(null,null, level, null, head);
		}
		Node cur=head;
		Node last=null;
		while(cur!=null)
		{
			if(cur.next==null || cur.next.key.compareTo(key)>0)
			{
				if(level>=cur.level)
				{
					Node n= new Node(key,value,cur.level,cur.next,null);
					if(last!=null)
					{
						last.down=n;
					}
					cur.next=n;
					last=n;
					
				}
				cur=cur.down;
				continue;
			}else if(cur.next.key.equals(key))
			{
				cur.next.value=value;
				return;
			}
			cur=cur.next;
			
		}
		size++;
	}
public U remove(T key)
{
	U value=null;
	Node cur=head;
	while(cur!=null)
	{
		if(cur.next==null || cur.next.key.compareTo(key)>=0)
		{
			if(cur.next!=null && cur.next.key.equals(key))
			{
				value=cur.next.value;
				cur.next=cur.next.next;
			}
			cur=cur.down;
			continue;
		}
		cur=cur.next;
		
	}
	size--;
	return value;
}
public U get(T key)
{
	Node cur=head;
	while(cur!=null)
	{
		if(cur.next==null || cur.next.key.compareTo(key)>0)
		{
			cur=cur.down;
			continue;
		}else if(cur.next.key.equals(key))
		{
			return cur.next.value;
		}
		cur=cur.next;
		
	}
	return null;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	SkipListTest st=new SkipListTest<>();
	st.add(1, 100);
	st.add(2, 101);
	st.add(4,105);
	st.add(3, 104);
	st.remove(2);
	}

}
