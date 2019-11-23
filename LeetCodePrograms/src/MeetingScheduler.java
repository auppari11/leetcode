import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingScheduler {
	 public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
		 List<Integer> ls=new ArrayList<Integer>();
		 Arrays.sort(slots1,(a,b)->a[0]-b[0]);
		 Arrays.sort(slots2,(a,b)->a[0]-b[0]);
		 int i=0,j=0;
		 int n1=slots1.length,n2=slots2.length;
		 while(i<n1 && j<n2)
		 {
			 int start=Math.max(slots1[i][0], slots2[j][0]);
			 int end=Math.min(slots1[i][1], slots2[j][1]);
			 if(start+duration<=end)
			 {
				  ls.add(start);
				  ls.add(start+duration);
				  return ls;
			 }
			 else if(slots1[i][1]<slots2[j][1])
				 i++;
			 else j++;
		 }
		 return ls;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingScheduler ms=new MeetingScheduler();
//		int[][] slots1= {{10,50},{60,120},{140,210}};
//		int[][] slots2= {{0,15},{60,70}};
//				456085
//
//		int[][] slots1= {{216397070,363167701},{98730764,158208909},{441003187,466254040},{558239978,678368334},{683942980,717766451}};
//		int[][] slots2= {{50490609,222653186},{512711631,670791418},{730229023,802410205},{812553104,891266775},{230032010,399152578}};
				
		int[][] slots1= {{0,1},{100,1000100}};
		int[][] slots2= {{90,1000100},{0,2}};
		List<Integer> ls=ms.minAvailableDuration(slots1, slots2, 1000000);
		System.out.println(ls);
	}

}
