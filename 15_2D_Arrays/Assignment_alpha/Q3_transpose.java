import java.util.*;
public class Q3_transpose {
    public static void printTranspose(int matrix[][]){
        int trans[][] = new int[3][2];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                trans[j][i] = matrix[i][j];
                
            }
           
        }
        System.out.println("Transpose matrix: ");
        for(int i=0; i<trans.length; i++){
            for(int j=0; j<trans[0].length; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void printmatrix(int matrix[][]){
        System.out.println("Original Matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6}};
        printmatrix(matrix);
        printTranspose(matrix);
    }
    
}
