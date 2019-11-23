
public class isNumber {
	  public static boolean isNumber(String s) {
           s=s.trim();
           boolean pointseen=false;
           boolean eSeen=false;
           boolean numberSeen=false;
           boolean numAftere=true;
           for(int i=0;i<s.length();i++)
           {
        	   if(0<=s.charAt(i) && s.charAt(i)<=9)
        	   {
        		   numberSeen=true;
        		   numAftere=true;
        	   }
        	   else if(s.charAt(i)=='.')
        	   {
        		   if(eSeen || pointseen) return false;
        		   
        		   pointseen=true;
        	   }
        	   else if(s.charAt(i)=='e')
        	   {
        		   if(eSeen || !numberSeen) return false;
        		   
        		   eSeen=true;
        		   numAftere=false;
        	   }
        	   else if (s.charAt(i)=='-' || s.charAt(i)=='+')
        	   {
        		   if(i!=0 && s.charAt(i-1)!='e') {
        			   return false;
        		   }
        	   }
        	   else return false;
        	   }
           return numberSeen && numAftere;
           }
	

//           if(s.length()==0) return false;
//		  System.out.println("val "+s.length());
//	       if(!(s.matches("[0-9e+-.]*")))
//	       {
//	         return false;
//	       }
//	       else if(s.length()==1)
//	       {
//	    	  if(!(s.matches("[0-9]")))
//	    	  {
//	    		  System.out.println("val here ");
//	    		   return false;
//	    		   
//	    		   }
//	    	  return true;
//	       }
//	       else
//	       {
//	    		   
//	        int dotcnt=getcount(s,'.');
//	        int ecnt=getcount(s, 'e');
//	        int plcnt=getcount(s, '+');
//	        int micnt=getcount(s,'-');
//	        int getfrstocc=0,secndocc=0;
//	        System.out.println("val e "+ecnt+" " +getpos('e',0,s.length()-1,s));
//	        if(dotcnt>1 || (ecnt>1 || (ecnt==1 && getpos('e',0,s.length()-1,s)==0) || (ecnt==1 && getpos('e',0,s.length()-1,s)==s.length()-1) ) || plcnt>2 || micnt>2 || (plcnt>2 && micnt>2 )) return false;
//	        if( dotcnt==1 )
//	        {
//	        	System.out.println("heree ");
//	        	if(ecnt==1) {
//	        	if((getpos('e',0,s.length()-1,s)<getpos('.',0,s.length()-1,s))
//	        			||((getpos('.',0,s.length()-1,s)==0)&& (getpos('.',0,s.length()-1,s)+1)==getpos('e',0,s.length()-1,s) ))
//	        		return false;
//	        	}
////	        	System.out.println(s.charAt(getpos('.',0,s.length()-1,s)+1));
//	        	if(micnt!=0 || plcnt!=0)
//	        	{
//	        	if((getpos('.',0,s.length()-1,s)+1)==getpos('+',0,s.length()-1,s) || (getpos('.',0,s.length()-1,s)-1)==getpos('+',0,s.length()-1,s) 
//	        		||(getpos('.',0,s.length()-1,s)+1)==getpos('-',0,s.length()-1,s) || (getpos('.',0,s.length()-1,s)-1)==getpos('-',0,s.length()-1,s) //|| 
//	        			
//	        		)
//	        	{
//	        		return false;
//	        	}
//	        	}
//	        	if(!(s.charAt(getpos('.',0,s.length()-1,s)+1)>=0 || s.charAt(getpos('.',0,s.length()-1,s)+1)<=9)) return false;
//	        }
//	        if(plcnt==1)
//	        {
//	        	if(((getpos('+',0,s.length()-1,s)>0 && (getpos('+',0,s.length()-1,s)-1)==getpos('e',0,s.length()-1,s) && ecnt>0))
//	        			||(getpos('+',0,s.length()-1,s)>0))
//	        		return false;
//	        }
//	        if(micnt==1)
//	        {
//	        	if(((getpos('-',0,s.length()-1,s)>0 && (getpos('-',0,s.length()-1,s)-1)==getpos('e',0,s.length()-1,s) && ecnt>0))
//	        			||(getpos('-',0,s.length()-1,s)>0))
//	        		return false;
//	        }
//	        if(plcnt==1 && micnt==1)
//	        {
//	        	if((((getpos('-',0,s.length()-1,s)-1)==getpos('+',0,s.length()-1,s))
//	        			|| ((getpos('+',0,s.length()-1,s)-1)==getpos('-',0,s.length()-1,s)))
//	        		||(!(getpos('-',0,s.length()-1,s) ==0 && (getpos('+',0,s.length()-1,s)-1)==getpos('e',0,s.length()-1,s) && ecnt>0 )
//	        				|| !(getpos('-',0,s.length()-1,s) ==0 && (getpos('+',0,s.length()-1,s)-1)==getpos('e',0,s.length()-1,s) && ecnt>0 )
//	        				))
//                    return false;
//	        }
//	        if(plcnt ==2)
//	        {
//	        	 getfrstocc=getpos('+',0,s.length()-1,s);
//	        	 secndocc=getpos('+',getfrstocc+1,s.length()-1,s);
//	        	if(!(getfrstocc ==0 && secndocc-1==getpos('e',0,s.length()-1,s) && ecnt>0))
//	        		return false;
//	        }
//	        if(micnt ==2)
//	        {
//	        	 getfrstocc=getpos('-',0,s.length()-1,s);
//	        	
//	        	 secndocc=getpos('-',getfrstocc+1,s.length()-1,s);
//	        	if(!(getfrstocc ==0 && secndocc-1==getpos('e',0,s.length()-1,s) && ecnt>0))
//	        		return false;
//	        }
//	        
//	       } 
//	       return true;
//	        
//	    }
//	  public static int getcount(String s,char val)
//	  {
//		  int cnt=0;
//		  for(int i=0;i<=s.length()-1;i++)
//		  {
//			  if(val==s.charAt(i))
//			  {
//				  cnt++;
//			  }
//		  }
//		  return cnt;
//	  }
//    public static int getpos(char val,int startpos,int endpos,String s)
//    {
//    	return s.indexOf(val);
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isNumber hw=new isNumber();
		 boolean val=isNumber("-.");
	        System.out.println(val);
	}

}
