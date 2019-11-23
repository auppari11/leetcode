import java.util.ArrayList;
import java.util.List;

public class CamelCase {
public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> mp=new ArrayList<Boolean>();
        for(int i=0;i<=queries.length-1;i++)
        {
        	int j=0,cnt=0;
        	for(char c:queries[i].toCharArray())
        	{
        		if(j<=pattern.length()-1 && c==pattern.charAt(j)  )
        		{
        			cnt++;
        			j++;
        		}
        		else if(j<=pattern.length()-1 && Character.isUpperCase(c) && c!=pattern.charAt(j))
        		{
        			cnt++;
        		}
        		else if(j>pattern.length()-1)
        		{
        			if(Character.isUpperCase(c))
        			{
        				cnt++;
        			}
        		}		
        	}
        	
        		mp.add(cnt==pattern.length());
        	
        }
        return mp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CamelCase cm=new CamelCase();
		String[] queries= {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
//		String[] queries= {"ForceFeedBack"};
		System.out.println(cm.camelMatch(queries, "FB"));
	}

}
