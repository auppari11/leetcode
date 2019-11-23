import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddCells {
public int oddCells(int n, int m, int[][] indices) {
	int[][] arr=new int[n][m];
	int cnt=0;
	for(int i=0;i<=indices.length-1;i++)
	{
		int row=indices[i][0];
		for(int j=0;j<=arr[0].length-1;j++) {
			arr[row][j]+=1;
//			System.out.println()
//			if(i==indices.length-1)
//			{
//				if(arr[row][j]%2!=0) 
//					{
//					System.out.println(i+" i "+arr[row][j]);
//					System.out.println("here1 row val "+row+" j val "+j);
//					cnt=cnt+1;
//					}
//			}
		}
		int col=indices[i][1];
		for(int p=0;p<=arr.length-1;p++)
		{
			arr[p][col]+=1;
//			if(i==indices.length-1)
//			{
//				if(arr[p][col]%2!=0) 
//					{
//					System.out.println("here2 p val "+p+" col val "+col);
//					cnt=cnt+1;
//					}
//			}
		}
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[0].length-1;j++)
		{
		 System.out.print(arr[i][j]+" ");
		 if(arr[i][j]%2!=0) 
				{
//				System.out.println("here2 p val "+p+" col val "+col);
				cnt=cnt+1;
				}
			
		}
		System.out.println("");
	}
		return cnt;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddCells oc=new OddCells();
		int[][] indices= {{1,1},{0,0}};
		System.out.println("cnt "+oc.oddCells(2, 2, indices));
	}

}
