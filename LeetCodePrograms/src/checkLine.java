import java.util.Arrays;

public class checkLine {
	 public boolean checkStraightLine(int[][] coordinates) {
		 if(coordinates.length<=1) return false;
		 double val=0.0;
		 if((coordinates[1][0]-coordinates[0][0])!=0)
	         val=((coordinates[1][1]-coordinates[0][1])*100/(coordinates[1][0]-coordinates[0][0]))/100.0;
		 else return false;  
		 System.out.println(val);
	        for(int j=1;j<=coordinates.length-1 && j+1<=coordinates.length-1;j++)
	   {
	        	System.out.println("here");
	        	if((coordinates[j+1][0]-coordinates[j][0])==0) return false;
	        	System.out.println(((coordinates[j+1][1]-coordinates[j][1])*100/(coordinates[j+1][0]-coordinates[j][0]))/100.0);
		   if(((coordinates[j+1][1]-coordinates[j][1])*100/(coordinates[j+1][0]-coordinates[j][0]))/100.0!=val) return false;
	   }
	   return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkLine cl=new checkLine();
//		int[][] coordinates= {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
//		int[][] coordinates={{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
//		int[][] coordinates={{-1,1},{-6,-4},{-6,2},{2,0},{-1,-2},{0,-4}};
		int[][] coordinates={{-3,-14},{-4,-21},{2,21},{7,56},{3,28}};
		System.out.println(cl.checkStraightLine(coordinates));
	}

}
