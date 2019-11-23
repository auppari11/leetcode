public class nextLargerNodes {
	ListNode head;
	public class ListNode
	{
		int val;
		ListNode next;
		ListNode(int data)
		{
			val=data;
			next=null;
		}
	}
	public void pushData(int val)
	{
		if(head==null)
		{
			head=new ListNode(val);
		}
		else if(head!=null)
		{
			ListNode p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
				p.next= new ListNode(val);
		}
	}
	 public int[] nextLargerNodes(ListNode head) {
		 int totcnt=0;
		 ListNode k=head;
		 while(k!=null)
		 {
			 totcnt++;
			 k=k.next;
		 }
		 int[] arr1=new int[totcnt];
		 ListNode n=head;
		 int i=0,val=0;
		 char enter='N';
		 while(n!=null)
		 {
//			 pval=n.val;
//			 System.out.println("val heree "+pval);
			 ListNode knode=n.next;
			 while(knode!=null)
			 {
//				 System.out.println("val heree2 "+knode.val);
				 if(knode.val>n.val)
				 {
					val=knode.val;
					 enter='Y';
//					 System.out.println("here also");
					break;
				 }
				 else
				 {
					 knode=knode.next;
//					 System.out.println("here");
				 }
			 }
			 if(enter=='N')
			 {
				 arr1[i++]=0;
				 
			 }
			 else
			 arr1[i++]=val;
			 enter='N';
//			 System.out.println("val here "+cnt);
//			 for(int i=m;i<=cnt;i++)
//			 {
//				 
//					
//				 arr1[i]=val;
//				 
//				 System.out.println(arr1[i]+" "+i);
//			 }
//			 m=cnt+1;
//			 cnt=cnt;
			 n=n.next;
			 
		 }
		 return arr1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextLargerNodes n=new nextLargerNodes();
		n.pushData(1);
		n.pushData(7);
		n.pushData(5);
		n.pushData(1);
		n.pushData(9);
		n.pushData(2);
		n.pushData(5);
		n.pushData(1);
		int[] arr2=new int[8];
		arr2=n.nextLargerNodes(n.head);
		for (int j=0;j<=arr2.length-1;j++)
		{
			System.out.println("val "+arr2[j]);
		}

	}

}
