import java.util.ArrayList;
import java.util.List;

public class subdomain {
public List<String> subdomainVisits(String[] cpdomains) {
	List<String> ls1=new ArrayList<String>();
	System.out.println("len "+cpdomains.length);
	if(cpdomains.length==0) return ls1;
	for(int j=0;j<=cpdomains.length-1;j++)
	{
	  String s1=cpdomains[j].trim();
	  if(s1.length()>0)
	  {
	  int i=s1.indexOf(" "),temp=0;	  
	  int val=Integer.parseInt(s1.substring(0, i));
		 
		 System.out.println("val "+val+" i "+i+" s1 "+s1.length()+" "+s1.indexOf("d"));
//		 i=s1.indexOf(".")+1;
//		 String val1=s1.substring(i,s1.length());
//		  System.out.println("val1 "+val1+" i "+i);
//		  i=i+val1.indexOf(".")+1;
//		  String val2=s1.substring(i, s1.length());
//		  System.out.println(" i2 "+i+" val2 "+val2);
//		  i=val2.indexOf(".");
//		  System.out.println(i);
		 i=i+1;
		 
				  while(i<=s1.length()-1 && i!=-1)
				  {
					  
					  String val1=s1.substring(i,s1.length());
					  if(val1.indexOf(".")==-1) i=-1;
					  else
					  i=i+val1.indexOf(".")+1;
					  System.out.println("val1 "+val1);
					  for(String s:ls1)
					  {
//						  System.out.println("inside  "+s.substring(s.indexOf(" ")+1,s.length()));
						  if(s.substring(s.indexOf(" ")+1,s.length()).equalsIgnoreCase(val1))
						  {
//							  System.out.println("inside if "+s.substring(0, s.indexOf(" ")));
//							  String p=s;
							temp=Integer.parseInt(s.substring(0, s.indexOf(" ")));
							ls1.remove(s);
							break;
						  }
					  }
//					  System.out.println("val1 "+val1+" i "+i);
					  if(temp>0)
					  {
						  ls1.add((val+temp)+" "+val1);
						  temp=0;
					  }
					  else
				  		  ls1.add(val+" "+val1);
	  }
	  }
	}
        return ls1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subdomain sd=new subdomain();
		String[] cpdomains= {"9001 discuss.leetcode.com","1001 discuss1.leetcode.com"};
		List<String> ls=new ArrayList<String>();
		ls=sd.subdomainVisits(cpdomains);
         for(int i=0;i<=ls.size()-1;i++)
         {
        	 System.out.println("val "+ls.get(i));
         }
	}

}
