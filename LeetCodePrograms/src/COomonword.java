import java.util.Map;
import java.util.TreeMap;

public class COomonword {
	   public String mostCommonWord(String paragraph, String[] banned) {

		   if(paragraph.length()==0) return null;
		   paragraph=paragraph.replaceAll("[!?',;.]", "*");
		   for(int j=0;j<=banned.length-1;j++)
		   {
			   paragraph=paragraph.replaceAll(banned[j], "*");  
		   }
		   String[] arr1=paragraph.split(" ");
		   TreeMap<String, Integer> tm=new TreeMap<>();
		   for(int i=0;i<=arr1.length-1;i++)
		   {
			   int val=0;
			   if(!arr1[i].equalsIgnoreCase("*") && !arr1[i].contains("*"))
			   {
//			   if(banned.length>=1)
//			   {
//			   for(int j=0;j<=banned.length-1;j++)
//			   { 
//				   
//				   if(!arr1[i].equalsIgnoreCase(banned[j]))
//				   {
					   if(tm.containsKey(arr1[i].toLowerCase()))
					   {
//						   System.out.println("tm.get(arr1[i]) "+arr1[i]+" tm.get(arr1[i]) "+tm.get(arr1[i]));
						   tm.replace(arr1[i].toLowerCase(), tm.get(arr1[i].toLowerCase())+1);
					   }
					   else tm.put(arr1[i].toLowerCase(), val);
				   }
//				   else break;
//			   }
//			   }
//			   else
//			   {
//				   if(tm.containsKey(arr1[i].toLowerCase()))
//				   {
////					   System.out.println("tm.get(arr1[i]) "+arr1[i]+" tm.get(arr1[i]) "+tm.get(arr1[i]));
//					   tm.replace(arr1[i].toLowerCase(), tm.get(arr1[i].toLowerCase())+1);
//				   }
//				   else tm.put(arr1[i].toLowerCase(), val);
//			   }
//			   }
		   }
		  
	      String retval="";
		Integer prevval=0;
	      for (Map.Entry<String, Integer> entry : tm.entrySet())
			{
				if(retval=="") 
					{
					retval=entry.getKey();
					prevval=entry.getValue();
					}
				else
				{
					if(entry.getValue()>prevval)
					{
						prevval=entry.getValue();
						retval=entry.getKey();
					}
				}
			}
	      return retval;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COomonword co=new COomonword();
		String[] banned= {"a"};
		System.out.println(co.mostCommonWord("a, a, a, a, b,b,b,c, c", banned));

	}

}
