import java.util.HashMap;
import java.util.Map.Entry;

public class equalSubstring {
public int equalSubstring(String s, String t, int maxCost) {
	if(s.length()==0 || t.length() ==0) return 0;
	int[] diff=new int[t.length()];
	for(int i=0;i<=t.length()-1;i++)
	{
		diff[i]=Math.abs(s.charAt(i)-t.charAt(i));
	}
	int maxlen=0;
	int start=0;
	int curCost=0;
	
	for(int i=0;i<=diff.length-1;i++)
	{
		curCost+=diff[i];
		while(curCost>maxCost)
		{
			curCost-=diff[start];
			start++;
		}
		maxlen=Math.max(maxlen, i-start+1);
	}
	return maxlen;
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equalSubstring es=new equalSubstring();
//		System.out.println('b'-'a');
			int val=es.equalSubstring("krrgw", "zjxss",19);
			System.out.println("val "+val);
	}

}

