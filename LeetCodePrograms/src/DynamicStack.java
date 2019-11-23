
public class DynamicStack {
	protected int capacity;
	public static final int cap=2;
	public static final int mincap=1<<15;
	protected int[] stackRep;
	protected int top=-1;
	public DynamicStack()
	{
		this(cap);
	}
	public DynamicStack(int cap)
	{
		capacity=cap;
		stackRep=new int[capacity];
	}
	public int size()
	{
		return top+1;
	}
	public boolean isEmpty()
	{
		return top<0;
	}
	public void pushData(int data)
	{
		if(size()==capacity) 
			expand();
		stackRep[++top]=data;
	}
	public void expand()
	{
		int len=size();
		int[] newStack=new int[len<<1];
		System.arraycopy(stackRep, 0, newStack, 0, len);
		stackRep=newStack;
		this.capacity=capacity<<1;
	}
	public int pop() throws Exception
	{
		if(isEmpty()) 
			throw new Exception("Stack underFlow");
		int data=stackRep[top];
		stackRep[top--]=Integer.MIN_VALUE;
		Shrink();
		return data;
	}
	public void Shrink()
	{
		int len=top+1;
		if(len<=mincap || top<<2 >=len) return;
		len=len+(top<<1);
		if(top<mincap) len=mincap;
		int[] newStack=new int[len<<1];
		System.arraycopy(stackRep, 0, newStack, 0, top+1);
		stackRep=newStack;
		this.capacity=len;
	}
	public int top() throws Exception
	{
		if(isEmpty()) 
			throw new Exception("Stack underFlow");
		return stackRep[top];
	}
	public String toString()
	{
		String s;
		s="[";
		if(size()>0) s=s+stackRep[0];
		for(int i=1;i<=size()-1;i++)
		{
			s=s+","+stackRep[i];
		}
		return s+"]";
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack as=new DynamicStack();
		System.out.println(as.mincap);
		as.pushData(1);
		as.pushData(2);
		as.pushData(3);
		as.pushData(4);
		as.pushData(5);
		as.pushData(6);
		as.pushData(7);
		as.pushData(8);
		System.out.println("arr list "+as.toString());
		as.pop();
		as.pop();
		as.pop();
		as.pop();
		as.pop();
		System.out.println("arr2 list "+as.toString());
		System.out.println("top list "+as.top());
	}

}
