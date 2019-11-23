
public class GroupsofSpecialEquivalent {
	   public int numSpecialEquivGroups(String[] A) {
		   int j=A.length-1,i=0;
		   List<>
	        while(i<=A.length-1)
	        {
	        	if(i%2==j%2 && i!=j)
	        	{
	        		int k=0,l=A[0].length()-1;
	        		String val1=A[i],val2=A[j];
	        		while(k>=A[0].length()-1 && l<=0)
	        		{
	        			if(val1.charAt(k)==val2.charAt(l))
	        			{
	        				if(k==A[0].length()-1 && l==0)
	        				{
	        					
	        				}
	        				k++;
	        				l--;
	        			}
	        			else break;
	        		}
	        	}
	        	else if(i==j) i++;
	        	j--;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupsofSpecialEquivalent ge=new GroupsofSpecialEquivalent();
		String[] A= {"a","b","c","a","c","c"};
		System.out.println(ge.numSpecialEquivGroups(A));
	}

}
