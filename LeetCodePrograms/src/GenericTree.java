class GenericTreeNodes{
	public int data;
	public GenericTreeNodes firstChild;
	public GenericTreeNodes nextSibling;
	public GenericTreeNodes(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	
	public GenericTreeNodes getFirstChild()
	{
		return this.firstChild;
	}
	public void setFirstChild1(GenericTreeNodes firstChild)
	{
		 this.firstChild=firstChild;
	}
	public GenericTreeNodes getNextSibling()
	{
		return this.nextSibling;
	}
	public void setNextSibling(GenericTreeNodes nextSibling)
	{
		 this.nextSibling=nextSibling;
	}
}


public class GenericTree {
	public int FindSum(GenericTreeNodes root)
	{
		if(root==null) return 0;
		return root.getData()+FindSum(root.getFirstChild())+FindSum(root.getNextSibling());
	}
	public int FindDepth(int[] p)
	{
		int maxDepth=-1,currDepth=-1,j;
		for(int i=0;i<p.length;i++)
		{
			currDepth=0;
			j=i;
			while(p[j]!=-1) {
				currDepth++;
				j=p[j];
			}
  			if(currDepth>maxDepth)
				maxDepth=currDepth;
		}
		return maxDepth;
	}
	public int countSiblings(GenericTreeNodes root)
	{
		if(root==null) return 0;
		int count =0;
		while(root!=null)
		{
			count++;
			root=root.getNextSibling();
		}
		return count;
		
	}
	public boolean isIsomorphic(GenericTreeNodes root1,GenericTreeNodes root2)
	{
		if((root1==null && root2!=null) || (root1!=null && root2==null) ) return false;
		if((root1==null && root2==null)) return true;
		return isIsomorphic(root1.getFirstChild(), root2.getFirstChild()) &&
				isIsomorphic(root1.getNextSibling(), root2.getNextSibling());
	}
	public int retChildCnt(GenericTreeNodes root)
	{
		int cnt=0;
		root=root.firstChild;
		while(root!=null)
		{
			cnt++;
			root=root.getNextSibling();
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTree gt=new GenericTree();
		GenericTreeNodes root=new GenericTreeNodes(1);
		root.firstChild=new GenericTreeNodes(2);
		root.firstChild.nextSibling=new GenericTreeNodes(3);
//		root.firstChild.nextSibling.firstChild=new GenericTreeNodes(4);
		root.firstChild.nextSibling.nextSibling=new GenericTreeNodes(5);
		GenericTreeNodes root1=new GenericTreeNodes(1);
		root1.firstChild=new GenericTreeNodes(2);
		root1.firstChild.nextSibling=new GenericTreeNodes(3);
		root1.firstChild.nextSibling.firstChild=new GenericTreeNodes(4);
		root1.firstChild.nextSibling.nextSibling=new GenericTreeNodes(5);
//		System.out.println(gt.FindSum(root));
		int[] p= {-1,0,1,6,6,0,0,2,7};
//		System.out.println(gt.FindDepth(p));
//		System.out.println(gt.isIsomorphic(root, root1));
		System.out.println(gt.retChildCnt(root));
	}

}
