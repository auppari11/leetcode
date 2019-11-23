import java.util.Arrays;

public class RevealCards {

	 public int[] deckRevealedIncreasing(int[] deck) {
		 Arrays.sort(deck);
		 int[] val=new int[deck.length];
		 int low=0,high=deck.length-1,i=0,j=deck.length-1;
		 char setinO='Y',flip='N';
		while(low<=high && i<j)
		{
			if(setinO=='Y')
			{
				val[low]=deck[i];
				if(low+2<=high) 
					{
					low=low+2;
					i++;
					}
				else if(low+2>high)
				{
					setinO='N';
					flip='Y';
				}
			}
			else if(setinO=='N')
			{
				if(low==high) low=1;
				else if (low+1==high) low=low+1;
				
				if(flip=='Y')
				{
					val[low]=deck[j];
					j--;
					if(low+2>high) low=1;
					else low=low+2;
					flip='N';
				}
				else
				{
					val[low]=deck[i];
					i++;
					if(low+2>high) break;
					flip='Y';
				}
			}
		}
	        return val;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevealCards rc=new RevealCards();
		int[] deck= {17,13,11,2,3,5,7};
		int[] val=rc.deckRevealedIncreasing(deck);
		for(int i=0;i<=val.length-1;i++)
		{
			System.out.println(val[i]);
		}
	}

}
