
public class monotone {
	 public boolean isMonotonic(int[] A) {
		 if(A.length==1) return true;
		 char check='N';
		 for(int i=1;i<=A.length-1;i++)
		 {
			 if(check=='N')
			 {
				 if(A[i-1]>A[i]) check='d';
				 else if(A[i-1]<A[i]) check='i';
				 
			 }
			 else if(check!='N')
			 {
				 if(check=='d' && A[i-1]<A[i])
				 {
					 return false;
				 }
				 else if(check=='i' && A[i-1]>A[i])
				 {
					 return false;
				 }
			 }
		 }
		 return true;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monotone mn=new monotone();
		int[] A= {1,1,1};
		System.out.println(mn.isMonotonic(A));
	}

}
