public class Q_Minimum_Partitioning {
    // TC = O(n*m)
    public static int minPart(int arr[]){
        int n = arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int W = sum/2;
        int dp[][] = new int[n+1][W+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                if(arr[i-1] <= j){
                    //include
                    int ans1 = arr[i-1] + dp[i-1][j-arr[i-1]];
                    //exclude
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1,ans2);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String args[]){
        int arr[] = {1,6,5,11};
        System.out.println(minPart(arr));
    }
}
