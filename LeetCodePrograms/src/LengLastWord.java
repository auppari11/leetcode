
public class LengLastWord {
	 public int lengthOfLastWord(String s) {
		 System.out.println(s.length());
		 if(s.length()==0) return 0;
		 StringBuilder sb=new StringBuilder(s);
		 sb.reverse();
		 System.out.println(s.trim().length());
		 System.out.println(s.trim().lastIndexOf(" ")-1);
		 System.out.println(s.trim().length()-s.trim().lastIndexOf(" ")-1);
		 if(sb.indexOf(" ", 0)==-1) return s.length();
		 if(sb.indexOf(" ", 0)==0)
		 {
			 if(sb.indexOf(" ", 1)==-1)
			 {
				 return sb.length()-1;
			 }
			 else
			 {
				 int i=0;
				 while(i<=sb.length()-1)
				 {
					 System.out.println("i value "+i+" "+sb.indexOf(" ", i+1));
					 if(sb.indexOf(" ", i+1)==i+1)
					 {
						 i=i+1;
					 }
					 else if(sb.indexOf(" ", i+1)==-1 && i==sb.length()-1)return 0;
					 else if(sb.indexOf(" ", i+1)==-1 && i!=sb.length()-1) return sb.length()-sb.indexOf(" ", i)-1;
					 else
						 break;
				 }
		
			  return sb.indexOf(" ", i+1)-(i+1);
			 }
		 }
		 else
			 return sb.indexOf(" ", 0); 	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LengLastWord l=new LengLastWord();
int cnt=l.lengthOfLastWord(" day by day   ");
System.out.println("cnt is "+cnt);

	}

}
