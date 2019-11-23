
public class ReverseString {

public void reverseString(char[] s) {
	int initval=0,lastval=s.length-1;
	while(lastval>=(s.length/2))
	{
		char temp=s[initval];
		s[initval]=s[lastval];
		s[lastval]=temp;
		initval++;
		lastval--;
	}
	
	for(int k=0;k<s.length;k++)
	{
		System.out.println(s[k]);
	}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString rs=new ReverseString();
		char[] s= {'H','a','n','n','a','h'};
		rs.reverseString(s);
		
	}

}
