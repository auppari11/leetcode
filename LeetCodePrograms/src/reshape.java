
public class reshape {
public int[][] matrixReshape(int[][] nums, int r, int c) {
	
	if((r*c!=(nums.length)*(nums[0].length) )|| (r==nums.length && c==nums[0].length)) return nums;
	int i=0,j=0,row=0,col=0;
	int[][] retmax=new int[r][c];
	while(i<=nums.length-1 && j<=nums[0].length-1)
	{
		if(row<=r-1)
		{
		retmax[row][col++]=nums[i][j++];
		if(j==nums[0].length)
		{
			i++;
			j=0;
		}
		if(col==c)
		{
			row++;
			col=0;
		}
		}
		else break;
		
	}
        
       return retmax; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reshape rs=new reshape();
		int[][] nums= {{1,2},{3,4}};
		int[][] retmax=new int[1][4];
		retmax=rs.matrixReshape(nums,1, 4);
		for(int i=0;i<=retmax.length-1;i++)
		{
			for(int j=0;j<=retmax[0].length-1;j++)
			{
				System.out.print(retmax[i][j]);
			}
			System.out.println("");
		}
		
	}

}
