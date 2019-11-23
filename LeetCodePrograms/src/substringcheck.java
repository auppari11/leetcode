
public class substringcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] src= {"minecraftgame", "intelligent", "innercrafttalent", "knife", "scissor", "stonecrafter"};
		String key="craft";
		for(int i=0;i<=src.length-1;i++)
		{
			if(src[i].contains(key))
				System.out.println(src[i]);
		}
		
	}

}
