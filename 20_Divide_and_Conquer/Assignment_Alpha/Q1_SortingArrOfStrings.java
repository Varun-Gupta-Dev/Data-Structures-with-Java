

public class Q1_SortingArrOfStrings {
    public static void mergeSort(String arr[], int si, int ei){
        if(si >= ei){ // Base case
            return;
        }

        int mid = si +(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);


    }

    public static void merge(String  arr[], int si, int ei, int mid){
        String temp[] = new String[ei-si+1];
        int i = si; // starting indx of left sorted array
        int j = mid+1; // Starting indx of right sorted array
        int k=0;
        while(i<=mid && j<=ei){
            // left Sorted
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }
            // Right sorted
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // For leftover elements
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        // Copying temp to original array
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        String arr[] = {"sun","earth","mars","mercury"};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
    
}
