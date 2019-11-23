import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class findMaxVal {
	int MaxVal=Integer.MIN_VALUE;
	public int MaxValBin(BinaryTree root)
	{
		
		if(root!=null)
		{
			int leftMax=MaxValBin(root.left);
			int rghtMax=MaxValBin(root.right);
			if(leftMax>rghtMax)
				MaxVal=leftMax;
			else
				MaxVal=rghtMax;
			if(MaxVal<root.getData())
			{
				MaxVal=root.getData();
			}
		}
		return MaxVal;
	}
	public int MaxLevelOrder(BinaryTree root)
	{
		if(root==null)
			return Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		Queue<BinaryTree> q=new LinkedList<BinaryTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryTree tmp=q.poll();
			if(tmp.getData()>max)
			{
				max=tmp.getData();
			}
			if(tmp!=null)
			{
				if(tmp.getLeft()!=null)
				 q.offer(tmp.getLeft());
				if(tmp.getRight()!=null)
					q.offer(tmp.getRight());
			}
		}
		return max;
	}
public boolean findElem(BinaryTree root,int elem)
{
	Queue<BinaryTree> q=new LinkedList<BinaryTree>();
	q.offer(root);
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		if(tmp.getData()==elem)
		{
			return true;
		}
		if(tmp!=null)
		{
			if(tmp.getLeft()!=null)
			 q.offer(tmp.getLeft());
			if(tmp.getRight()!=null)
				q.offer(tmp.getRight());
		}
	}
return false;
}
public boolean findElemrec(BinaryTree root,int elem)
{
	if(root==null) return false;
	if(root.getData()==elem) return true;
	return findElemrec(root.left, elem) || findElemrec(root.right, elem);
}
public void insertElem(BinaryTree root,int elem)
{
	Queue<BinaryTree> q=new LinkedList<BinaryTree>();
	q.offer(root);
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		if(tmp!=null)
		{
			if(tmp.getLeft()!=null)
			 q.offer(tmp.getLeft());
			else if(tmp.getLeft()==null)
			{
				BinaryTree node=new BinaryTree(elem);
				tmp.setLeft(node);
				break;
			}
			if(tmp.getRight()!=null)
				q.offer(tmp.getRight());
			else if(tmp.getLeft()==null)
			{
				BinaryTree node=new BinaryTree(elem);
				tmp.setRight(node);
				break;
			}
		}
	}
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
public void insertEemTr(BinaryTree root,int data)
{
	if(root==null)
	{
		root=new BinaryTree(data);
	}
	else
	{
		insert(root,data);
	}
}
public void insert(BinaryTree root,int data)
{
	if(root.getData()>=data)
	{
	if(root.getLeft()==null)
	{
		root.left=new BinaryTree(data);
	}else
	{
		insert(root.right, data);
	}
	}else
	{
		if(root.right==null)
		{
			root.right=new BinaryTree(data);
		}else
		{
			insert(root.right, data);
		}
	}
		
}
public int size(BinaryTree root)
{
	int leftCnt=root.left==null?0:size(root.left);
	int rghtcnt=root.right==null?0:size(root.right);
	return 1+leftCnt+rghtcnt;
}
public int retSize(BinaryTree root)
{
	
	int cnt=1;
	Queue<BinaryTree> q=new LinkedList<BinaryTree>();
	q.offer(root);
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		if(tmp!=null)
		{
			if(tmp.getLeft()!=null)
			{
			 q.offer(tmp.getLeft());
			 cnt++;
			}
			if(tmp.getRight()!=null)
			{
				q.offer(tmp.getRight());
				cnt++;
			}
		}
	}
