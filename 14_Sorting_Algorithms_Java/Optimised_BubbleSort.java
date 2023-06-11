import java.util.*;
public class Optimised_BubbleSort {
    public static void BubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int swaps =0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                System.out.println("The array is already sorted.");
                break;
            }
        }

    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5}; /*  Already sorted array
                                 Our aim is to make T.C=O(n) in case of sorted array*/
    
        BubbleSort(arr);
        printarr(arr); 
    }
}
// Time complexity of this program = O(n)