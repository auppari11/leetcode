
public class SubString {
public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
        {
        	return 0;
        }
        else 
        return	haystack.indexOf(needle);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubString str=new SubString();
		int n=str.strStr("aaaaa", "bba");
		System.out.println(n);

	}

}
