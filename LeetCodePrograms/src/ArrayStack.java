public class ArrayStack {
	protected int capacity;
	public static final int cap=10;
	protected int[] stackRep;
	protected int top=-1;
	public ArrayStack()
	{
		this(cap);
	}
	public ArrayStack(int cap)
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayStack as=new ArrayStack();
		as.pushData(1);
		as.pushData(2);
		as.pushData(3);
		as.pushData(4);
		as.pushData(5);
		System.out.println("arr list "+as.toString());
		as.pop();
		System.out.println("arr2 list "+as.toString());
		System.out.println("top list "+as.top());
	}
	public void pushData(int data) throws Exception
	{
		if(size()==capacity) 
			throw new Exception("Stack Overflow"); 
		stackRep[++top]=data;
	}
	public int pop() throws Exception
	{
		if(isEmpty()) 
			throw new Exception("Stack underFlow");
		int data=stackRep[top];
		stackRep[top--]=Integer.MIN_VALUE;
		return data;
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
}
