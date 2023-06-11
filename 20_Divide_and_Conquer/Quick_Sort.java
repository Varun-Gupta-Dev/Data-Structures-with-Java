public class Quick_Sort {
    public static void quickSort(int arr[], int si, int ei){

        if(si >= ei){ // Base Case
            return;
        }
        int pindx = partition(arr,si,ei);

        quickSort(arr,si,pindx-1); // Left
        quickSort(arr,pindx+1,ei); // Right

    }

    public static int partition(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si-1; // i pivot se chote elements ke liye jagah banayega

        for(int j=si; j<ei; j++){
            if(arr[j] < pivot){
                // to jagah banao
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Shifting pivot element to its right position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
