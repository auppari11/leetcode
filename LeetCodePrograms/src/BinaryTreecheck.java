
public class BinaryTreecheck {
	Node head;
	class Node{
		int key,cnt;
		Node left,right;
		Node(int val)
		{
			key=val;
			cnt=1;
			left=right=null;
		}
	}
	public Node insertData(Node current,int val)
	{
		if(current==null)
		{
			return new Node(val);
		}
		if (val < current.key) {
	        current.left = insertData(current.left, val);
	    } else if (val > current.key) {
	        current.right = insertData(current.right, val);
	    } 
	    else if (val==current.key)
	    {
	    	current.cnt++;
	    }
	    	else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
//		if(current.left==null)
//		{
//			current.left=insertData(current.left, val);
//		}
//		else if(current.right==null)
//		{
//			current.right=insertData(current.right, val);
//		}
//		else if(current.right!=null)
//			current.left=insertData(current.left, val);
//		else if(current.left!=null)
//			current.right=insertData(current.right, val);
//		else
//			return current;
		
//		return current;
	}
	public void loopData(Node current) {
		if(current==null)
			return;
		
			loopData(current.left);

		System.out.println("data "+current.key+" cnt "+current.cnt);

			loopData(current.right);

	}
	public void insertdata(int val)
	{
		head=insertData(head,val);
	}
    public void displayVal()
    {
    	loopData(head);
    }
    public void delete(int val)
    {
    	head=deleterec(head,val);
    }
    public Node deleterec(Node root,int val)
    {
    	if(root==null) return root;
    	if(val<root.key)
    		root.left=deleterec(root.left,val);
    	else if(val>root.key)
    		root.right=deleterec(root.right,val);
    	else
    	{
    		if(root.left==null) return root.right;
    		if(root.right==null) return root.left;
    		
    		root.key=minVal(root.right);
    		root.cnt=root.right.cnt;
    		root.right=deleterec(root.right,root.key);
    	}
    	return root;	
    }
    public int minVal(Node root)
    {
    	int miv=root.key;
    	while(root.left!=null)
    	{
    		miv=root.left.key;
    		root=root.left;
    	}
    	return miv;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreecheck bt=new BinaryTreecheck();
		bt.insertdata(6);
		bt.insertdata(8);
		bt.insertdata(2);
		bt.insertdata(1);
		bt.insertdata(4);
		bt.insertdata(2);
		bt.insertdata(5);
		bt.insertdata(9);
		bt.insertdata(9);
		bt.displayVal();
		bt.delete(2);
		System.out.println("after deleteing");
		bt.displayVal();
	}

}
