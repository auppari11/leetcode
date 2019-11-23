import java.util.HashMap;

public class JavaExcel {
public int titleToNumber(String s) {
	int val=0;
        HashMap<Character, Integer> mp=new HashMap<>();
        mp.put('A',1);
        mp.put('B',2);
        mp.put('C',3);
        mp.put('D',4);
        mp.put('E',5);
        mp.put('F',6);
        mp.put('G',7);
        mp.put('H',8);
        mp.put('I',9);
        mp.put('J',10);
        mp.put('K',11);
        mp.put('L',12);
        mp.put('M',13);
        mp.put('N',14);
        mp.put('O',15);
        mp.put('P',16);
        mp.put('Q',17);
        mp.put('R',18);
        mp.put('S',19);
        mp.put('T',20);
        mp.put('U',21);
        mp.put('V',22);
        mp.put('W',23);
        mp.put('X',24);
        mp.put('Y',25);
        mp.put('Z',26);
        if(s.length()>=2)
        {
        	int temp=s.length()-1;
        	for(int i=0;i<=s.length()-2;i++)
        	{
        		int z=26;
        		for(int j=0;j<temp-1;j++)
        		{
        			z=z*26;
        		}
        		val=val+z*mp.get(s.charAt(i));
        		temp--;
        	}
        	 return val+mp.get(s.charAt(s.length()-1));
        	
        }
        else
        {
        	return mp.get(s.charAt(0));
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExcel je=new JavaExcel();
		int val=je.titleToNumber("ZZA");
		System.out.println('Z'-'A');
	}

}
