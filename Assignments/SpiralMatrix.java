public class SpiralMatrix{
    public static void main(String[] args) {
        int[][] arr={
                      {1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12}
                    };
                    spiral(arr);
    }
    static void spiral(int[][] arr){
        int rowStart=0,rowEnd=arr.length-1;
        int colStart=0,colEnd=arr[rowEnd].length-1;
         
       while(rowStart <= rowEnd && colStart<=colEnd){
         
         for (int i =colStart ;i <=colEnd; i++) {
                System.out.print(arr[rowStart][i]+" ");
         }
         rowStart++;
         
         
         for (int i = rowStart; i <=rowEnd; i++) {
                System.out.print(arr[i][colEnd]+" ");   
         }
         colEnd--;
        
         if(rowStart <= rowEnd){
            for (int i = colEnd; i >= colStart; --i) {
                System.out.print(arr[rowEnd][i]+" ");
            }
            rowEnd--;
         }

         if(colStart <= colEnd){
            for (int i = rowEnd; i >=rowStart; --i) {
                System.out.print(arr[i][colStart]+" ");
            }
            colStart++;
        }
       }
    }
}