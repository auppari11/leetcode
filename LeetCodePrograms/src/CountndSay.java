import java.util.HashMap;

public class CountndSay {
	 public String countAndSay(int n) {
		 int i=1;   
		 String val="",temp=Integer.toString(i);
		 HashMap<Integer, String> mp=new HashMap<Integer,String>();
			String nvalue="";
	        
	        int counter=1;
	        if(n==1)
	        {
	        	val=val+n;
	        	return val;
	        }
	        else
	        {
	        	int cnt;
	         for(int i1=2;i1<=n;i1++)
	         {
	        	 cnt=0;
	        	 System.out.println("i value "+i1+" "+temp);
	        	 System.out.println("check1 "+(temp.length()-1));
	            for(int j=0;j<=(temp.length())-1;j++)
	            {
	            	System.out.println("check2 "+j);
	            	if ((j+1)<=temp.length()-1)
	            	{
	            	if(temp.charAt(j)==temp.charAt(j+1))
	            	{
	            		System.out.println(temp.charAt(j));
	            		counter++;
	            		System.out.println("counter1 "+counter);
	            		}
	            	else
	            	{
	            		System.out.println("counter2 ");
	            		nvalue=nvalue+counter+temp.charAt(j);
	            		cnt++;
	            		mp.put(cnt, nvalue);
	            		nvalue="";
	            		counter=1;
	            		
	            	}
	            	}
	            	else
	            	{
	            		System.out.println("check3");
	            		nvalue=nvalue+counter+temp.charAt(j);
	            		cnt++;
	            		mp.put(cnt, nvalue);
	            		nvalue="";
	            		counter=1;
	            	}
	            }
	            temp="";
	            for(int p=1;p<=mp.size();p++)
	            {
	            	System.out.println("key value "+p+"value "+mp.get(p));
	            temp=temp+mp.get(p);
	            }
	            mp.clear();
	            System.out.println("----------------------------");
	           
	         }
	         val=temp;
	        }
	        return val;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountndSay cs = new CountndSay();
		String retval=cs.countAndSay(5);
		System.out.println(retval);
	}

}
