
public class Removeadjacentdup {
public String removeDuplicates(String s, int k) {
	if(s.length()==0 || s.length()<=k) return s;
	String s2="";
	int p=0;
	 while(s.length()-1>0 && p<=s.length()-1)
	 {
		 int cnt=1;
		 char caught='N';
		 int i=p;
		 s2="";
		 while(i+1<=s.length()-1)
		 {
			 if(s.charAt(p)==s.charAt(i+1))
			 {
				 
				  if(k==(cnt+1))
				 {
					 caught='Y';
					 break;
				 }
				  else
					  cnt++;
			 }
			 else
			 {
				 break;
			 }
			 i++;
		 }
		 if(caught=='Y')
		 {
			 System.out.println("first val "+ i+" k "+k);
//			 if(i-1>0)
			 s2=s.substring(0,p);
			 
//			 System.out.println("s2 val "+ s2);
			 s2=s2+s.substring(p+cnt+1,s.length() );
//			 System.out.println("s2 val "+s2);
			 s=s2;
			 p=0;
		 }
		 else
		 {
			 p++;
		 }
	 }
      return s;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Removeadjacentdup rd=new Removeadjacentdup();
//		System.out.println("pbbcggttciiippooaais".substring(0, 1));
		String val=rd.removeDuplicates("abcd",2);
		System.out.println("val "+val);
	}

}
