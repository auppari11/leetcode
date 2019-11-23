import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ancestor {
	BinaryTree root=null;
public static boolean printAllancestors(BinaryTree root,BinaryTree node)
{
	if(root==null)
	{
		return false;
		
	}
	if(root.getLeft()==node || root.getRight()==node || 
			printAllancestors(root.getLeft(), node)|| printAllancestors(root.getRight(), node))
	{
		System.out.println(root.getData());
		return true;
	}
	return false;
}
public BinaryTree LCA(BinaryTree root,BinaryTree a,BinaryTree b)
{
 BinaryTree left,right;
 if(root==null)
	 return root;
 if(root==a || root==b)
	 return root;
 left=LCA(root.left,a,b);
 right=LCA(root.right, a, b);
 if(left!=null && right!=null)
	 return root;
 else 
	 return (left!=null?left:right);
			
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
public ArrayList<ArrayList<Integer>> zigzagLevelOrder(BinaryTree root)
{
	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	if(root==null)
		return res;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	q.offer(null);
	boolean LefttoRight=true;
	ArrayList<Integer> curr=new ArrayList<>();
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		if(tmp!=null)
		{
			curr.add(tmp.data);
			if(tmp.left!=null)
				q.offer(tmp.left);
			if(tmp.right!=null)
				q.offer(tmp.right);
		}else
		{
			if(LefttoRight)
			{
				ArrayList<Integer> c_curr=new ArrayList<Integer>(curr);
				res.add(c_curr);
				curr.clear();
			}else
			{
				Stack<Integer> s=new Stack<Integer>();
				s.addAll(curr);
				ArrayList<Integer> c_curr=new ArrayList<Integer>();
				while(!s.isEmpty())
				{
					c_curr.add(s.pop());
				}
				res.add(c_curr);
				curr.clear();
				
			}
			if(!q.isEmpty())
			{
				q.offer(null);
				LefttoRight=!LefttoRight;
			}
		}
	}
	return res;
	
}
public void vSum(HashMap<Integer, Integer> mp,BinaryTree root,int c)
{
	if(root.left!=null)
		vSum(mp, root.left, c-1);
	if(root.right!=null)
		vSum(mp, root.right, c+1);
	int data=0;
	if(mp.containsKey(c))
	{
		data=mp.get(c);
	}
	mp.put(c,root.data+data);
}
public void verticalSum(BinaryTree root)
{
	HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
	vSum(mp,root,0);
	for(int k:mp.keySet())
	{
		System.out.println("pos "+k+" sum "+mp.get(k));
	}
	
}
public ArrayList<BinaryTree> generateTree(int n)
{
	if(n==0)
		return generateTree(1,0);
	return generateTree(1,n);
}
public ArrayList<BinaryTree> generateTree(int start,int end)
{
	ArrayList<BinaryTree> sub=new ArrayList<BinaryTree>();
	if(start>end)
	{
		sub.add(null);
		return sub;
	}
	for(int i=start;i<=end;i++)
	{
		for(BinaryTree left:generateTree(start, i-1))
		{
			for(BinaryTree right:generateTree(i+1,end))
			{
				BinaryTree aTree=new BinaryTree(i);
				aTree.left=left;
				aTree.right=right;
				sub.add(aTree);
			}
		}
	}
	return sub;
}
public BinaryTree BuildTreePreOrder(char[] A,int i)
{
	if(A==null)
		 return null;
	if(A.length==i)
		return null;
	BinaryTree newNode=new BinaryTree(A[i]);
	newNode.setLeft(null);
	newNode.setRight(null);
	if(A[i]=='L')
		return newNode;
	i=i+1;
	newNode.setLeft(BuildTreePreOrder(A, i));
	i=i+1;
	newNode.setRight(BuildTreePreOrder(A, i));
	return newNode;
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
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ancestor fm=new ancestor();
		fm.root=new BinaryTree(1);
		fm.root.left=new BinaryTree(2);
		fm.root.right=new BinaryTree(3);
		fm.root.left.left=new BinaryTree(4);
		fm.root.left.right=new BinaryTree(5);
		fm.root.right.left=new BinaryTree(6);
		fm.root.right.right=new BinaryTree(7);
		fm.root.left.left.left=new BinaryTree(8);
		fm.root.left.left.right=new BinaryTree(9);
//		fm.printAllancestors(fm.root, fm.root.left.left.left);
//		fm.PreOrder(fm.LCA(fm.root, fm.root.left.left.left, fm.root.right.right.left));
//		System.out.println(fm.zigzagLevelOrder(fm.root));
//		fm.verticalSum(fm.root);
//		System.out.println(fm.generateTree(3));
		char[] A= {'I','I','I','L','L','L','I','L','L'};
		fm.PostOrder(fm.BuildTreePreOrder(A, 0));
		
		
	}

}
