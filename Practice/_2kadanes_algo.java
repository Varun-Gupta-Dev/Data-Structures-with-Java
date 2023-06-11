package Practice;

public class _2kadanes_algo { //O(n)
    public static int kadanes(int arr[]){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int maxSum = kadanes(arr);
        System.out.println("Max sub array sum: "+maxSum);
    }
}
