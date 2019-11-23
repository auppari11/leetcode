import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Synonymussent {
//	 public List<String> generateSentences(List<List<String>> synonyms, String text) {
//	        
//	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synonymussent sp=new Synonymussent();
		List<ArrayList<String>> ls=new ArrayList<ArrayList<String>>();
		ls.add( Arrays.asList({"happy","joy"}));
		ls.add(Arrays.asList({"sad","sorrow"}));
		ls.add(Arrays.asList("joy","cheerful"));
		System.out.println(ls);
//		sp.generateSentences({["happy","joy"],["sad","sorrow"],["joy","cheerful"]}, text)
				
	}

}
