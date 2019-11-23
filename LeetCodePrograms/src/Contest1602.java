import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contest1602 {
	public int maxLength(List<String> arr) {
		if(arr.size()==1) return arr.get(0).length();
		HashMap<Character, Integer> mp=new HashMap<>();
		int maxval=0;
		String temp="",val=""	;
		for(int i=0;i<=arr.size()-1;i++)
		{
			val=val+arr.get(i);
			for(char c:arr.get(i).toCharArray())
			{
			mp.put(c,mp.getOrDefault(c, 1)+1);
			}
		}
		for(int i=0;i<=arr.size()-1;i++)
		{
			
		}
		{
			
		}
//		for(int i=0;i<=arr.size()-1;i++)
//		{
//			temp=val;
//			if(i+1<=arr.size()-1)
//			{
//				 val=arr.get(i)+arr.get(i+1);
//				for(char v:val.toCharArray())
//				{
//					if(!mp.containsKey(v)) mp.put(v, 1);
//					else 
//						{
//						 val=temp;
//						break;
//						}
//					
//				}
//			}
//		}
		return val.length();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contest1602 cs=new Contest1602();
		List<String> arr=new  ArrayList<>();
//		arr.add("un");
//		arr.add("iq");
//		arr.add("ue");
		arr.add("cha");
		arr.add("r");
		arr.add("act");
		arr.add("ers");
		System.out.println(cs.maxLength(arr));
	}

}
