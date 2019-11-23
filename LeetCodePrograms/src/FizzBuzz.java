import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
public List<String> fizzBuzz(int n) {
        List<String> ls=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
        	if(i%3==0 && i%5==0)
        	{
        		ls.add("FizzBuzz");
        	}
        	else if(i%5==0)
        	{
        		ls.add("Buzz");
        	}
        	else if(i%3==0)
        	{
        		ls.add("Fizz");
        	}
        	else
        	{
        		ls.add(Integer.toString(i));
        	}
        }
        return ls;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb=new FizzBuzz();
		List<String> ls1=new ArrayList<>();
		ls1=fb.fizzBuzz(15);
		System.out.println(ls1);
	}

}
