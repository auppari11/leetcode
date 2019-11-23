
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class BinaryTree
{
	int data;
	BinaryTree left,right;
	public BinaryTree(int data) {
		this.data=data;
		left=right=null;
	}
	public int getData()
	{
		return data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public BinaryTree getRight()
	{
		return this.right;
	}
	public void setRight(BinaryTree right)
	{
		this.right=right;
	}
	public BinaryTree getLeft()
	{
		return this.left;
	}
	public void setLeft(BinaryTree left)
	{
		this.left=left;
	}
}
public class TreeTraversal {
	public ArrayList<Integer> preOrderTraversal(BinaryTree root)
	{
		ArrayList<Integer> res=new ArrayList<>();
		if(root==null) return res;
		Stack<BinaryTree> s=new Stack<>();
		s.push(root);
		while(!s.isEmpty()) {
			BinaryTree tmp=s.pop();
			res.add(tmp.data);
			if(tmp.right!=null)
				s.push(tmp.right);
			if(tmp.left!=null)
				s.push(tmp.left);
		}
		return res;
	}
	public void PreOrder(BinaryTree root)
	{
		if(root!=null)
		{
			System.out.println(root.getData());
			PreOrder(root.left);
			PreOrder(root.right);
		}
		
	}
	public ArrayList<Integer> postOrderTraversal(BinaryTree root)
	{
		ArrayList<Integer> res=new ArrayList<>();
		if(root==null)
			return res;
		Stack<BinaryTree> s=new Stack<>();
		s.push(root);
		BinaryTree prev=null;
		while(!s.isEmpty())
		{
			BinaryTree curr=s.peek();
			if(prev==null || prev.left==curr ||  prev.right==curr)
			{
				if(curr.left!=null)
					s.push(curr.left);
				else if (curr.right!=null)
					s.push(curr.right);
			}else if(curr.left==prev)
			{
				if(curr.right!=null)
				{
					s.push(curr.right);
				}
			}else {
				res.add(curr.data);
				s.pop();
			}
			prev=curr;	
		}
		return res;
	}
	public void PostOrder(BinaryTree root)
	{
		if(root!=null)
		{
			
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.println(root.getData());
		}
		
	}
	public ArrayList<Integer> inOrderTraversal(BinaryTree root)
	{
		ArrayList<Integer> res=new ArrayList<>();
		Stack<BinaryTree> s=new Stack<>();
		BinaryTree currNode=root;
		boolean done=false;
		while(!done)
		{
			if(currNode!=null)
			{
				s.push(currNode);
				currNode=currNode.getLeft();
			}else
			{
				if(s.isEmpty())
					done=true;
				else
				{
					currNode=s.pop();
					res.add(currNode.getData());
					currNode=currNode.getRight();
				}
			}
		}
		return res;
	}
	public void InOrder(BinaryTree root)
	{
		if(root!=null)
		{
			
			InOrder(root.left);
			System.out.println(root.getData());
			InOrder(root.right);
		}
		
	}
	public ArrayList<ArrayList<Integer>> LevelOrderTraversal(BinaryTree root)
	{
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		if(root==null)
			return res;
		Queue<BinaryTree> q=new LinkedList<BinaryTree>();
		q.offer(root);
		q.offer(null);
		ArrayList<Integer> curr=new ArrayList<>();
		while(!q.isEmpty())
		{
			BinaryTree tmp=q.poll();
			if(tmp!=null)
			{
				curr.add(tmp.getData());
				if(tmp.getLeft()!=null)
					q.offer(tmp.getLeft());
				if(tmp.getRight()!=null)
					q.offer(tmp.getRight());
			}else
			{
				ArrayList<Integer> c_curr=new ArrayList<Integer>(curr);
				res.add(c_curr);
				curr.clear();
				if(!q.isEmpty())
					q.offer(null);
			}
		}
		
	return res;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTraversal t=new TreeTraversal();
		BinaryTree root=new BinaryTree(1);
		root.left=new BinaryTree(2);
		root.right=new BinaryTree(3);
		root.left.left=new BinaryTree(4);
		root.left.right=new BinaryTree(5);
		root.right.left=new BinaryTree(6);
		root.right.right=new BinaryTree(7);
		root.left.left.left=new BinaryTree(8);
		root.left.left.right=new BinaryTree(9);
		t.PreOrder(root);
//		t.PostOrder(root);
//		t.InOrder(root);
//		System.out.println(t.preOrderTraversal(root));
//		System.out.println(t.inOrderTraversal(root));
//		System.out.println(t.postOrderTraversal(root));
//		System.out.println(t.LevelOrderTraversal(root));
	}

}
