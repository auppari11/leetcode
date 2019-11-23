
public class JavaSymmetric {

	public class TreeNode {
		       int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	TreeNode parent;
	int left=0,right=0,len=0;
	public void insert(int element)
	{
		if(parent==null)
		{
			parent=new TreeNode(element);
			System.out.println("At parent node "+parent.val);
		}
		else
		{
			
			if(!insertleft(element))
			{
				System.out.println("here1");
				if(!insertright(element))
				{
					System.out.println("here2");
				   if(left!=2)
				   {
					parent.left=parent;
					System.out.println("here3");
					if(!insertleft(element))
					{
						insertright(element);
						System.out.println("here4");
					}
					left++;
				   }
				   else if(right!=2)
				   {
					   parent.right=parent;
					   System.out.println("here5");
					   if(!insertleft(element))
						{
							insertright(element);
							System.out.println("here6");
						}
						right++;
				   }
				   
				}
			}
			if(left==2 && right==2)
			{
				left=0;
				right=0;
				System.out.println("here7");
			}
		}
		len++;
		
	}
	public boolean insertleft(int element)
	{
		if(parent.left==null)
		{
			parent.left=new TreeNode(element);
			System.out.println("At left node "+parent.left.val);
			return true;
		}
		return false;
	}
	public boolean insertright(int element)
	{
		if(parent.right==null)
		{
			parent.right=new TreeNode(element);
			System.out.println("At right node "+parent.right.val);
			return true;
		}
		return false;
	}
  
	public void display()
	{
		TreeNode n=parent;
		int cnt=0;
		for(int i=0;i<len;i++)
		{
		if(n!=null && cnt<=1)
		{
		System.out.println("Im parent" +n.val);
		System.out.println("Im left child"+n.left.val);
		System.out.println("Im right child"+n.right.val);
		if(cnt!=1)
		{
		n=n.left;
		}
		else
		{
			n=n.right;
		}
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSymmetric js=new JavaSymmetric();
		js.insert(1);
		js.insert(2);
		js.insert(3);
		js.insert(4);
		js.insert(5);
		js.insert(6);
		js.insert(7);
		js.insert(8);
		js.insert(9);
		js.display();
       
	}

}
