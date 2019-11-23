
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

public class setZeros {
	   public void setZeroes(int[][] matrix) {
	        int j=0,i=0;
	       List<List<Integer>> ls=new ArrayList<>();
	       
	        while(i<=matrix.length-1)
	        {
	        	if(matrix[i][j]==0)
	        	{
	        		ls.add(Arrays.asList(i,j));
	        	}
	        	j++;
	        	if(j>=matrix[0].length)
	        	{
	        		i++;
	        		j=0;
	        	}
	        }
	        for(int p=0;p<=ls.size()-1;p++)
	        {
	        	System.out.println(ls.get(p).get(0));
	        	System.out.println(ls.get(p).get(1));
	        	for(int k=0;k<=matrix[0].length-1;k++)
	        	{
	        		matrix[ls.get(p).get(0)][k]=0;
	        	}
	        	for(int k=0;k<=matrix.length-1;k++)
	        	{
	        		matrix[k][ls.get(p).get(1)]=0;
	        	}
	        	
	        }
	        for(int p=0;p<=matrix.length-1;p++)
	        {
	        	for(int l=0;l<=matrix[0].length-1;l++)
	        	{
	        		System.out.print(matrix[p][l]);
	        	}
	        	System.out.println(" ");
	        }
	        System.out.println(ls);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setZeros sz=new setZeros();
		int[][] matrix= {{1,1,1},
				  {1,0,1},
				  {0,1,1}};
		sz.setZeroes(matrix);
	}

}
