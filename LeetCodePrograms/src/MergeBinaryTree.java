class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
public class MergeBinaryTree {
	
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
	 public TreeNode mergeTree(TreeNode t1,TreeNode t2)
	 {
		 if(t1==null && t2==null)
		 {
			 TreeNode newtree=null;
			 return newtree;
		 }
		 else if(t1==null)
		 {
			 return t2;
		 }
		 else if(t2==null)
		 {
			 return t1;
		 }
		 else
		 {
			 int kval=0,lval=0;
			 if(t1==null) kval=0; else kval=t1.val;
			 if(t2==null) lval=0; else lval=t2.val;
			 TreeNode newTree=null;
			 newTree=new TreeNode(kval+lval);
			 
			 newTree.left=mergeTree(t1.left, t2.left);
			 
			 newTree.right=mergeTree(t1.right, t2.right);
			 return newTree;
		 }
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeBinaryTree t1=new MergeBinaryTree();
		t1.root1=new TreeNode(1);
		t1.root1.left=new TreeNode(3);
		t1.root1.right=new TreeNode(2);
		//t1.root1.left.left=new TreeNode(5);
		
		MergeBinaryTree t2=new MergeBinaryTree();
		t2.root1=new TreeNode(2);
		t2.root1.left=new TreeNode(1);
		t2.root1.right=new TreeNode(3);
		t2.root1.left.right=new TreeNode(4);
		t2.root1.right.right=new TreeNode(7);
		
		System.out.println("loop1");
		t1.printloop(t1.root1);
		System.out.println("loop2");
		t1.printloop(t2.root1);
		TreeNode t3=t1.mergeTree(t1.root1,t2.root1);
		System.out.println("loop3");
		t1.printloop(t3);
	}

}
