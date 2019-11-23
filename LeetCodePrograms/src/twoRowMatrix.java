import java.util.ArrayList;
import java.util.List;

public class twoRowMatrix {
public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
	List<List<Integer>> ls=new ArrayList<>();
	ArrayList<Integer> ls1=new ArrayList<Integer>();
	ls1.
	int cnt=0;
	for(int i=0;i<colsum.length;i++) cnt=cnt+colsum[i];
	if(upper+lower!=cnt) return ls;
	int inc=0,j=0;
	int[] row1=new int[colsum.length];
	int row1cnt=0,rwo2cnt=0;
	int[] row2=new int[colsum.length];
		while(inc<=colsum.length-1)
		{
			if(colsum[inc]==2)
			{
				if(row1cnt<=upper)
				{
					row1[j]=1;
				}
				row2[j]=1;
			}
			else if(colsum[inc]==1)
			{
				row1[j]=1;
				row2[j]=1;
			}
		}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
