public class HeapSort {
    public static void heapSort(int arr[]){ // T.C=O(nlogn)
        // Step 1: build maxheap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);//-->O(logn)-->called n/2 times-->O((n/2)*log)-->O(nlogn)
        }
        // Step 2: 
         // a) Swap the first(largest) element with the last element
         for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // b) heapify
            heapify(arr,0,i);// called n times --> O(nlogn)
         }
    }
    public static void heapify(int arr[], int i, int size){
        int maxIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < size && arr[left]>arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i){
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr,maxIdx,size);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,1,3,2,4};
        heapSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
