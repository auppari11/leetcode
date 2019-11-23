import java.util.EmptyStackException;

public class Stackvthtwo {
	private int[] dataArray;
	private int size,topnOne,topTwo;
	public  Stackvthtwo(int size)
	{
		if(size<2) throw new IllegalStateException("Size <2 is no permissible");
		dataArray=new int[size];
		this.size=size;
		topnOne=-1;
		topTwo=size;		
	}
	public void push(int StackId,int data)
	{
		if(topTwo==topnOne+1) throw new StackOverflowError("stack overflow");
		if(StackId==1)
		{
			dataArray[++topnOne]=data;
		}
		else if (StackId==2)
		{
			dataArray[--topTwo]=data;
		}
	}
	public int pop(int StackId)
	{
		if(topnOne==-1 || topTwo==size) throw new EmptyStackException();
		if(StackId==1)
		{
			int Onepop=dataArray[topnOne];
			dataArray[topnOne--]=0;
			return Onepop;
		}
		else if(StackId==2)
		{
			int Twopop=dataArray[topTwo];
			dataArray[topTwo++]=0;
			return Twopop;
		}
		else return 0;
	}
	public int top(int StackId)
	{
		if(topnOne==-1 || topTwo==size) throw new EmptyStackException();
		if(StackId==1)
		{
			return dataArray[topnOne];
		}
		else if(StackId==2)
		{
			return dataArray[topTwo];
		}
		else return (Integer) null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackvthtwo st=new Stackvthtwo(10);
		st.push(1, 1);
		st.push(1, 2);
		st.push(1, 3);
		st.push(1, 4);
		st.push(1, 5);
		st.push(2, 10);
		st.push(2, 9);
		st.push(2, 8);
		st.push(2, 7);
		st.push(2, 6);
		for(int i=0;i<=st.dataArray.length-1;i++)
		{
			System.out.println("i "+i+" "+st.dataArray[i]);
		}
		st.pop(1);
		st.pop(2);
		System.out.println("s1");
		for(int i=0;i<=st.dataArray.length-1;i++)
		{
			System.out.println("i "+i+" "+st.dataArray[i]);
		}
		
	}

}
