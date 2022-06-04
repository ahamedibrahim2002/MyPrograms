/*
Note:
    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.
*/

public class SearchInMatrix{
   public static void main(String[] args) {
    
       int[][] nums={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target=3;
       System.out.println(searchMatrix(nums,target));
   }
   private static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[row].length-1;

        while(row<matrix.length && row>-1 && col<matrix[row].length && col>-1){
            
            if(matrix[row][col]<target)
                row++;
            else if(matrix[row][col]>target)
                col--;
            else
                return true;
        }
        return false;
    }

}