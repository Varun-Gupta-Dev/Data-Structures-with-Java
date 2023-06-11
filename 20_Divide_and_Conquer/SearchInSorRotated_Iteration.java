public class SearchInSorRotated_Iteration {
    public static int search(int arr[], int si, int ei, int target){
        while(si <= ei){
            int mid = si + (ei-si)/2;

            // target found
            if(arr[mid] == target){
                return mid;
            }
            // mid on L1
            if(arr[si] <= arr[mid]){
                // Case a: target at left of mid
                if(arr[si] <= target && target <= arr[mid]){
                    ei = mid -1;
                }
                // Case b: target towards right of mid
                else{
                    si = mid+1;
                }
            }

            // mid on L2
            else{
                // Case c: target towards right of mid
                if(arr[mid] <= target && target <= arr[ei]){
                    si = mid+1;
                }
                // Case d: target towards left of mid
                else{
                    ei = mid-1;
                }
            }
        }
        // target not found
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 10;
        System.out.print(search(arr,0,arr.length-1,target));
    }
    
}
