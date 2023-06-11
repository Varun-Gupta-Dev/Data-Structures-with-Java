import java.util.*;

public class largest_smallest {
    public static int largest(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                max = Math.max(arr[i][j], max);
            }
        }
        return max;
    }
    public static int smallest(int arr[][]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                min = Math.min(arr[i][j],min);
            }
        }
        return min;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Largest = "+largest(matrix));
        System.out.println("Smallest = "+smallest(matrix));
    }
    
}
