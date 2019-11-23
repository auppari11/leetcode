import java.util.HashMap;

public class MaxPints {
public int maxPoints(int[][] points) {
	if (points.length==0) return 0;
	if(points.length==1) return 1;
	int cnt=0,slp=0,cnt1=0;
	char sampt='N';
	for (int i=0;i<=points.length-1;i++)
	{
		System.out.println("i val "+i);
		
		
		for(int k=i+1;k<=points.length-1;k++)
		{
			cnt=0;
			System.out.println("k val "+k);
			if( points[k][0]==points[i][0]   )
			{
				if(points[k][1]==points[i][1])
				{
					sampt='Y';
				}
				else {
					System.out.println("second if");
					sampt='Y';
					cnt=cnt+1;
				}
				System.out.println("cnt here  if"+cnt);		
			}
			if(points[k][0]!=points[i][0])
			{
			slp=(points[k][1]-points[i][1])/(points[k][0]-points[i][0]);
			System.out.println("slp val "+slp);
		for(int j=k+1;j<=points.length-1 ;j++)
		{
			System.out.println("j val "+j);
			
			if(points[j][0]!=points[i][0] )
            {
//				System.out.println(" val "+(points[j][1]-points[i][1])/(points[j][0]-points[i][0]));
			
			if(slp==(points[j][1]-points[i][1])/(points[j][0]-points[i][0]) )
			{
				cnt++;
				System.out.println("inside ");
			}
            }
			
		}
		cnt1=Math.max(cnt,cnt1);
		if(sampt=='Y') {cnt1=cnt1+1;}
		System.out.println("cnt1 val"+cnt1);
		System.out.println("cnt val"+cnt);
		cnt=0;
		sampt='N';
		}
		
	}
	}
	System.out.println("cnt val "+cnt);
	if(sampt=='Y') cnt1=cnt1+cnt;
 return cnt1+2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr= {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
MaxPints mp=new MaxPints();
int val=mp.maxPoints(arr);
System.out.println(val);
	}

}