return cnt;
}
public BinaryTree deleteTree(BinaryTree root,BinaryTree node)
{
	if(root==null) return null;
	Stack<BinaryTree> s=new Stack<>();
	s.push(root);
	BinaryTree prev=null;
	while(!s.isEmpty())
	{
		BinaryTree curr=s.peek();
		if(prev==null || prev.left==curr || prev.right==curr)
		{
			if(curr.left!=null)
				s.push(curr.left);
			else if(curr.right!=null)
				s.push(curr.right);
		}else if(curr.left==prev)
		{
			if(curr.right!=null)
			{
				s.push(curr.right);
			}
		}else
		{
			if(curr==node)
			{
				curr=null;
				return root;
			}else
				curr=null;
		}
	}
	return root;
}
public ArrayList<Integer> reverseOrder(BinaryTree root)
{
	ArrayList<Integer> ls=new ArrayList<>();
	if(root==null) return ls;
	Stack<BinaryTree> s=new Stack<>();
	s.push(root);
	Queue<BinaryTree> q=new LinkedList<BinaryTree>();
	q.offer(root);
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		if(tmp!=null)
		{
			
			if(tmp.getRight()!=null)
			{
				q.offer(tmp.getRight());
				s.push(tmp.getRight());
			}
			if(tmp.getLeft()!=null)
			{
			 q.offer(tmp.getLeft());
			 s.push(tmp.getLeft());
			}
		}
	}
	while(!s.isEmpty())
	{
		ls.add(s.pop().getData());
	}
	return ls;
}
public int MaxDepth(BinaryTree root)
{
	if(root==null)
		return 0;
	int lefDepth=MaxDepth(root.left);
	int rghtDepth=MaxDepth(root.right);
	return (lefDepth>rghtDepth)? lefDepth+1:rghtDepth+1;
	
}
public int MaxDepthVal(BinaryTree root)
{
	if(root==null)
		return 0;
	Stack<BinaryTree> s=new Stack<>();
	s.push(root);
	int maxDepth=0;
	BinaryTree prev=null;
			while(!s.isEmpty())
			{
				BinaryTree curr=s.peek();
				if(prev==null || prev.left==curr ||prev.right==curr)
				{
					if(curr.left!=null)
						s.push(curr.left);
					if(curr.right!=null)
						s.push(curr.right);
				}else if(curr.left==prev)
				{
					if(curr.right!=null)
					{
						s.push(curr.right);
					}
				}else {
					s.pop();
				}
				prev=curr;	
				if(s.size()>maxDepth)
					maxDepth=s.size();
			}
			return maxDepth-1;
}
public int maxDepthQ(BinaryTree root)
{
	if(root==null)
		return 0;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	q.offer(null);
	int count=1;
	while(!q.isEmpty())
	{
		BinaryTree currNode=q.poll();
		if(currNode!=null)
		{
			if(currNode.left==null && currNode.right==null)
			{
				return count;
			}
		
		if(currNode.left!=null)
		{
			q.offer(currNode.left);
		}
		if(currNode.right!=null)
		{
			q.offer(currNode.right);
		}
		}
	else
	{
		if(!q.isEmpty()) {
			count++;
			q.offer(null);
		}
	}
	}
	return count;
}
public int deepNode(BinaryTree root)
{
	if(root==null) return 0;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	BinaryTree tmp=null;
	while(!q.isEmpty())
	{
		 tmp=q.poll();
		if(tmp.left!=null)
			q.offer(tmp.left);
		if(tmp.right!=null)
			q.offer(tmp.right);
	}
	return tmp.getData();
}
public int countLeaf(BinaryTree root)
{
	if(root==null) return 0;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	BinaryTree tmp=null;
	int cnt=0;
	while(!q.isEmpty())
	{
		 tmp=q.poll();
		 if(tmp.left==null && tmp.right==null)
		 {
			 cnt++;
		 }
		if(tmp.left!=null)
			q.offer(tmp.left);
		if(tmp.right!=null)
			q.offer(tmp.right);
	}
	return cnt;
}
public int fullNodes(BinaryTree root)
{
	if(root==null) return 0;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	BinaryTree tmp=null;
	int cnt=0;
	while(!q.isEmpty())
	{
		 tmp=q.poll();
		 if(tmp.left!=null && tmp.right!=null)
		 {
			 cnt++;
		 }
		if(tmp.left!=null)
			q.offer(tmp.left);
		if(tmp.right!=null)
			q.offer(tmp.right);
	}
	return cnt;
}
public int halfNodes(BinaryTree root)
{
	if(root==null) return 0;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	BinaryTree tmp=null;
	int cnt=0;
	while(!q.isEmpty())
	{
		 tmp=q.poll();
		 if((tmp.left!=null && tmp.right==null) || (tmp.left==null && tmp.right!=null))
		 {
			 cnt++;
		 }
		if(tmp.left!=null)
			q.offer(tmp.left);
		if(tmp.right!=null)
			q.offer(tmp.right);
	}
	return cnt;
}
public boolean recCompare(BinaryTree root1,BinaryTree root2)
{
	if((root1==null && root2==null)) return true;
	if((root1==null || root2==null) || (root1.getData()!=root2.getData())) return false;
	
	return recCompare(root1.left, root2.left) && recCompare(root1.right, root2.right);
}
int diameter=0;
public int getDia(BinaryTree root)
{
	int left,right;
	if(root==null)
	{
		return 0;
	}
	left=getDia(root.left);
	right=getDia(root.right);
	if(left+right>diameter)
		diameter=left+right;
	return Math.max(Math.max(left, right)+1,diameter);
}
public int diameter(BinaryTree root)
{
	if(root==null) return 0;
	int len=height(root.left)+height(root.right)+3;
	int len2=Math.max(diameter(root.left), diameter(root.right));
	return Math.max(len, len2);
}
public int height(BinaryTree root)
{
	if(root==null)
		return 0;
	int leftD=height(root.left);
	int rightD=height(root.right);
	return leftD>rightD?leftD+1:rightD+1;
}
public int width(BinaryTree root)
{
	if(root==null) return 0;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	q.offer(null);
	int cnt=0,maxCnt=0;
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		
		if(tmp!=null)
		{
			if(tmp.getLeft()!=null)
				q.offer(tmp.left);
			if(tmp.getRight()!=null)
				q.offer(tmp.right);
			cnt++;
		}else
		{
			maxCnt=Math.max(maxCnt, cnt);
			if(!q.isEmpty())
			{
				q.offer(null);
				cnt=0;
				
			}
		}
	}
	return maxCnt;
}
public int levelMaxSum(BinaryTree root)
{
	if(root==null) return 0;
	Queue<BinaryTree> q=new LinkedList<>();
	q.offer(root);
	q.offer(null);
	int sum=0,maxSum=0;
	int level=0,newLevel=0;
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		
		if(tmp!=null)
		{
			if(tmp.getLeft()!=null)
				q.offer(tmp.left);
			if(tmp.getRight()!=null)
				q.offer(tmp.right);
			sum=sum+tmp.getData();
		}else
		{

			if(sum>maxSum)
			{
				maxSum=sum;
				newLevel=level;
			}
			if(!q.isEmpty())
			{
				q.offer(null);
				sum=0;
				level++;
				
			}
		}
	}
	return newLevel;
}
public void printPaths(BinaryTree root)
{
	int[] path=new int[256];
	printPaths(root,path,0);
}
public void printPaths(BinaryTree root,int[] path,int pathlen)
{
	if(root==null) return;
	path[pathlen]=root.getData();
	pathlen++;
	if(root.getLeft()==null && root.getRight()==null)
	{
		printArray(path,pathlen);
	}else {
		printPaths(root.left, path, pathlen);
		printPaths(root.right, path, pathlen);
	}
}
public void printArray(int[] ints,int len)
{
	for(int i=0;i<len;i++)
	{
		System.out.print(ints[i]);
	}
	System.out.println();
}

