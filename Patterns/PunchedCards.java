/*
   https://codingcompetitions.withgoogle.com/codejam/round/0000000000876ff1/0000000000a4621b
*/

import java.io.*;
public class PunchedCards{  
    static boolean dotPrint=true;

    public static void main(String[] args) {
       
      try{   
       InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
    
       int n=Integer.parseInt(br.readLine());
       for (int i=1; i<=n; i++) {

           String[] inputs=br.readLine().split(" ");
      
           int row=Integer.parseInt(inputs[0]);
           int col=Integer.parseInt(inputs[1]);
      
           System.out.println("Case #"+i+":");
      
           // initialPrinter(col);
           //prints --> ..+ at first row top left
           System.out.print(".");
           for (int j=0; j<col; j++){
             if (j!=0) {
               System.out.print("-+");
             }else{
               System.out.print(".+");
           }
           }
           System.out.println("");
           for (int j=0; j<row; j++) {
              finalPrinter(col);
           }
       }
      }catch(IOException e){
        System.out.println(e);
      }
    } 
    // static void initialPrinter(int col){
        
    // }
    static void finalPrinter(int col){
       
         
       //prints --> |.| or ..|
       for (int i=0; i<col; i++){
          if(i==0){
            if(dotPrint){
              System.out.print(".");
              dotPrint=false;
            }
            else System.out.print("|");
          }
          System.out.print(".|");
       }

       System.out.println("");
       
       //prints --> +-+
       for (int i=0; i<=col; i++){
          if(i==0) System.out.print("+");
          else System.out.print("-+");
       }
       System.out.println("");
    }
}
