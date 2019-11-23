 class TreeNode {
	     int val;
	      TreeNode left;
	     TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class MaxDepthBTree {
	
	TreeNode root;
public int maxDepth(TreeNode root) {
	int max=1;
	if(root==null) return max;
	max++;
	if(root.left!=null)
	{
		max=maxDepth(root.left);
	}
	else if(root.right!=null)
	{
		max=maxDepth(root.right);
	}
	return max;
        
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDepthBTree md=new MaxDepthBTree();
		md.root=new TreeNode(3);
		md.root.left=new TreeNode(9);
		md.root.right=new TreeNode(20);
		md.root.right.left=new TreeNode(15);
		md.root.right.right=new TreeNode(7);
		int val=md.maxDepth(md.root);
		System.out.println(val);
		
		
	}

}
