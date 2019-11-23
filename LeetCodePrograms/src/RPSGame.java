
public class RPSGame {
public int solution(String arr)
{
	int point=0;
	Character finput = null;
	int rockCnt=0,scissrCnt=0,paperCnt=0;
	for(int i=0;i<=arr.length()-1;i++)
	{
		if(arr.charAt(i)=='R') rockCnt+=1;
		else if(arr.charAt(i)=='S') scissrCnt+=1;
		else if (arr.charAt(i)=='P') paperCnt+=1;
		else return 0;
	}
    if((rockCnt>scissrCnt && rockCnt>paperCnt)|| rockCnt==scissrCnt)
    {
    	finput='R';
    }
    else if((scissrCnt>rockCnt && scissrCnt>paperCnt) || scissrCnt==paperCnt)
    {
    	finput='S';
    }
    else if((paperCnt>rockCnt && paperCnt>scissrCnt) || rockCnt==paperCnt)
    {
    	finput='P';
    }
            
    for(int j=0;j<=arr.length()-1;j++)
    {
    	if(arr.charAt(j)==finput)
    	{
    		point+=1;
    	}
    	else if((finput== 'R' && arr.charAt(j)=='P') || 
    			(finput== 'S' && arr.charAt(j)=='R') || 
    			(finput== 'P' && arr.charAt(j)=='S'))
    	{
    		point+=0;
    	}
    	else
    	{
    		point+=2;
    	}
    }
	
	return point;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RPSGame rps=new  RPSGame();
		int val=rps.solution("PPPPRRSSSSS");
		System.out.println(val);

	}

}
