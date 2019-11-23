
public class GreatestCommonDivisor {
	  public String gcdOfStrings(String str1, String str2) {
		  String strval=str1,strval2=str2,tempstr="";
		  if(str1.length()>str2.length())
		  {
			  strval=str2;
			  strval2=str1;
		  }
		  int j=0,i=0,k=j+1;
		  tempstr=strval2;
		  for(int p=0;p<=strval.length()-1;p++)
		  {
			  if(!strval2.contains(""+strval.charAt(p))) return "";
		  }
		  while(j<=strval.length()-1)
		  {
			  String substr1=strval2.substring(0, k);
			  if(substr1.equals(strval))
			  {	
				  i=k;
				  strval2=strval2.substring(i);
				  if(strval2.equals("")) return strval; 
		  		if(k>strval2.length() && !strval2.equals(""))
		  		{
		  			
		  			strval=strval.substring(j,strval.length());
		  			j++;
		  			strval2=tempstr;
		  			k=strval.length();
		  		}
		  		 
			  }else
			  {
				  strval=strval.substring(j,strval.length());
				  j++;
				  strval2=tempstr;
		  			k=strval.length();
			  }
		  }
	       
		  return "";
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestCommonDivisor gd=new GreatestCommonDivisor();
		System.out.println(gd.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
	}

}
