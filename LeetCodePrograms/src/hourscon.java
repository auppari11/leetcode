
public class hourscon {
	public String hourconver(String val)
	{
		if(val.length()<=4) return val;
		char[] arr=val.toCharArray();
		if(arr[0]=='?')
		{
//			System.out.println(Integer.parseInt(""+arr[1])<=3);
			if(arr[1]=='?' )
			{
				arr[0]='2';
			}
			else if( Integer.parseInt(""+arr[1])<=3)
			{
				arr[0]='2';
			}
			else if(Integer.parseInt(""+arr[1])>3)
			{
				arr[0]='1';
			}	
		}
		if(arr[1]=='?')
		{
			if(arr[0]=='2')
			{
				arr[1]='3';
			}
			else
			{
				arr[1]='9';
			}
		}
		if(arr[3]=='?')
		{
			arr[3]='5';
		}
		if(arr[4]=='?')
		{
			arr[4]='9';
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hourscon hc=new hourscon();
		System.out.println(hc.hourconver("06:34"));
	}

}
