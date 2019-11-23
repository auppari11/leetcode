
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
    	int[][] retma=new int[A[0].length][A.length];
    	int row=0,col=0;
    	System.out.println(A.length);
    	System.out.println(A[0].length);
        for(int i=0;i<=A.length-1;i++)
        {	
        	row=0;
        	for(int j=0;j<=A[0].length-1;j++)
        	{
        		retma[row++][col]=A[i][j];	
        	}
        	col++;
        }
        return retma;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransposeMatrix tm=new TransposeMatrix();
		int[][] A= {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] A= {{1,2,3},{4,5,6}};
		int[][] B=tm.transpose(A);
		for(int i=0;i<=B.length-1;i++)
		{
			for(int j=0;j<=B[0].length-1;j++)
			{
				System.out.print(B[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}

}
