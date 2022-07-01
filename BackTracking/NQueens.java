import java.util.*;

/*
output:
[0, 1, 0, 0]
[0, 0, 0, 1]
[1, 0, 0, 0]
[0, 0, 1, 0]

[0, 0, 1, 0]
[1, 0, 0, 0]
[0, 0, 0, 1]
[0, 1, 0, 0]


*/
public class NQueens{
    
	public static void main(String[] args) {
       int n=4;
       int[][] arr=new int[n][n];

       solve(arr,0,0,n);
       
	}

	static void solve(int[][] board,int row,int col,int n){
        
        if(row >=board.length || col>=board.length || n <=0){
           display(board);
           return;	
        } 

        for (int i=0;i<board.length;++i) {
        	board[row][i]=1;
        	if(isSafe(board,row,i))
        		solve(board,row+1,0,n-1);
        	board[row][i]=0;
        }
	}

	static void display(int[][] arr){
		for (int[] i: arr) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}
     static boolean isSafe(int[][] board,int row,int col){
          
          //diagonal left
     	  int i=row-1;
     	  int j=col-1;
     	  while(i>=0 && j>=0){
             if(board[i--][j--]==1) return false;
     	  }
          
          //diagonal right
     	  i=row-1;
     	  j=col+1;
     	  while(i>=0 && j<board.length){
             if(board[i--][j++]==1) return false;
     	  }
          
          //diagonal leftdown
          i=row+1;
     	  j=col-1;
     	  while(j>=0 && i<board.length){
             if(board[i++][j--]==1) return false;
     	  }
          
          //diagonal Rightdown
          i=row+1;
     	  j=col+1;
     	  while(i<board.length && j<board.length){
             if(board[i++][j++]==1) return false;
     	  }
          
          //column check up to down
     	  i=0;
     	  j=col;
     	  while(i<board.length){
             if(i==row) i++;
             else if(board[i++][col]==1) return false;
     	  }

     	  //row check left to right
     	  i=row;
     	  j=0;
     	  while(j<board.length){
     	  	 if(j==col) j++;
             else if(board[row][j++]==1) return false;
     	  }

     	  return true;
     }
}