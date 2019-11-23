
public class Atoi {
	public int myAtoi(String str) {
		if(str.length()==0)
        return 0;
		if(str.length()==1 )
		{
			if(Character.isDigit(str.charAt(0)))
			{
				
				return Integer.parseInt(str);
			}
			else return 0;
		}
		else
		{
		int max_val=2147483647,min_val=-2147483648;		
		String val=str.trim();
		System.out.println(str.trim());
		String str1="";
		int k=0;
		for(int j=0;j<=val.length()-1;j++)
		{
			if((val.charAt(j)=='-' || val.charAt(j)=='+') && j==0)
			{
				if(val.charAt(j)=='-')
				{
					str1=str1+"-";
					k=1;
				}
			}
			else if(Character.isDigit(val.charAt(j)))
			{
				str1=str1+val.charAt(j);
			}
			else if((val.charAt(j)=='-' || val.charAt(j)=='+') && j==1) return 0;
			else
			{
				break;
			}	
		}
		System.out.println(str1);
		if(str1.length()<=0) return 0;
		try
		{
		 return Integer.parseInt(str1);
		}
		catch(NumberFormatException ne)
		{
			
			if(str1.length()>1)
			{
			if(k==1) return min_val;
			else return max_val;
			}
			else return 0;
		}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atoi ai=new Atoi();
		int i=ai.myAtoi("-abc");
		System.out.println("i val "+i);
	}

}
