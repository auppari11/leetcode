import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SteppNumbers {
public List<Integer> countSteppingNumbers(int low, int high) {
	List<Integer> ls=new ArrayList<>();
        if(low>high ) return ls;
        Queue<Long> qu=new LinkedList<Long>();
        for(long i=1;i<=9;i++) qu.add(i);
        if (low == 0) ls.add(0);
        while (!qu.isEmpty()) {
            long p = qu.poll();
            if (p < high) {
                long last = p % 10;
                if (last > 0) qu.add(p * 10 + last - 1);
                if (last < 9) qu.add(p * 10 + last + 1);
            }
            if (p >= low && p <= high) {
                ls.add((int)p);
            }
        }
        return ls;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SteppNumbers sn=new SteppNumbers();
		List<Integer> ls=new ArrayList<>();
		ls=sn.countSteppingNumbers(120,125);
		for(int j=0;j<=ls.size()-1;j++)
	    {
	    	System.out.println(ls.get(j));
	    }
		
	}

}
