import java.util.ArrayList;
import java.util.HashMap;

public class PlusOne {
	  public int[] plusOne(int[] digits) {
//		  int temp=0,carry=1;
//		  HashMap<Integer, Integer> mp=new HashMap<Integer,Integer>();
//		  int j=0,i=0;
//		  for ( j=digits.length-1;j>=0;j--)
//		  { 
//			  System.out.println("j value "+j);
//				  System.out.println("digits value "+digits[j]);
//			   
//			      
//			    	  temp=((digits[j])+carry)%10;
//			    	  System.out.println(temp);
//			    	  if((digits[j])+carry==10)
//			    	  carry=1;
//			    	  else carry=0;
//			      
//			    	  mp.put(i,temp);
//			    	  i++;
//			    	  
//			  
//		  }
//		  System.out.println("carry value"+carry);
//		  System.out.println(i);
//		  if (carry==1)
//			  mp.put(i,carry);
//		  int[] newarr=new int[mp.size()];
//		  System.out.println(mp.size());
//		  System.out.println(mp.get(0));
//		  i=0;
//		  for (int p=mp.size()-1;p>=0;p--)
//		  {
//			  newarr[i]=mp.get(p);
//			  i++;	
//		  }  
//		  
//		  return newarr;
		  int n = digits.length;
		    for(int i=n-1; i>=0; i--) {
		        if(digits[i] < 9) {
		            digits[i]++;
		            return digits;
		        }
		        
		        digits[i] = 0;
		    }
		    
		    int[] newNumber = new int [n+1];
		    newNumber[0] = 1;
		    
		    return newNumber;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne ps =new PlusOne();
		int[] arr= {9,9,9};
		int[] arr2=new int[arr.length+1];
		arr2=ps.plusOne(arr);
		for (int j=0;j<=arr2.length-1;j++)
		{
			System.out.println(arr2[j]);
		}
	}

}
