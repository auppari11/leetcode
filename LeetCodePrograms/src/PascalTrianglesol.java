import java.util.ArrayList;
import java.util.List;

public class PascalTrianglesol {
	public List<List<Integer>> generate(int numRows) {
	
		List<List<Integer>> ls=new ArrayList<List<Integer>>();
		if(numRows==0)
		{
			return ls;
		}
		ls.add(new ArrayList<>());
		ls.get(0).add(1);
		for(int rowNum=1;rowNum<numRows;rowNum++)
		{
			List<Integer> row=new ArrayList<>();
			List<Integer> prevrow=ls.get(rowNum-1);
			row.add(1);
			for(int j=1;j<rowNum;j++)
			{
				row.add(prevrow.get(j-1)+prevrow.get(j));
			}
			row.add(1);
			ls.add(row);
		}
		return ls;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTrianglesol pts=new PascalTrianglesol();
		List<List<Integer>> ls=new ArrayList<List<Integer>>();
		ls=pts.generate(5);
		for(int j=0;j<=ls.size()-1;j++)
		{
			System.out.println(ls.get(j));
		}
	}

}
