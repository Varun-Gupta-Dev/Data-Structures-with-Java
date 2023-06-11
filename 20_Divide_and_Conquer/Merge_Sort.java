public class Merge_Sort{

    public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i = si; // Starting index for left sorted array.
        int j = mid+1; // Starting index for right sorted array.
        int k=0;
        while(i<=mid && j<=ei ){

            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // For leftover elements of left sorted array.
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // For leftover elements of right sorted array.
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // Copying temp to original array.
        for( k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];

        }
    }

    // Function to print an array-
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){ // T.C=O(nlogn)
                                                             // S.C=O(n)    
        if(si >= ei){ // Base case
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);

    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }

}