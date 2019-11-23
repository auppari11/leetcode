import java.util.Arrays;

public class missingNumber {
public int missingNumber(int[] nums) {
	Arrays.sort(nums);
	int p=0,cnt=1;
        while(p>=0)
        {
        	for(int j=0;j<=nums.length-1;j++)
        	{
        		if(nums[j]==p)
        		{
        			cnt=1;
        			p++;
        			break;
        		}
        		else {
        			cnt=0;
        		}
        	}
        	if(cnt==0)
        	{
        		break;
        	}
        	
        }
        if(cnt==0)
        {
         return p;
        }
        else
        {
        	return 0;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		missingNumber mn=new missingNumber();
		int[] nums= {9,6,4,2,3,5,7,0,1};
		int b=mn.missingNumber(nums);
		System.out.println(b);

	}

}
