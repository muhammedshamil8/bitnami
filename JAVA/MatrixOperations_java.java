import java.util.Scanner;
class MatrixOperations{
        public static void main(String args[]){
            Scanner sr=new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int rows=sr.nextInt();
            System.out.println("Enter the number of columns:");
            int cols=sr.nextInt();
            int[][] matrix=new int[rows][cols];
            System.out.println("Enter the elements of the matrix:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    matrix[i][j]=sr.nextInt();
                    
                }
            }
            int trace=0;
            if( rows==cols){
            for(int i=0;i<rows;i++){
                trace+=matrix[i][i];
		}
		System.out.println("Trace of the matrix:" +trace);
	    }
	    else{
		System.out.println("The matrix is not square, so trace cannot be calculated");
	    }

            // Create the transpose matrix
            int[][] transpose=new int[cols][rows];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    transpose[j][i]=matrix[i][j];
                }
            }
          
            // Display the transpose matrix
            System.out.println("Transpose of the matrix:");
            for(int i=0;i<cols;i++){
                for(int j=0;j<rows;j++){
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();             }
        }
}