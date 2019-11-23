
public class ToLowerCasePrg {

	  public String toLowerCase(String str) {
		  if(str.length()==0) return "";
		  String str1="";
		  if(str.length()>1)
		  {
			  for(int i=0;i<=str.length()-1;i++)
			  {
				  if(str.codePointAt(i)>=65 && str.codePointAt(i)<=90)
				  {
					  char c=(char) (str.codePointAt(i)+32);
					  str1=str1+c;  
				  }
				  else
					  str1=str1+str.charAt(i);   
			  }
		  }
		  System.out.println(str1);
		  return str1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToLowerCasePrg tl=new ToLowerCasePrg();
		String val=tl.toLowerCase("");
		System.out.println("val "+val);
	}

}
