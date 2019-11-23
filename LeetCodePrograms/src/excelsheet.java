
public class excelsheet {
	 public String convertToTitle(int n) {
		StringBuilder sb=new StringBuilder();
		while(n>0)
		{
			n--;
			System.out.println(n%26);
			System.out.println(('A'+n%26));
			sb.insert(0, (char)('A'+n%26));
			System.out.println(sb);
			n/=26;
		}
		
	        return sb.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excelsheet es=new excelsheet();
		System.out.println(es.convertToTitle(52));
	}

}
