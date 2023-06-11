import java.util.*;
public class SpiarlMatrix {
    public static void printSpiral(int matrix[][]){
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        // i--> for rows
        // j--> for columns

        while(startrow<=endrow && startcol<=endcol){
        // printing top
        for(int j=startcol; j<=endcol; j++){
            // if(startcol==endcol){
            //     break;
            // }
            System.out.print(matrix[startrow][j]+" ");
        }

        // printing right
        for(int i=startrow+1; i<=endrow; i++){
            if(startrow==endrow){
                break;
            }
            System.out.print(matrix[i][endcol]+" ");
        }

        // printing bottom
        for(int j=endcol-1; j>=startcol; j-- ){
            System.out.print(matrix[endrow][j]+" ");
        }

        //printing left
        for(int i=endrow-1; i>=startrow+1; i-- ){
            System.out.print(matrix[i][startcol]+" ");
        }
        startrow++;
        endrow--;
        startcol++;
        endcol--;
    }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          };
        printSpiral(matrix);
    }
    
}
