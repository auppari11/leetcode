
public class decodeString {
	 public String decodeString(String s) {
		 if(s.length()<=1) return s;
		 int i=0,cnt=0;
		 
		 String s2="",val="",k="";
		 while(i<=s.length()-1)
		 {
			 if(Character.isDigit(s.charAt(i)))
			 {
				 System.out.println(s.charAt(i));
				 k=k+s.charAt(i);
				 i++;
			 }
			 else if(s.charAt(i)=='[') 
			 {
				 i++;
			 }
			 else if(s.charAt(i)==']'&& i+1<=s.length()-1)
			 {
				 if(!Character.isDigit(s.charAt(i+1)))
				 {
					 k="1";
				 }
				 i++;
			 }
			 else
			 {
				 val="";
				 while(i<=s.length()-1 && Character.isAlphabetic(s.charAt(i)))
				 {
					val=val+s.charAt(i);
					i++;
				 }
				 cnt=Integer.parseInt(k);
				 while(cnt>0)
				 {
					 s2=s2+val;
					 cnt--;
				 }
				 k="0";
			 }
			 
			if(i>=s.length()-1) break;
				 
		 }
	        return s2;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decodeString ds=new decodeString();
		System.out.println(ds.decodeString("3[a2[c]]"));
	}

}
