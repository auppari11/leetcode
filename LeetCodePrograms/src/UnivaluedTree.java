class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
public class UnivaluedTree {
	TreeNode root1=null;
	public  void printloop(TreeNode root)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 printloop(root.left);
		 System.out.println(" "+root.val);
		 printloop(root.right);
	 }

	public boolean isUnivalTree(TreeNode root) {
		return (root.left == null || root.left.val == root.val && isUnivalTree(root.left)) &&
	               (root.right == null || root.right.val == root.val && isUnivalTree(root.right));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnivaluedTree t1=new UnivaluedTree();
		t1.root1=new TreeNode(1);
		t1.root1.left=new TreeNode(1);
		t1.root1.right=new TreeNode(4);
		t1.root1.left.left=new TreeNode(1);
		t1.printloop(t1.root1);
		boolean b=t1.isUnivalTree(t1.root1);
		System.out.println("boolean val"+b);
	}

}
