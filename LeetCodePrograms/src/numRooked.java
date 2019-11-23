
public class numRooked {
	 public int numRookCaptures(char[][] board) {
		 if(board.length<=0)return 0;
		 int Rrow=0,Rcol=0,val=0;
		 for(int i=0;i<=7;i++)
		 {
			 for(int j=0;j<=7;j++)
			 {
				 if(board[i][j]=='R')
				 {
					 Rrow=i;
					 Rcol=j;
					 break;
				 }
			 }
			 if(Rrow!=0 || Rcol!=0) {
				 System.out.println("Rrow val "+Rrow+" Rcol "+Rcol);
				 break;}
			 System.out.println("i val "+i);
		 }
		 for(int k=Rcol;k>=0;k--)
		 {
			 if(board[Rrow][k]=='B')
				 break;
			 if(board[Rrow][k]=='p')
			 {
				 val++;
				 break;
			 }
		 }
		 for(int k=Rcol;k<=7;k++)
		 {
			 if(board[Rrow][k]=='B')
				 break;
			 if(board[Rrow][k]=='p')
			 {
				 val++;
				 break;
			 }
		 }
		 for(int k=Rrow;k<=7;k++)
		 {
			 if(board[k][Rcol]=='B')
				 break;
			 if(board[k][Rcol]=='p')
			 {
				 val++;
				 break;
			 }
		 }
		 for(int k=Rrow;k>=0;k--)
		 {
			 if(board[k][Rcol]=='B')
				 break;
			 if(board[k][Rcol]=='p')
			 {
				 val++;
				 break;
			 }
		 }
	        return val;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numRooked nr=new numRooked();
		char[][] board= {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
		int val=nr.numRookCaptures(board);
		System.out.println(val);
	}

}
