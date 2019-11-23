
public class FlipandInvert {
	  public int[][] flipAndInvertImage(int[][] A) {
		  if(A.length==0) return null;
		  int[][] ans=new int[A[0].length][A.length];
		  
		  for(int i=0;i<=A.length-1;i++) {
			  int k=A.length-1;
			  for(int j=0;j<=A.length-1;j++)
			  {
				  System.out.println("A[i][j] "+ i+ " "+j+" val "+A[i][j]);
				  System.out.println(" ");
				  ans[i][k]=A[i][j];
				   System.out.println("ans[i][k] "+ i+ " "+k+" val "+ans[i][k]);
				 
				   k--;
				  
			  }
		  }
		  
		  for(int i=0;i<=A.length-1;i++) {
			  for(int j=0;j<=A.length-1;j++) {
				  if(ans[i][j]==0) {
					  ans[i][j]=1;
				  }
				  else
					  ans[i][j]=0;			  }
		  }
		  return ans;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipandInvert fi=new FlipandInvert();
		int[][] num= {{1,1,0},{1,0,1},{0,0,0}};
//		System.out.print(num.length);
//		System.out.print(num[0].length);
		int[][] num1=fi.flipAndInvertImage(num);
		for(int i=0;i<=num1.length-1;i++) {
			  for(int j=0;j<=num1.length-1;j++) {
				  System.out.print(num1[i][j]);
			  }
			  System.out.println("\n");	
			  }
	}

}
