
public class CirccularQue {
	private int[] queuerep;
	private int size,front,rear;
	private static int capacity=16;
	private int mincapacity=1<<15;
	public CirccularQue()
	{
		queuerep=new int[capacity];
		size=0;
		front=0;
		rear=0;
		
	}
	public CirccularQue(int cap)
	{
		queuerep=new int[cap];
		size=0;
		front=0;
		rear=0;
		this.capacity=cap;
		
	}
	public void enQueue(int data)  
	{
		
		if(size==capacity)
		{
			expand();
		}
		
		size++;
		queuerep[rear]=data;
		rear=(rear+1)%capacity;
		
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
			Shrink();
			return val;
		}
	}
	private void expand()
	{
		int len=size;
		int[] newqueuerep=new int[len<<1];
		for(int i=front;i<=size;i++)
		{
			newqueuerep[i-front]=queuerep[i%capacity];
		}
		queuerep=newqueuerep;
		rear=size;
		front=0;
		capacity*=2;
		
	}
	public void Shrink()
	{
		int len=size;
		if(len<=mincapacity || len<<2>=len)
			return;
		if(len<mincapacity) len=mincapacity;
		int[] newque=new int[len];
		System.arraycopy(queuerep, 0, newque, 0, len+1);
		queuerep=newque;
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
		CirccularQue cq=new CirccularQue(4);
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);
		cq.enQueue(4);
		cq.enQueue(5);
		System.out.println("val "+cq.toString());
		cq.deQueue();
		cq.enQueue(6);
		System.out.println("val "+cq.toString());
	}

}
