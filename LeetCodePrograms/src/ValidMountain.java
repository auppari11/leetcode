
public class ValidMountain {
	  public boolean validMountainArray(int[] A) {
		  if(A.length<3) return false;
		  int low=1,high=A.length-1;
		  char enterhigh='N',enteredlow='N';
		 for(int i=0;i<=A.length-1 && low<high ;i++)
		  {
			  if(A[low-1]<A[low]  )
			  {
				  low++;
				  enteredlow='Y';
				  
			  }
			  else if(A[low-1]==A[low]) return false;
			  if(A[high-1]>A[high])
			  {
				  high--;
				  enterhigh='Y';
			  }
			  else if(A[high-1]==A[high]) return false;
			 
		  }
		  if(high<=low && enterhigh=='Y' && enteredlow=='Y') return true;
		  return false;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidMountain vm=new ValidMountain();
//		int[] A= {0,3,2,1};
//		int[] A= {0,2,3,4,5,2,1,0};
//		int[] A= {0,2,3,3,4,5,2,1,0};
//		int[] A= {0,1,2,3,4,8,9,10,11,12,11};
//		int[] A= {1,3,2};
//		int[] A= {0,1,2,3,4,5,6,7,8,9};
		int[] A= {9,8,7,6,5,4,3,2,1,0};
		System.out.println(vm.validMountainArray(A));
	}

}
