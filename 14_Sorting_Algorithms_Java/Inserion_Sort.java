public class Inserion_Sort {
    public static void InsertionSortAsc(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while( prev >=0 && arr[prev] > curr ){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev+1] = curr;
        }
    }
    public static void InsertionSortDesc(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            //Insertion
            arr[prev+1] = curr;

        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        InsertionSortDesc(arr);
        printarr(arr);

    }    
}
