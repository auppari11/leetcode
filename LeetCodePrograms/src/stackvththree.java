import java.util.EmptyStackException;

public class stackvththree {
	private int[] dataArray;
	private int size,topnOne,topTwo,topThree,baseThree;
	public stackvththree(int size)
	{
		if(size<3) throw new IllegalStateException("Size <3 is no permissible");
		dataArray=new int[size];
		this.size=size;
		topnOne=-1;
		topThree=size/2;
		topTwo=size;
		baseThree=size/2;
	}
	public void push(int StackId,int data)
	{
		if(StackId==1)
		{
			if(topnOne+1==topThree) 
				{
					if(stackThreeIsRightShiftable())
					{
						shiftStackToRight();
						dataArray[++topnOne]=data;
					}else throw new StackOverflowError("Stack1 has reached max limit");
				}else dataArray[++topnOne]=data; 
		}
		else if (StackId==2)
		{
			if(topTwo-1==topThree) 
			{
				if(stackThreeIsLeftShiftable())
				{
					shiftStackToLeft();
					dataArray[--topTwo]=data;
				}else throw new StackOverflowError("Stack2 has reached max limit");
			}else dataArray[--topTwo]=data; 
		}
		else if (StackId==3)
		{
			if(topThree+1==topTwo) 
			{
				if(stackThreeIsLeftShiftable())
				{
					shiftStackToLeft();
					dataArray[++topThree]=data;
				}else throw new StackOverflowError("Stack3 has reached max limit");
			}else dataArray[++topThree]=data; 
		}else return;
	}
	public int pop(int StackId)
	{
		if(StackId==1)
		{
			if(topnOne==-1) throw new EmptyStackException();
			int OnePop=dataArray[topnOne];
			dataArray[topnOne--]=0;
			return OnePop;
		}
		else if(StackId==2)
		{
			if(topTwo==size) throw new EmptyStackException();
			int twoPop=dataArray[topTwo];
			dataArray[topTwo++]=0;
			return topTwo;
		}
		else if(StackId==3)
		{
			if(topThree==size && dataArray[topThree]==0) throw new EmptyStackException();
			int threePop=dataArray[topThree];
			if(topThree>baseThree) dataArray[topThree--]=0;
			if(topThree==baseThree) dataArray[topThree]=0;
			dataArray[topThree--]=0;
			return threePop;
		}else
			return 0;
	}
	public int top(int StackId)
	{
		if(StackId==1)
		{
			if(topnOne==-1) throw new EmptyStackException();
			return dataArray[topnOne];
		}
		else if(StackId==2)
		{
			if(topTwo==size) throw new EmptyStackException();
			return dataArray[topTwo];
		}
		else if(StackId==3)
		{
			if(topThree==size && dataArray[topThree]==0) throw new EmptyStackException();
			return dataArray[topThree];
		}else
			return 0;
		
	}
	private void shiftStackToRight()
	{
		for(int i=topThree+1;i>=baseThree+1;i--)
		{
			dataArray[i]=dataArray[i-1];
		}
		dataArray[baseThree++]=0;
		topThree++;
	}
	private boolean stackThreeIsRightShiftable()
	{
		if(topThree+1<topTwo)
			return true;
		else
			 return false;
	}
	private void shiftStackToLeft()
	{
		for(int i=baseThree-1;i<=topThree-1;i++)
		{
			dataArray[i]=dataArray[i+1];
		}
		dataArray[topThree--]=0;
		baseThree--;
	}
	private boolean stackThreeIsLeftShiftable()
	{
		if(topnOne+1<baseThree)
			return true;
		else
			 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackvththree st=new stackvththree(10);
		st.push(1, 1);
		st.push(2, 3);
		st.push(3, 4);
		st.push(2, 6);
		st.push(2, 9);
		st.push(2, 10);
		st.push(1, 11);
		st.push(3, 4);
		st.push(2, 19);
		st.push(1, 20);
		System.out.println("s1");
		for(int i=0;i<=st.dataArray.length-1;i++)
		{
			System.out.println("i "+i+" "+st.dataArray[i]);
		}
	}
	

}
