
public class removeDuplicatesval {
public String removeDuplicates(String S) {
	if(S.length()<=1) return S;
	int i=0;
	  StringBuilder sb = new StringBuilder(S);
	while(i<=sb.length()-1)
	{
		if(i+1<=sb.length()-1 && sb.charAt(i)==sb.charAt(i+1))
		{
			sb.deleteCharAt(i);
			sb.deleteCharAt(i);
			i=0;
			continue;
		}
			i++;
	}
	
        
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicatesval rd=new removeDuplicatesval();
		System.out.println(rd.removeDuplicates("abb"));
	}

}
