package Recursion;

public class CheckForSortedArray {
    public static boolean isSorted(int arr[], int i){ // T.C = O(n)
        if(i==arr.length-1){                          // because whole array is being traversed
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
    
}
