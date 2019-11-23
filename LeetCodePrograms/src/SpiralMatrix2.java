
public class SpiralMatrix2 {
public int[][] generateMatrix(int n) {
	int[][] arr1=new int[n][n];
        if (n==0) return arr1;
        System.out.println(n*n);
        int rowbegin=0,colbegin=0,rowend=arr1.length-1,colend=arr1[0].length-1;
        int val=0;
        while((rowbegin<=rowend) && (colbegin<=colend))
        {
        	for(int c=colbegin;c<=colend;c++)
        	{
        		if(val<=n*n)
        		{
        			val++;
        		arr1[rowbegin][c]=val;
        			
        		}
        	}
        	rowbegin++;
        	for(int r=rowbegin;r<=rowend;r++)
        	{
        		if(val<=n*n)
        		{
        			val++;
        		arr1[r][colend]=val;
        		}
        	}
        	colend--;
        	if(rowbegin<=rowend)
        	{
        		for(int c2=colend;c2>=colbegin;c2--)
            	{
        			if(val<=n*n)
            		{
        				val++;
            		arr1[rowend][c2]=val;
            		}
            	}
            	rowend--;
        	}
        	for(int r2=rowend;r2>=rowbegin;r2--)
        	{
        		if(val<=n*n)
        		{
        			val++;
        		arr1[r2][colbegin]=val;
        		}
        	}
        	colbegin++;
        	
        	if(val==n*n)
        		break;
       }
        return arr1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrix2 sm2=new SpiralMatrix2();
		int[][] arr=new int[3][3];
			arr=	sm2.generateMatrix(3);
			
		System.out.println("row "+arr.length);
		System.out.println("col "+arr[0].length);
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[0].length-1;j++)
			{
				System.out.println(arr[i][j]);
			}
		}

	}

}
