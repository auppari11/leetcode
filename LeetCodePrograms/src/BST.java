import java.util.HashMap;

public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
public class BST {
	
	static TreeNode root1;
	static TreeNode root2;
	HashMap<Integer, Integer> mp=new HashMap<>();
public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
       if(root1==null || root2==null) return false;
    if(binarySearch(root2,target-root1.val))
    	return true;
    return twoSumBSTs(root1.left,  root2,  target)|| twoSumBSTs(root1.right,  root2,  target);
}
public boolean binarySearch(TreeNode root,int n)
{
	if(root==null) return false;
	if(root.val==n) return true;
	return n>root.val ? binarySearch(root.right, n) : binarySearch(root.left, n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bt=new BST();
		bt.root1=new TreeNode(2);
		bt.root1.left=new TreeNode(1);
		bt.root1.right=new TreeNode(4);
		
		bt.root2=new TreeNode(1);
		bt.root2.left=new TreeNode(0);
		bt.root2.right=new TreeNode(3);
		/*bt.root1=new TreeNode(0);
		bt.root1.left=new TreeNode(-10);
		bt.root1.right=new TreeNode(10);
		
		bt.root2=new TreeNode(5);
		bt.root2.left=new TreeNode(1);
		bt.root2.right=new TreeNode(7);
		bt.root2.left.left=new TreeNode(0);
		bt.root2.left.right=new TreeNode(2);*/
		
		Boolean b=bt.twoSumBSTs(root1, root2, 5);
		System.out.println(b);
	}

}
