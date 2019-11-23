import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftGrid {
	 public  List<List<Integer>> shiftGrid(int[][] grid, int k) {
		 List<List<Integer>> ls=new ArrayList<>();
		 if(grid.length==0 && grid[0].length==0) return null;
	        if(grid.length==1 && grid[0].length==1)
	        	{
	        	ls.add(Arrays.asList(grid[0][0]));
	        	return ls;
	        	}
	        int rowlen=grid.length-1;
	        int collen=grid[0].length-1;
	        
	        int cnt=0;
	        while(cnt<k)
	        {
	        	int temp=grid[rowlen][collen];
	        	int i=rowlen,j=collen;
	        	while(i>0 || j>0)
	        	{
	        		if(j==0)
	        		{
	        			grid[i][j]=grid[i-1][collen];
	        			i--;
	        			j=collen;
	        		}else
	        		{
	        			grid[i][j]=grid[i][j-1];
	        			j--;
	        		}
	        	
	        	}
	        	grid[0][0]=temp;
	        	cnt++;
	        }
	        
	        for(int m=0;m<=rowlen;m++)
	        {
	        	ArrayList<Integer> arr=new ArrayList<>();
	        	for(int n=0;n<=collen;n++)
	        	{
	        		arr.add(grid[m][n]);
	        	}
	        	ls.add(arr);
	        }
	      return ls;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShiftGrid sg=new ShiftGrid();
//		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr= {{215,-322,-930,-619,334,367,-381,-629,731,197,-340,333,-150,899,683,405,461,-104,-556,301,962,286,418,236,657,-27,-287,-410,-931}};
				
		System.out.println(sg.shiftGrid(arr, 93));
	}

}
