import java.util.HashMap;

public class DeleteColumnsSorted {

	 public int minDeletionSize(String[] A) {
		 if(A.length<=1) return A.length;
		 HashMap<Integer, Integer> mv=new HashMap<Integer,Integer>();
		 int cnt=0, k=0,tempval=0;
		 for(int i=0;i<=A.length-1;i++)
		 {
			 String s1=A[i];
			 for(int j=i+1;j<=A.length-1;j++)
			 {
				 System.out.println("j val "+j);
				String s2=A[j];
				
				 System.out.println("A[i].length()-1 "+ A[i].length());
				 while(k<=A[i].length()-1)
				 {
					 System.out.println("i val "+i+" j val "+j+" k val "+k);

					 System.out.println(" s1.charAt(k)" +s1.charAt(k) );
					 System.out.println(" s2.charAt(k)" +s2.charAt(k) );
				if(s2.charAt(k)-s1.charAt(k)<0 && !(mv.containsValue(k))) 
				{
					tempval++;	
					if(mv.isEmpty() || !(mv.containsValue(k)))
						mv.put(0,k);					
				}
				 k++;
				 System.out.println("tempval "+tempval);
			 }
				 if(tempval>0)
				 {
					 cnt++;
				 }
				 k=0;
				 tempval=0;
			
			 
			
			 }
		 }
		 return cnt;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteColumnsSorted dc=new DeleteColumnsSorted();
		String [] A= {"gazdgec","zceikgk","qjbxlkt","xprxqov"};
		int val=dc.minDeletionSize(A);
		System.out.println("val "+val);

	}

}
