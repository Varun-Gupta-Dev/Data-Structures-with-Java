package Practice;

public class _5plaicingZeroesAtEnd {
    public static void placeZero(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                int curr = i;
                int next = i+1;

                while(next<=n-1){
                    int temp = arr[curr];
                    arr[curr]=arr[next];
                    arr[next]=temp;
                    curr = next;
                    next+=1;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,0,3,0,4,0,5,0};
        placeZero(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
