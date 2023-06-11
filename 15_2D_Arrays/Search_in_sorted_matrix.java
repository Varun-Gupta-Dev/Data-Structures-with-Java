import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Search_in_sorted_matrix {

    // 1st Method-->Linear Search T.C= O(n^2)
    public static boolean linearSearch(int matrix[][], int key){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                    System.out.println("Key found at index "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    // 2nd method --> Binary Search -->T.C=O(nlogn)
    public static boolean binarySearch(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            int end = matrix[0].length-1;
            int start = 0;
            int mid;
            while(start<=end){
                mid = (start+end)/2;
                if(matrix[i][mid]==key){
                    System.out.println("key found at index: "+"("+i+","+mid+")");
                    return true;
                }
                else if(matrix[i][mid]>key){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
           
        }
        System.out.println("Key not found.");
        return false;
    }

    // 3rd Method --> Staircase Search--> T.C=O(m+n)
    public static boolean stairSearch(int matrix[][], int key){
        int row = matrix.length-1, col=0;
        while(row>=0 && col<matrix[0].length){
            if(key==matrix[row][col]){
                System.out.println("Key found at index: "+"("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        
        // linearSearch(matrix,100);
        //binarySearch(matrix,50);
        stairSearch(matrix,100);
    }
}
