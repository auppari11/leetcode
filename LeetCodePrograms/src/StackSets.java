import java.util.ArrayList;

class stackforstacksets{
	private int top=-1;
	private int[] arr;
	private int capacity;
	public stackforstacksets(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
	}
	public void push(int data)
	{
		arr[++top]=data;
	}
	public int pop()
	{
		return arr[top--];
	}
	public Boolean isAtCap()
	{
		return capacity==top+1;
	}
	public int size()
	{
		return top+1;
	}
	public String toString()
	{
		String s="";
		int index=top;
		while(index>=0) {
			s+="["+arr[index--]+"]"+"-->";
		}
		return s;
	}
}
public class StackSets {
private int threshold;
private ArrayList<stackforstacksets> los=new ArrayList<stackforstacksets>();
StackSets(int threshold)
{
	this.threshold=threshold;
}
public stackforstacksets getLastStack()
{
	int size=los.size();
	if(size<=0) return null;
	else return los.get(size-1);
}
public stackforstacksets getNthStack(int n)
{
	int size=los.size();
if(size<=0) return null;
else return los.get(n-1);
	
}
public void pushVal(int val)
{
	stackforstacksets s=this.getLastStack();
	if(s==null) {
		s=new stackforstacksets(threshold);
		s.push(val);
		los.add(s);		
	}else
	{
		if(!s.isAtCap()) s.push(val);
		else
		{
			stackforstacksets news=new stackforstacksets(threshold);
			news.push(val);
			los.add(news);
		}
	}
}
public int pop()
{
	stackforstacksets s=this.getLastStack();
	int v=s.pop();
	if(s.size()==0) los.remove(los.size()-1);
	return v;
}
public int pop(int n)
{
	stackforstacksets nth=this.getNthStack(n);
	int v=nth.pop();
	if(nth.size()==0) los.remove(los.size()-1);
	return v;
	}
public String toString()
{
	String s="";
for(int i=0;i<=los.size()-1;i++) {
	stackforstacksets nth=los.get(i);
	s="stack "+i+":"+nth.toString()+s;
	}
	return s;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackSets s=new StackSets(3);
		s.pushVal(1);
		s.pushVal(2);
		s.pushVal(3);
		s.pushVal(4);
		s.pushVal(5);
		s.pushVal(6);
		System.out.println(s.toString());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.toString());
		
	}

}
