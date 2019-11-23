import java.lang.Character.Subset;

import javax.naming.StringRefAddr;

public class RomanNumbers {
public int romanToInt(String s) {
     int len=s.length(),i=0,val=0,c=0;
     char x;
     while(i<=len-1)
     {
//    	 System.out.println(i);
    	 x=s.charAt(i);
  
    	 if (x=='I')  {
    		 if(i+1<=len-1)
    		 {
    		 if(s.charAt(i+1)=='V')
    		 {
    		 c=4;

    		 i++;
    		 }
    		 else if(s.charAt(i+1)=='X')
    		 {
    		 c=9; 	 

    		 i++;
    		 }
    		 else
    			 c=1;
    		 }
    		 else
    			 c=1;
    		 
    		 
    		 }
    	 else if  (x=='V') c=5;
         else if   (x=='X') {
        	 if(i+1<=len-1)
    		 {
    		 if(s.charAt(i+1)=='L')
    		 {
    		 c=40;
    		 i++;
    		 }
    		 else if(s.charAt(i+1)=='C')
    		 {
    		 c=90; 
    		 i++;
    		 }
    		 else
    			 c=10;
    		 
    		 
    		 }
        	 else
    			 c=10;
    		 
    		 }
         else if   (x=='L') c=50;
         else if   (x=='C') 
         {
        	 if(i+1<=len-1)
    		 {
    		 if(s.charAt(i+1)=='D')
    		 {
    		 c=400;
    		 i++;
    		 }
    		 else if(s.charAt(i+1)=='M')
    		 {
    		 c=900; 
    		 i++;
    		 }
    		 else
    			 c=100;
    		 
    		 }
        	 else
    			 c=100;
    		 
    		 }
         else if   (x=='D') c=500;
         else if   (x=='M') c=1000;
         else c=0;
    	     
    	val=val+c; 
    	 i++;
    	 }
    	 
     return val;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanNumbers rn=new RomanNumbers();
		int t=rn.romanToInt("MCMXCIV");
		System.out.println(t);
	}

}
