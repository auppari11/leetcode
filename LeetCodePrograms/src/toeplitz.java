
public class toeplitz {
    public boolean isToeplitzMatrix(int[][] matrix) {
     	int i=0,j=0;
    	
    		int row=0;
    		while(row+1<=matrix.length-1 &&  j+1<=matrix[0].length-1) 
    		{
    			if(matrix[row][j]==matrix[row+1][j+1] && i!=matrix.length-1)
    			{
    			row++;
    			j++;
    			if(row+1>=matrix.length || j+1>=matrix[0].length) 
    			{
    				row=i+1;
    				i++;
    				j=0;
    			}
    			}
    			else if(i==matrix.length-1) break;
    			else return false;
    		}
    	i=0;
    	j=1;
    			int colval=j;
    		while(colval+1<=matrix[0].length-1 && i+1<=matrix.length-1) 
    		{
    			if(matrix[i][colval]==matrix[i+1][colval+1] && j!=matrix[0].length-1)
    			{
    				i++;
    			colval++;
    			if(colval+1>=matrix[0].length || i+1>=matrix.length) 
    			{
    				colval=j+1;
    				j++;
    				i=0;
    			}
    			}
    			else if(j==matrix[0].length-1) break;
    			else return false;
    		}
    	
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toeplitz tp=new toeplitz();
		int[][] nums= {{1,2,3,4},
				  {5,1,2,3},
				  {9,5,1,2}};
//		int[][] nums= {{11,74,0,93},{40,11,74,7}};
		System.out.println(tp.isToeplitzMatrix(nums));
	}

}
