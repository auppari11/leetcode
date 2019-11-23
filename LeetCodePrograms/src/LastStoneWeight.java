import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class LastStoneWeight {
	 public int lastStoneWeight(int[] stones) {
	        List<Integer> ls=new ArrayList<>();
	        for(int i=0;i<=stones.length-1;i++)
	        {
	        	ls.add(stones[i]);
	        	
	        }
	        System.out.println(ls);
	        while(ls.size()>1)
	        {
	        	ls.sort(c);
	        }
	        return ls.size()==1?ls.get(0):0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastStoneWeight lsw=new LastStoneWeight();
		int[] stones= {2,7,4,1,8,1};
		System.out.println(lsw.lastStoneWeight(stones));
	}

}
