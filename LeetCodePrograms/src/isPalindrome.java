
public class isPalindrome {
public boolean isPalindrome(String s) {
	if(s.isEmpty())
	{
		return true;
	}
	
	int head=0,tail=s.length()-1;
	char cHead,cTail;
	while(head<=tail)
	{
		cHead=s.charAt(head);
		cTail=s.charAt(tail);
		if(!Character.isLetterOrDigit(cHead))
		{
			head++;
		}
		else if(!Character.isLetterOrDigit(cTail))
		{
			tail--;
		}
		else if(Character.toLowerCase(cHead)!=Character.toLowerCase(cTail))
		{
			return false;
		}
		head++;
		tail--;
		
	}
	return true;
	/**
	String p="",s1="";
	if(s=="")
	{
		return true;
	}
	else
	{
	for(int i=s.length()-1;i>=0;i--)
	{
		if((s.charAt(i)>='A' && s.charAt(i)<='Z') || 
				(s.charAt(i)>='a' && s.charAt(i)<='z') ||
				(s.charAt(i)>='0' && s.charAt(i)<='9'))
		 p=p+s.charAt(i);
	}
	for(int j=0;j<=s.length()-1;j++)
	{
		if((s.charAt(j)>='A' && s.charAt(j)<='Z')|| 
				(s.charAt(j)>='a' && s.charAt(j)<='z') ||
				(s.charAt(j)>='0' && s.charAt(j)<='9'))
			 s1=s1+s.charAt(j);
	}
	System.out.println("p value "+p);
	System.out.println("s1 value "+s1);
        return p.equalsIgnoreCase(s1);
	}**/
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     isPalindrome ip=new isPalindrome();
    		boolean val= ip.isPalindrome("0P");
     System.out.println(val);
	}

}
