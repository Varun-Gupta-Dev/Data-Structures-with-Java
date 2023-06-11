public class Selection_sort {
    public static void Selection_Sort_Asc(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minpos = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minpos]){
                    minpos = j;
                }
            }
            // Swapping
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Selection_Sort_Desc(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int maxpos = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[maxpos]){
                    maxpos=j;
                }
            }
            // Swapping
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[] ){
        int arr[] = {5,4,1,3,2};
        // Selection_Sort_Asc(arr);
        Selection_Sort_Desc(arr);
        printarr(arr);
        
    }    
}
