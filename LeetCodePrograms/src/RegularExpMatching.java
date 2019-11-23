
public class RegularExpMatching {

public boolean isMatch(String s, String p) {
	char flag='N';
	String newval="";
	if(s==null || p==null)
	return false;
	else if(s.equals(p))
	{
		return true;
	}
	else
	{
		int j=0,i=0;
		for( i=0;i<=p.length()-1;i++)
		{
			if(j<=s.length()-1 && i!=p.length())
			{
			System.out.println("i value "+i+"and its value "+p.charAt(i));
			System.out.println("j value "+j+"and its value "+s.charAt(j));
			if(p.charAt(i)==s.charAt(j))
			{
				newval=newval+s.charAt(j);
				flag='Y';
			  j++;
			}
			else if(p.charAt(i)=='*')
			{
				if(i>=1)
				{
					char temp=p.charAt(i-1);
					if(temp=='.' || temp==s.charAt(j))
					{
						
						newval=newval+s.charAt(j);
						flag='Y';
						j++;
					}	
				}
				else
				{
					newval=newval+s.charAt(j);
					flag='Y';
					  j++;
				}
				
			}
			else if(p.charAt(i)=='.')
			{
				newval=newval+s.charAt(j);
				flag='Y';
				j++;
			}
			else if(p.charAt(i)!=s.charAt(j))
			{
				if(p.charAt(i+1)=='*')
				{
			        i++;
				}
			}
			}
			else
			{
				flag='N';
			}
		}
		System.out.println(s.length());
		System.out.println("i "+i+" "+p.length());
//		if(s.equals(newval) )
//		{
//			
//			flag='Y';
//		}
	}
	if(s.equals(newval) && flag=='Y')
	{
	return true;
	}
	else
	{
		return false;
	}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularExpMatching re=new RegularExpMatching();
		String s="aaa",p="ab*a*c*a";
		System.out.println(re.isMatch(s,p));
	}

}
