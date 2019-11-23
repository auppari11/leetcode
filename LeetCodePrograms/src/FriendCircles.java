import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FriendCircles {
	 public int findCircleNum(int[][] M) {
		 List<List<Integer>> ls=new ArrayList<>();
		 HashMap<Integer, Integer> mp=new HashMap<>();
		 int cnt=0;
		 for(int i=0;i<=M.length-1;i++)
		 {
			 for(int j=0;j<=M[0].length-1;j++)
			 {
				 if(M[i][j]==1)
				 {
					ls.add(Arrays.asList(i,j));
					 
				 }
				 
			 }
		 }
		 int temp=0;
		 for(int i=0;i<=ls.size()-1;i++)
		 {
			 if(i==0) 
				 {
				 mp.put(ls.get(i).get(0),0);
				 temp=ls.get(i).get(1);
				 }
			 else 
			 {
				 if(ls.get(i).get(0)==temp && !mp.containsKey(ls.get(i).get(1)))
				 {
					 cnt++;
					 temp=ls.get(i).get(1);
					 mp.put(ls.get(i).get(1), 0);
				 }	 
			 }
		 }
	ls.contains(ls.contains(o))
		for(int i=0;i<=ls.size()-1;i++)
		{
			if(!mp.containsKey(ls.get(i).get(0)) && !mp.containsKey(ls.get(i).get(1)))
			{
				cnt++;
			}
		}
	      return cnt;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendCircles fc=new FriendCircles();
//		int[][] M= {{1,1,0},
//				 {1,1,0},
//				 {0,0,1}};
		int[][] M= {{1,1,0},
				 {1,1,1},
				 {0,1,1}};
//		int[][] M= {{1,0,0},{0,1,0},{0,0,1}};
		System.out.println(fc.findCircleNum(M));
	}

}
