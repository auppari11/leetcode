import java.util.ArrayList;

public class KeyBoardRow {
	  public String[] findWords(String[] words) {
	      int[] arr= {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
	      ArrayList<String> newarr = new ArrayList<String>();
	      int temp=0,j=0;
	      for(int i=0;i<=words.length-1;i++)
	      {
	    	  String val=words[i].toLowerCase();
	    	  temp=0;
	    	  for(j=0;j<=val.length()-1;j++)
	    	  {
	    		  if(j==0)
	    		  {
	    			  temp=arr[val.charAt(j)-'a'];
	    		  }
	    		  else
	    		  {
	    			  if(arr[val.charAt(j)-'a']!=temp)
	    				  break;
	    		  }
	    	  }
	    	  if(j==words[i].length())
	    	  {
	    		 newarr.add(words[i]); 
	    	  }
	      }
	      String[] newcoll=new String[newarr.size()];
	      for(int i=0;i<=newarr.size()-1;i++)
	      {
	    	  newcoll[i]=newarr.get(i);
	      }
	      return  newcoll;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyBoardRow kr=new KeyBoardRow();
		String[] words= {"Hello", "Alaska", "Dad", "Peace","Qwer","zxcv"};
		String[] val=kr.findWords(words);
		for(int i=0;i<=val.length-1;i++)
		{
			System.out.println(val[i]);
		}
		}
	

}
