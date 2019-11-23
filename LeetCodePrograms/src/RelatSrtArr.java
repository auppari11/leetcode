
public class RelatSrtArr {
	 public int[] relativeSortArray(int[] arr1, int[] arr2) {

		 if(arr2.length==0) return arr1;

		         int low=0,j=0,cnt=0;

		         int high=arr1.length-1;

		         for(int i=0;i<=arr2.length-1;i++){

		             System.out.println("arr2[i] "+arr2[i]);

		             while (low<=high)

		             {                                                  

		                   if(arr2[i]==arr1[low])

		                  {

		                     cnt=cnt+1;

		                   }

		                 if(arr2[i]!=arr1[low])

		                 {

		                      

		                     int temp=arr1[low];

		                     for( j=low+1;j<=arr1.length-1;j++)

		                     {

		                         if(arr2[i]==arr1[j])

		                         {

		                             System.out.println("inside 2nd if j"+j+" low "+low);

		                             arr1[low]=arr1[j];

		                             arr1[j]=temp;

		                             cnt++;

		                             break;

		                         }

		                     }

		                    

		                 }

		                 if(j==arr1.length-1 ) break;

		                

		                 low++;

		             }

		             System.out.println("cnt val "+cnt);

		             low=cnt;

		         }

		        

		         if(cnt<=arr1.length-1)

		         {
                    boolean swapped=true;
                    int p=0;
                    int tmp;
                    while (swapped) {
                        swapped = false;
                        p++;
                        for (int i = cnt; i < arr1.length-p; i++) {
                            if (arr1[i] > arr1[i + 1]) {
                                tmp = arr1[i];
                                arr1[i] = arr1[i + 1];
                                arr1[i + 1] = tmp;
                                swapped = true;
                            }
                        }
                    }
                    
		         }

		         return arr1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		RelatSrtArr   hw =new RelatSrtArr();

	     int[] arr1={26,21,11,20,50,34,1,18};

	     int[] arr2={21,11,26,20};

	     int[] A=new int[arr1.length];

	     A=hw.relativeSortArray(arr1,arr2);

	     System.out.println("printing ");

	     for(int i=0;i<=A.length-1;i++)

	     {

	       System.out.println(A[i]);

	     }

	     

	}

}
