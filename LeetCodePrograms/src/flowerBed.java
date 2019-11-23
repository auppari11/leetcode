
public class flowerBed {
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
		 int i=0;
		 while(i<=flowerbed.length-1 && n>0)
		 {
			 if(flowerbed[i]==1)
			 {
				i=i+2;
				continue;
			 }
			 if(flowerbed[i]==0 && 
					 ((i==0 && i+1<=flowerbed.length-1 &&flowerbed[i+1]==0)
					  || (i==flowerbed.length-1 && i-1>=0 && flowerbed[i-1]==0)
					  || (i+1<=flowerbed.length-1 && i-1>=0 && flowerbed[i+1]==0 && flowerbed[i-1]==0)
					  || (i==0 && i==flowerbed.length-1)
					 ))
			 {
				 n=n-1;
				 i=i+2;
			 }
//			 else if(flowerbed[i]==0 && i==flowerbed.length-1 && flowerbed[i-1]==0)
//			 {
//				 n=n-1;
//				 i=i+2;
//			 }
//			 else if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0)
//			 {
//				 n=n-1;
//				 i=i+2;
//			 }
			 else i++;
		 }
	      return n==0;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flowerBed fb=new flowerBed();
		int[] flowerbed= {0};
		System.out.println(fb.canPlaceFlowers(flowerbed, 1));
	}

}