public boolean checkRootSum(BinaryTree root,int sum)
{
	if(root==null) return false;
	if(root.left==null && root.right==null && root.data==sum)
		return true;
	return checkRootSum(root.left, sum-root.getData())|| checkRootSum(root.right, sum-root.getData());
}
int val=0;
public int sumOfNodes(BinaryTree root)
{
	if(root==null) return 0;
	
	return root.getData()+sumOfNodes(root.getLeft())+sumOfNodes(root.getRight());
}
BinaryTree root=null;
public BinaryTree mirrorTree(BinaryTree root)
{
	BinaryTree temp;
	if(root!=null)
	{
		mirrorTree(root.left);
		mirrorTree(root.right);
		temp=root.left;
		root.left=root.right;
		root.right=temp;
		
	}
	return root;
	
}
public boolean mirrorTree(BinaryTree root,BinaryTree root1)
{
	if(root==null && root1==null) 
		return true;
	if(root==null || root1==null) 
		return false;
	if(root.getData()!=root1.getData()) 
		return false;
	else
	return mirrorTree(root.getLeft(), root1.getRight()) && mirrorTree(root.getRight(), root1.getLeft());
	
}
public BinaryTree buildBinaryTree(int[] postOrder,int[] inOrder)
{
	if(postOrder.length==0 || inOrder.length!=inOrder.length)
	return null;
//	return buildBT(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
	return buildPostBT(postOrder, 0, postOrder.length-1, inOrder, 0, inOrder.length-1);
}
public BinaryTree buildPostBT(int[] postOrder,int postStart,int postEnd,int[] inOrder,int inStart,int inEnd)
{
	if(postStart>postEnd || inStart>inEnd)
	{
		return null;
	}
	int data=postOrder[postEnd];
	int offset=inStart;
	BinaryTree curr=new BinaryTree(data);
	for(;offset<inEnd;offset++)
	{
		if(inOrder[offset]==data)
			break;
	}

	curr.left=buildPostBT(postOrder,postStart ,postStart+offset-inStart-1 ,inOrder, inStart, offset-1);
	curr.right=buildPostBT(postOrder, postStart+offset-inStart, postEnd-1, inOrder, offset+1, inEnd);
	return curr;
	
}
public BinaryTree buildBT(int[] preOrder,int preStart,int preEnd,int[] inOrder,int inStart,int inEnd)
{
	if(preStart>preEnd || inStart>inEnd)
	{
		return null;
	}
	int data=preOrder[preStart];
	BinaryTree curr=new BinaryTree(data);
	int offSet=inStart;
	for(;offSet<inEnd;offSet++)
	{
		if(inOrder[offSet]==data)
			break;
	}
	curr.left=buildBT(preOrder, preStart+1, preStart+offSet-inStart, inOrder, inStart, offSet-1);
	curr.right=buildBT(preOrder, preStart+offSet-inStart+1, preEnd, inOrder, offSet+1, inEnd);
	return curr;
}
public boolean QuasiIsomorphic(BinaryTree root1,BinaryTree root2)
{
	if(root1==null && root2==null)
	{
		return true;
	}
	if((root1==null && root2!=null) ||(root1!=null && root2==null))
		return false;
	return (QuasiIsomorphic(root1.getLeft(), root2.getLeft()) &&
			QuasiIsomorphic(root1.getRight(), root2.getRight())) ||
			(QuasiIsomorphic(root1.getLeft(), root2.getRight()) &&
			QuasiIsomorphic(root1.getRight(), root2.getLeft()));
			

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMaxVal fm=new findMaxVal();
		fm.root=new BinaryTree(1);
		fm.root.left=new BinaryTree(2);
		fm.root.right=new BinaryTree(3);
		fm.root.left.right=new BinaryTree(4);
//		fm.root.left.left=new BinaryTree(4);
//		fm.root.left.right=new BinaryTree(5);
//		fm.root.right.left=new BinaryTree(6);
//		fm.root.right.right=new BinaryTree(7);
//		fm.root.left.left.left=new BinaryTree(8);
//		fm.root.right.right.left=new BinaryTree(9);
		BinaryTree root1=new BinaryTree(1);
		root1.right=new BinaryTree(2);
		root1.left=new BinaryTree(2);
//		root1.right.left=new BinaryTree(5);
//		root1.left.left=new BinaryTree(4);
//		root1.left.right=new BinaryTree(5);
//		root1.right.left=new BinaryTree(6);
//		root1.right.right=new BinaryTree(7);
//		root1.left.left.left=new BinaryTree(8);
//		root1.right.right.left=new BinaryTree(9);
//		System.out.println(fm.mirrorTree(fm.root, root1));
//		System.out.println(fm.checkRootSum(root, 9));
		
//		System.out.println(fm.levelMaxSum(root));
//		fm.printPaths(root);
//		root.left.left.left=new BinaryTree(8);
//		root.right.right.left=new BinaryTree(9);
//		System.out.println(fm.recCompare(root, root1));
//		System.out.println(fm.halfNodes(root));
//		root.left.left.right=new BinaryTree(9);
//		System.out.println(fm.maxDepthQ(root));
//		System.out.println(fm.countLeaf(root));
//		System.out.println(fm.fullNodes(root));
//		System.out.println(fm.MaxDepth(root));
//		System.out.println(fm.reverseOrder(root));
//		fm.insertEemTr(root, 10);
//		fm.deleteTree(root,root.left.left);
//		fm.PreOrder(fm.root);
//		System.out.println("after image");
//		int[] preOrder= {1,2,4,5,3,6};
		int[] postOrder= {4,5,2,6,7,3,1};
		int[] inOrder= {4,2,5,1,6,3,7};
//		fm.PreOrder(fm.buildBinaryTree(postOrder, inOrder));
		System.out.println(fm.QuasiIsomorphic(fm.root, root1));
		
//		System.out.println("size="+fm.retSize(root));
//		System.out.println(fm.MaxValBin(root));
//		System.out.println(fm.MaxLevelOrder(root));
//		System.out.println(fm.findElem(root,90));
//		System.out.println(fm.findElemrec(root,9));
	}

}
