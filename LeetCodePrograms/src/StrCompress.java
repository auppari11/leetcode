
public class StrCompress {
	  public int compress(char[] chars) {
	        if(chars.length<=1) return chars.length;
	        int i=0,cnt=1,strval=0,highcnt=0;
	        while( i<=chars.length-1 )
	        {
	        	if(i+1<=chars.length-1 && chars[i]==chars[i+1])
	        	{
	        		cnt++;
	        		i++;
	        		continue;
	        	}
	        	else
	        	{
	        		if(cnt>1)
	        		{
	        			if(chars[i]==chars[strval]) {
	        				strval++;
	        				highcnt++;
	        			}
	        			else if(chars[i]!=chars[strval])
	        			{
	        				chars[strval]=chars[i];
	        				strval++;
	        				highcnt++;
	        				
	        			}
	        			while(cnt>=0)
	        			{
	        				System.out.println("val "+cnt%10);
	        				if(cnt<10)
	        				{
	        				chars[strval++]=(char)(cnt+'0');
	        				highcnt++;
	        				break;
	        				}
	        				else
	        				{
	        				chars[strval++]=  (char)((cnt/10)+'0');
	        				cnt=cnt%10;
	        				highcnt++;
	        				}
	        			}
	        			cnt=1;
	        		}
	        		else if(cnt==1)
	        		{
	        			if(chars[i]!=chars[strval]) chars[strval]=chars[i];
	        			highcnt++;
	        			strval++;
	        		}
	        		i++;
	        	}
	        	
	        }
	        for(int p=0;p<=highcnt-1;p++)
	        {
	        	System.out.println(chars[p]);
	        }
	        return highcnt;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrCompress sc= new StrCompress();
		char[] chars= {'a','a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','a'};
		System.out.println(sc.compress(chars));
	}

}
