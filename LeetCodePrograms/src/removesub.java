import java.util.ArrayList;
import java.util.List;

public class removesub {
	 public List<String> removeSubfolders(String[] folder) {
		 List<String> ls=new ArrayList<>();
		 for(int i=0;i<=folder.length-1;i++) ls.add(folder[i]);
		 int j=0;
		while(j<=ls.size()-1)
		{
	        int p=j;
	        while(p+1<=ls.size()-1)
	        {
	        	if(ls.get(p+1).contains(ls.get(j)))
	        	{
	        		ls.remove(p+1);
	        	}
	        	else p++;
	        }
	        j++;
	        
	    }
		return ls;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removesub rm=new removesub();
		String[] folder= {"/a/b/c","/a/b/ca","/a/b/d"};
		List<String> ls=rm.removeSubfolders(folder);
		System.out.println(ls);
	}

}
