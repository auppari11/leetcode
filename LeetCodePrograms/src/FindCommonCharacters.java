import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacters {
public List<String> commonChars(String[] A) {
        List<String> s=new ArrayList<String>();
        HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
        if(A.length==0) return s;
        int k=0;
        System.out.println(A.length);
        for(int p=0;p<=A[0].length()-1;p++)
        {
        	if(hs.isEmpty() || !(hs.containsKey(A[0].charAt(p))))
			   {
		         int cnt=getcnt(A[0],A[0].charAt(p));
			   }
        }
    
        for(int j=0;j<=hs.size()-1;j++) {	
        	char fnd='N';
        
        for(int i=1;i<=A.length-1;i++)
        {
        	k++;
        	
            
        	if(hs.containsKey(A[i].charAt(j)) && i==k-1 && i>1)
        	{
        		fnd='Y';
        	}
        	
            }
        if(fnd=='Y')
            
        	
//           for(int j=0;j<=A[i].length()-1;j++)
//           {
//        	   System.out.println(A.length);
//        	     if(hs.containsKey(A[i].charAt(j)) && i==k-1 && i>1)
//        			   {
//        		         if(hs.get(A[i].charAt(j))>getcnt(A[i],A[i].charAt(j)))
//        		         {
//        		        	 s.
//        		         }
//        			   }
//           }
        }
        }
        return s;
    }
public int getcnt(String s1,char c)
{
	int charcnt=0;
	for(char ch:s1.toCharArray())
	{
		if(ch==c) charcnt++;
	}
	return charcnt;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindCommonCharacters fc=new FindCommonCharacters();
		List<String> s=new ArrayList<String>();
		String[] A= {"bella","label","roller"};
		s=fc.commonChars(A);
		for(int i=0;i<=s.size()-1;i++) {
			System.out.println("val "+s.get(i));
		}

	}

}
