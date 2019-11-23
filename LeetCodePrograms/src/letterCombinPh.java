import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class letterCombinPh {
	public List<String> letterCombinations(String digits) {
		
       List<String> ls=new ArrayList<>();
       if(digits.length()<=0) return ls;
       char tempcal,tempcal1;
       List<String> ls1=new ArrayList<>();
       HashMap<Character, String> mp=new HashMap();
       mp.put('2',"abc");
       mp.put('3',"def");
       mp.put('4',"ghi");
       mp.put('5',"jkl");
       mp.put('6',"mno");
       mp.put('7',"pqrs");
       mp.put('8',"tuv");
       mp.put('9',"wxyz");
       mp.put('0'," ");
       tempcal1=digits.charAt(0);
       String s1=mp.get(tempcal1),s2="";
       System.out.println(digits.length());
       if(digits.length()==1) 
       {
    	   System.out.println("here2");
    	   for(Character c1:s1.toCharArray())
    	   {
    		   ls.add(""+c1);
    	   }
    	   return ls;
       }
       for(int i=1;i<=digits.length()-1;i++)
       {
    	   System.out.println("here1");
    	   tempcal=digits.charAt(i); 
 		  s2=mp.get(tempcal);
 		  System.out.println("i value "+i);
    	   if( i==1)
    	   {
    		  
    		  for(Character c1:s1.toCharArray())
       	   {
    			  for(Character c2:s2.toCharArray())
       		   {  
       			   //System.out.println("c1 val "+c1+" "+"c2 val "+c2);
       			  ls.add(""+c1+c2);
       		   }  
       	   }
    	   }
    	   else
    	   {
    		   System.out.println("here2");
    		   for(int j=0;j<=ls.size()-1;j++)
    		   {
    			    for(Character c2:s2.toCharArray())
    			    {  
    	       			  // System.out.println("c1 val "+ls.get(j)+" "+"c2 val "+c2);
    	       			  ls1.add(ls.get(j)+c2);
    	       		   }     			    
    		   }
    		   System.out.println("size "+ls.size());
    		   int listsize=ls.size()-1;
    		   for(int p=listsize;p>=0;p--)
    		   {
    			   //System.out.println("size here"+ls.size());
    			   System.out.println("val here "+ls.get(p));
    			   ls.remove(ls.get(p));
    		   }
    		   System.out.println("size2 "+ls.size());
    		   int listsize2=ls1.size()-1;
    		   for(int k=listsize2;k>=0;k--)
    		   {
    			   ls.add(ls1.get(k));
    			   ls1.remove(k);
    		   }
    		   
    	   }
       }
       /*
       while(digits.length()>0 && i<=digits.length()-1)
       {
    	   tempcal=digits.charAt(i);
    	   System.out.println(tempcal);
    	   String s1=mp.get(tempcal);
    	   
    	   for(Character c1:s1.toCharArray())
    	   {
    		   if(i++<digits.length()-1)
    		   {
    			   tempcal=digits.charAt(i);
    	    	   String s2=mp.get(tempcal);
    	    	   System.out.println(tempcal);
    		   for(Character c2:s2.toCharArray())
    		   {  
    			   System.out.println("c1 val "+c1+" "+"c2 val "+c2);
    			  ls.add(""+c1+c2);
    		   }
    		   }
    		   else
    		   {
    			   ls.add(""+c1);
    		   }
    	   }
    	i++;   	   
    	   
       }*/
      for(int j=0;j<=ls.size()-1;j++)
      {
    	  System.out.println("heree "+ls.get(j)+" hre");
    	  
      }
       return ls;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombinPh lc=new letterCombinPh();
		List<String> ls=new ArrayList<>();
		ls=lc.letterCombinations("");
	}

}
