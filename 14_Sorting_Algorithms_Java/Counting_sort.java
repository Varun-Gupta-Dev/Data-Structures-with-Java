import java.util.*;
public class Counting_sort {
    public static void countingSort(int arr[]){/*T.C=O(n+k),n=No.of elements
                                                         k=Range of elements in array.*/
                                                         //S.C=O(k)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        int count[] = new int[max+1];
        // Creating counting array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // Algorithm to sort array
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] >0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {2,2,1,4,3,3,5,4,7,7};
        countingSort(arr);
        printarr(arr);
    }
}
