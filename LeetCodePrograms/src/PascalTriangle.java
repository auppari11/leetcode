import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

public void generate(int numRows) {
	int intival=1,cnt=0;
	List<List<Integer>> listOLists = new ArrayList<List<Integer>>();
	List<Integer> ar=new ArrayList<Integer>();
	
	List<Integer> ar1=new ArrayList<Integer>();
	System.out.println("[");
	for(int i=0;i<=numRows-1;i++)
	{
		while(cnt<=i)
		{
			if(i>=2 && cnt!=0 && cnt!=i)
			{
//				System.out.println("cnt val "+cnt);
//				int k=cnt-1;
				
				int temp1=ar.get(cnt);
//				System.out.println("temp value "+temp1);
				int temp2=ar.get(cnt-1);
//				System.out.println("temp2 value "+temp2);
				int temp=temp1+temp2;
				ar1.add(temp);
				System.out.print(", \t"+temp);
			}
			else
			{
				if(cnt==i && i!=0)
				{
					System.out.print(", \t");
				}
				System.out.print(intival);
				ar1.add(intival);
			}
			cnt++;
		}
		System.out.println("");
//		listOLists.add(ar1);
//		System.out.println(listOLists.size());
//		System.out.println(listOLists.get(i));
//		System.out.println("-----------------------------------------------------------");
		for(int j=0;j<=ar1.size()-1;j++)
		{
//			System.out.println("check "+j+" "+ar1.get(j));
			Integer val=ar1.get(j);
			ar.add(j, val);
//			listOLists.get(i).add(j, val);
//			System.out.println("inside "+j+" "+" val "+val+" "+ar.get(j));
		}
//		System.out.println("-----------------------------------------------------------");
	    ar1.clear();
		cnt=0;
	}
	System.out.println("]");
	
//	return listOLists;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle pt =new PascalTriangle();
//		List<List<Integer>> listOLists = new ArrayList<List<Integer>>();
		pt.generate(6);
//	   for(int j=0;j<=listOLists.size()-1;j++)
//	   {
//		   System.out.println(listOLists.get(j));
//	   }
	}

}
