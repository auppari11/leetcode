import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> newlist=new ArrayList<Integer>();
    	if(matrix.length==0 || matrix[0].length==0) return newlist;
    	
    	if(matrix.length>0 && matrix[0].length>0)
    	{
    		int i=0,j=0,k=0,l=0,cnt=0;
    		int m=matrix.length-1,n=matrix[0].length-1,tot=(matrix.length)*(matrix[0].length);
    		char verup='N',verdown='N',hrxleft='Y',hrxrght='N';
    		while((i>=0 && i<=matrix.length-1) && (j>=0 && j<=matrix[0].length-1))
    		{
    			if(hrxleft=='Y')
    			{
    				System.out.println("hrx left");
    				for(j=l;j<=n;j++)
    				{
    					newlist.add(matrix[i][j]);
    					cnt++;
    					if(cnt==tot) break;
    					if(j==n)
    					{
    					  verdown='Y';
    					  hrxleft='N';
    					  k++;
    					}
    				}
    				j--;
    			}
    			else if(verdown=='Y')
    			{
    				System.out.println("verdown");
    				for(i=k;i<=m;i++)
    				{
    					newlist.add(matrix[i][j]);
    					if(i==m)
    					{
    					  verdown='N';
    					  hrxrght='Y';
    					  n--;
    					}
    					cnt++;
    					if(cnt==tot) break;
    				}
    				i--;
    			}
    			else if(hrxrght=='Y')
    			{
    				System.out.println("hrxrght");
    				for(j=n;j>=l;j--)
    				{
    					newlist.add(matrix[i][j]);
    					if(j==l)
    					{
    					  hrxrght='N';
    					  verup='Y';
    					  m--;
    					}
    					cnt++;
    					if(cnt==tot) break;
    				}
    				j++;
    			}
    			else if(verup=='Y')
    			{
    				System.out.println("verup");
    				for(i=m;i>=k;i--)
    				{
    					newlist.add(matrix[i][j]);
    					if(i==k)
    					{
    					  hrxleft='Y';
    					  verup='N';
    					  l++;
    					}
    					cnt++;
    					if(cnt==tot) break;
    				}
    				i++;
    			}
				if(cnt==tot) break;
    		}
    	}
        return newlist;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrix sm=new SpiralMatrix();
		List<Integer> lst =new ArrayList<Integer>();
		int arr[][]= {};
		lst=sm.spiralOrder(arr);
		for (int i=0;i<=lst.size()-1;i++)
		{
			System.out.println(lst.get(i));
		}
	}

}
