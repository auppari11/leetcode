import java.util.LinkedList;
import java.util.Queue;

public class BtreeFind {
	BinaryTree root=null;
public void FindElements(BinaryTree root) {
	Queue<BinaryTree> q=new LinkedList<BinaryTree>();
	if(root==null) return;
	root.setData(0);
	q.offer(root);
	q.offer(null);
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		if(tmp!=null)
		{
			if(tmp.left!=null)
			{
				tmp.getLeft().setData((tmp.getData()*2)+1);
				q.offer(tmp.left);
			}
			if(tmp.right!=null)
			{
				tmp.getRight().setData((tmp.getData()*2)+2);
				q.offer(tmp.right);
			}
		}
		else
		{
			if(!q.isEmpty())
				q.offer(null);
		}
		}
        
    }
public boolean find(int target) {
	Queue<BinaryTree> q=new LinkedList<BinaryTree>();
	if(root==null) return false;
	if(root.getData()==target) 
		return true;
	q.offer(root);
	q.offer(null);
	while(!q.isEmpty())
	{
		BinaryTree tmp=q.poll();
		if(tmp!=null)
		{
			if(tmp.left!=null)
			{
				if(tmp.getLeft().getData()==target)
					return true;
				else
				q.offer(tmp.left);
			}
			if(tmp.right!=null)
			{
				if(tmp.getRight().getData()==target)
					return true;
				else
				q.offer(tmp.right);
			}
		}
		else
		{
			if(!q.isEmpty())
				q.offer(null);
		}
		}
      return false;  
    }

public void preOrder(BinaryTree root)
{
	if(root!=null)
	{
	preOrder(root.left);
	System.out.println(root.getData());
	preOrder(root.right);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BtreeFind bt=new BtreeFind();
		bt.root=new BinaryTree(-1);
		bt.root.left=null;
		bt.root.right=new BinaryTree(-1);
//		bt.root.left.left=new BinaryTree(-1);
//		bt.root.left.right=new BinaryTree(-1);
//		bt.root.right.left=new BinaryTree(-1);
//		bt.root.right.left.left=new BinaryTree(-1);
		bt.FindElements(bt.root);
		bt.preOrder(bt.root);
		System.out.println(bt.find(1));
		System.out.println(bt.find(2));
	}

}
