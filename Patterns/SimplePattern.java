public class SimplePattern{
	public static void main(String[] args) {
		pattern12(5);
	}
     
    static void pattern5(int n){
       
        for(int row=1;row<=2*n-1;row++){
        	int colToPrint=row>n ? 2*n-row : row;
        	
        	for(int col=1;col<=colToPrint;col++)
                 System.out.print("*");
        	
        	System.out.println();
        }

    }
    static void pattern8(int n){
       
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++)
                 System.out.print(" ");
        	
        	for(int col=1;col<=2*row-1;col++)
                 System.out.print("*");
        	
        	System.out.println();
        }

    }
    static void pattern9(int n){
       
        for(int row=n;row>=1;row--){
            for(int space=1;space<=n-row;space++)
                 System.out.print(" ");
        	
        	for(int col=1;col<=2*row-1;col++)
                 System.out.print("*");
        	
        	System.out.println();
        }

    }
    static void pattern10(int n){
       
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++)
                 System.out.print(" ");

        	for(int col=1;col<=row;col++)
                 System.out.print("* ");
        	
        	System.out.println();
        }

    }
    static void pattern12(int n){
       
        for(int row=1;row<=2*n;row++){
            int noOfSpace=row<=n ? row-1 : 2*n-row;
            //Note : int colToPrint=row<=n ? n-row+1 : row-n;
            int colToPrint=n-noOfSpace;
            
            for(int space=1;space<=noOfSpace;space++)
                 System.out.print(" ");

        	for(int col=1;col<=colToPrint;col++)
                 System.out.print("* ");
        	
        	System.out.println();
        }
    }

}
// for(int row=1;row<;row++){
//         	for(int col=1;col<;col++){}
//         }