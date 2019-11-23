import java.util.ArrayList;
import java.util.List;

public class QueenAttack {
	 public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
		 List<List<Integer>> lst=new ArrayList<>();
		 ArrayList<Integer> la=new ArrayList<>();
		 if(queens.length==0) return lst; 
		 int row1=king[0],column1=king[1],rowlength=queens.length-1,collength=queens[1].length;
//		 int rghtval=0,i=0,j=0;
//		 for(i=0;i<=rowlength-1;i++)
//		 {
//			 int Minval=collength,rtcol=0,ltcol=0;
//			 if(i==row1)
//			 	{ 
//			 for(j=king[1]+1;j<=collength-1;j++)
//			 	{
//				 	
//				 		if(j-column1<Minval)
//				 		{
//				 			Minval=j-column1;
//				 			rtcol=j;
//				 		}
//				 		
//				 	
//				 		
//				 	}
//			 	
//			 if(rtcol!=0)
//			 {
//			 	la.add(row1);
//			 	la.add(rtcol);
//			 	lst.add(la);
//			 }
//			 	
//			 Minval=collength;
//			 	 for( j=0;j<=king[1]-1;j++)
//				 	{
//					 	
//					 		if(column1-j<Minval)
//					 		{
//					 			Minval=column1-j;
//					 			ltcol=j;
//					 		}
//					 	
//					 		
//					 	}
//			 	if(ltcol!=0)
//				 {
//				 	la.add(row1);
//				 	la.add(ltcol);
//				 	lst.add(la);
//				 }
//			 	
//			 	}
//		 for( j=0;j<=collength-1;j++)
//		 {
//			 int Minvalrow=rowlength,rtrow=0,ltrow=0;
//			 if(j==column1)
//			 	{ 
//			 for( i=king[0]+1;i<=rowlength-1;i++)
//			 	{
//				 	
//				 		if(i-column1<Minvalrow)
//				 		{
//				 			Minvalrow=i-column1;
//				 			rtrow=i;
//				 		}
//				 		
//				 	}
//				 		
//				 	}
//			 if(rtrow!=0)
//			 {
//			 	la.add(rtrow);
//			 	la.add(column1);
//			 	lst.add(la);
//			 }
//			 Minvalrow=collength;
//			 	 for( i=0;i<=king[0]-1;i++)
//				 	{
//					 		if(column1-i<Minvalrow)
//					 		{
//					 			Minvalrow=column1-i;
//					 			ltrow=i;
//					 		}
//					 		
//					 	}
//			 	if(ltrow!=0)
//				 {
//				 	la.add(ltrow);
//				 	la.add(column1);
//				 	lst.add(la);
//				 }
//			 	}
//		 }
	       return lst; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenAttack qa=new QueenAttack();
		List<List<Integer>> lst=new ArrayList<>();
		int[][] queens={{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
		int[] king= {0,0};
		lst=qa.queensAttacktheKing(queens, king);
		System.out.println(lst);
		
	}

}
