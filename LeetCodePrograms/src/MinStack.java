import java.util.ArrayList;

public class MinStack {
	 /** initialize your data structure here. */
	ArrayList<Integer> ll;
	int top;
    public MinStack() {
    	ll=new ArrayList<>();
        top=-1;
    }
    
    public void push(int x) {
        ll.add(x);
        top++;
    }
    
    public void pop() {
        ll.remove(top--);
    }
    
    public int top() {
        return ll.get(top);
    }
    
    public int getMin() {
    	int min=ll.get(0);
        for(int j=1;j<=ll.size()-1;j++)
        {
        	 if(min>ll.get(j))
         	{
         		
         		min=ll.get(j);
         	}
        	
        }
        return min;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
//		minStack.push(-2);
//		minStack.push(0);
		minStack.push(-3);
		int minval=minStack.getMin(); 
//		minStack.pop();
//		int gettopval=minStack.top();
//		int nextminval=minStack.getMin();
		System.out.println(minval);
//		System.out.println(gettopval);
//		System.out.println(nextminval);
	}

}
