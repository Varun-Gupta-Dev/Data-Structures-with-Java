public class SearchInRotatedAndSortedArray {

    public static int search(int arr[], int si, int ei, int target){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == target){
            return mid;
        }

        // Case 1: mid on L1
        if(arr[si] <=  arr[mid]){
            // Case a: target at left of mid
            if(arr[si] <= target && target <= arr[mid]){

                return search(arr,si,mid-1,target);
            }
            // Case b:  target towards right of mid
            else{
                return search(arr,mid+1,ei,target);
            }
        }

        // Case 2: mid on L2
        else {
            // Case c: Target twards right of mid
            if(arr[mid] <= target && target <= arr[ei]){

                return search(arr,mid+1,ei,target);
            }
            // Case c: Target towards left of mid
            else{
                return search(arr,si,mid-1,target);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 10;
        System.out.print(search(arr,0,arr.length-1,target));
        
    }
}
