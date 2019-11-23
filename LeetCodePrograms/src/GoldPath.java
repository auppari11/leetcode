import java.util.HashMap;
import java.util.Map.Entry;

public class GoldPath {
public int getMaximumGold(int[][] grid) {
        if(grid.length==0) return 0;
//        int maxval=0;
//        HashMap<Integer, Integer> mp=new HashMap<>();
//        int row=0,col=0;
//        for(int i=0;i<=grid.length-1;i++)
//        {
//        	for(int j=0;j<=grid[0].length-1;j++)
//        	{
//        	   if(maxval<grid[i][j])
//        	   {
//        		   row=i;
//        		   col=i;
//        	   }
//        	}
//        	mp.put(row, col);
//        	maxval=0;     	
//        }
//        int maxvalfinal=0;
//        for(Entry<Integer, Integer> mval:mp.entrySet())
//        {
//        	 row=mval.getKey();
//        	 col=mval.getValue();
//        	while((row>=0 && row<=grid.length-1) && (col>=0 && col<=grid[0].length-1))
//        	{
//        		if(grid[row][col]==0) break;
//        		
//        		
//        	}
//        }
        int m=grid.length-1,n=grid[0].length-1;
        int rtval=0,downval=0,upval=0;
        for(int i=0;i<=m;i++)
        {
        	for(int j=0;j<=n;j++)
        	{
        		if(grid[i][j]==0) continue;
        		int low=i;
        		int high=j;
        		while(low<high)
        		{
        		 if(high+1<=n && grid[low][high+1]!=0) rtval=grid[low][high+1];
        		 if(low+1<=m && grid[low+1][high]!=0) downval=grid[low+1][high];
        		 if(low-1<=m && grid[low-1][high]!=0) upval=grid[low-1][high];
        		 int maxvalA=Math.max(rtval, down)
        		}
        			 
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldPath gp=new GoldPath();
		int[][] arr= {{0,6,0},
				 {5,8,7},
				 {0,9,0}};
		int val=gp.getMaximumGold(arr);
	}

}
