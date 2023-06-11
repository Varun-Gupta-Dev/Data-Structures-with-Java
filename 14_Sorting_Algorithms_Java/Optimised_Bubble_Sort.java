public class Optimised_Bubble_Sort {
    public static void optimised_bubbSort(int arr[]){// Worst Case T.C=O(n^2)
                                                    // Best Case T.C=O(n)
        boolean swap = false;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

            }
            if(swap == false){
                break;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {3,2,6,7,5,4};
        optimised_bubbSort(arr);
        printArr(arr);
    }
    
}
