
public class Queue {
private int[] queuerep;
private int size,front,rear;
private static int capacity=16;
public Queue()
{
	queuerep=new int[capacity];
	size=0;
	front=0;
	rear=0;
	
}
public Queue(int cap)
{
	queuerep=new int[cap];
	size=0;
	front=0;
	rear=0;
	this.capacity=cap;
	
}
public void enQueue(int data)
{
	if(size==capacity) throw new IllegalStateException("Queue is overflow");
	else
	{
		size++;
		queuerep[rear]=data;
		rear=(rear+1)%capacity;
		System.out.println(rear);
	}
	
}
public int deQueue()
{
	if(size==0) throw new IllegalStateException("Queue is underflow");
	else
	{
		size--;
		int val=queuerep[front%capacity];
		queuerep[front]=Integer.MIN_VALUE;
		front=(front+1)%capacity;
		return val;
	}
}
public String toString()
{
	String s="[";
	for(int i=0;i<size;i++)
	{
		s+=Integer.toString(queuerep[(front+i)%capacity]);
		if(i<size-1)
			s+=",";
	}
	return s+"]";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		System.out.println("val "+q.toString());
		q.deQueue();
		q.enQueue(6);
		System.out.println("val "+q.toString());
	}

}
