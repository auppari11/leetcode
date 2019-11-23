class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
public class BinaryTreeTilt {

	 TreeNode root1=null;
	 int tilt=0;
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
	    public int findTilt(TreeNode root) {
	        traverse(root);
	        return tilt;
	    }
	    public int traverse(TreeNode root)
	    {
	        if (root == null )
	            return 0;
	        int left = traverse(root.left);
	        int right = traverse(root.right);
	        tilt += Math.abs(left-right);
	        return left + right + root.val;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeTilt t1=new BinaryTreeTilt();
		t1.root1=new TreeNode(1);
		t1.root1.left=new TreeNode(2);
		t1.root1.right=new TreeNode(3);
		t1.root1.left.left=new TreeNode(4);
		t1.printloop(t1.root1);
		System.out.println("Here");
		int fval=t1.findTilt(t1.root1);
		System.out.println("tilt val "+fval);

	}

}
