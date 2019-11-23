import java.util.HashMap;

public class InttoRoman {

public String intToRoman(int num) {
    String str="";
    int i=Integer.toString(num).length();
    
    System.out.println(i);
       while(i>0)
       {
    	   System.out.println("here");
    	   int x=(int) (num/(Math.pow(10,i-1)));
    	   System.out.println("x value "+x);
    	   num=(int) (num-(x*(Math.pow(10,i-1))));
    	   System.out.println("num value "+num);
    	   if(x>0)
    	   {
    	   if((i-1)==3)
    	   {
    		   
    			   for(int j=0;j<=x-1;j++)
    			   {
    				   str=str+'M';
    			   }
    		   }
    		else if((i-1)==2)
    		{
    			if(x<=3)
    			{
    				while(x>0)
    				{
    					str=str+'C';
    					x=x-1;
    				}
    			}
    			else if(x==4)
    			{
    				 str=str+"CD";
    			}
    			else if(x>=5 && x!=9)
    			{
    				str=str+'D';
    				x=x-5;
    				while(x>0)
    				{
    					str=str+'C';
    					x=x-1;
    				}
    			}
    			else if(x==9)
    			{
    				str=str+"CM";
    			}
    		}
    		else if((i-1)==1)
    		{
    			if(x<=3)
    			{
    				while(x>0)
    				{
    					str=str+'X';
    					x=x-1;
    				}
    			}
    			else if(x==4)
    			{
    				 str=str+"XL";
    			}
    			else if(x>=5 && x!=9)
    			{
    				str=str+'L';
    				x=x-5;
    				while(x>0)
    				{
    					str=str+'X';
    					x=x-1;
    				}
    			}
    			else if (x==9)
    			{
    				str=str+"XC";
    			}
    		}
    		else if((i-1)==0)
    		{
    			if(x<=3)
    			{
    				while(x>0)
    				{
    					str=str+'I';
    					x=x-1;
    				}
    			}
    			else if(x==4)
    			{
    				 str=str+"IV";
    			}
    			else if(x>=5 && x!=9)
    			{
    				str=str+'V';
    				x=x-5;
    				while(x>0)
    				{
    					str=str+'I';
    					x=x-1;
    				}
    			}
    			else if(x==9)
    			{
    				str=str+"IX";
    			}
    		}
    	   }
    		i--;
       }
       return str;
}	          
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InttoRoman ir=new InttoRoman();
		String val=ir.intToRoman(1994);
		System.out.println(val);
	}

}
