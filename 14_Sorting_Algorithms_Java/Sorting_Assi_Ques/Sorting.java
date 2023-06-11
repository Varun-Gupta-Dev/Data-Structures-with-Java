import java.util.*;
public class Sorting {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int maxpos = i;
            for(int j=i+1; j<n; j++){
                if(arr[maxpos] < arr[j]){
                    maxpos = j;
                }
            }
            // swapping
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // inserting element
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        // Creating counting array
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // Sorting algorithm
        int j=arr.length-1;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j--;
                count[i]--;
            }
        }


    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        printarr(arr);
    }
}
