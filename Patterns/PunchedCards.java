/*
   https://codingcompetitions.withgoogle.com/codejam/round/0000000000876ff1/0000000000a4621b
*/
import java.io.*;
public class PunchedCards{  
    
    public static void main(String[] args) {   
    
      //take input  
      try{   
          InputStreamReader in=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(in);
    
          int n=Integer.parseInt(br.readLine());
          
          for (int i=1; i<=n; i++) {

           String[] inputs=br.readLine().split(" ");
      
           int r=Integer.parseInt(inputs[0]);
           int c=Integer.parseInt(inputs[1]);
      
           System.out.println("Case #"+i+":");
           //solve
           solve(r,c);
         }
      }catch(IOException e){
        System.out.println(e);
      }


    }
    static void solve(int R,int C){
      
      for(int row=1;row<=2*R+1;++row){
        for(int col=1;col<=2*C+1;++col){
             if(row <=2 && col<=2){
               System.out.print(".");   //special case
             }
             else if(row%2!=0){         
               if(col%2!=0)         
                System.out.print("+");
               else
                System.out.print("-");
             }else{
               if(col%2!=0)
                 System.out.print("|");
               else
                 System.out.print(".");
             }
        }
        System.out.println();
      }

    }
} 

/*
input:

3
3 4
2 2
2 3

output:

Case #1:
..+-+-+-+
..|.|.|.|
+-+-+-+-+
|.|.|.|.|
+-+-+-+-+
|.|.|.|.|
+-+-+-+-+
Case #2:
..+-+
..|.|
+-+-+
|.|.|
+-+-+
Case #3:
..+-+-+
..|.|.|
+-+-+-+
|.|.|.|
+-+-+-+
*/