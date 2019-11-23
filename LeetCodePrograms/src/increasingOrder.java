import java.util.ArrayList;
import java.util.List;

public class increasingOrder {
	public int retrows(int[] arr)
	{
		if(arr.length<=1) return 1;
		char founEle='N';
		List<ArrayList<Integer>> ls=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(ls.size()==0)
			{
				ArrayList<Integer> as=new ArrayList<>();
				as.add(arr[i]);
				ls.add(as);
			}else
			{
				for(int j=0;j<=ls.size()-1;j++)
				{
					for(int k=0;k<=ls.get(j).size()-1;k++)
					{
						if(arr[i]<ls.get(j).get(k))
						{
							ls.get(j).add(arr[i]);
							founEle='Y';
							break;
						}
					}
					if(founEle=='Y') break;
				}
				if(founEle=='N')
				{
					ArrayList<Integer> as=new ArrayList<>();
					as.add(arr[i]);
					ls.add(as);
				}
			}
			founEle='N';
		}
		return ls.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increasingOrder io=new increasingOrder();
		int[] arr= {5,4,3,7,1,6};
		System.out.println(io.retrows(arr));
	}

}
