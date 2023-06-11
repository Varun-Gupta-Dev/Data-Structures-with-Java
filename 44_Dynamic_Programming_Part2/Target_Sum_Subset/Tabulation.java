public class Tabulation {
    public static boolean targetSum(int num[], int target){
        int n = num.length;
        boolean dp[][] = new boolean[n+1][target+1];
        for(int i=0; i<n+1; i++){
            dp[i][0] = true;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<target+1; j++){
                int v = num[i-1];
                //include
                if(num[i-1] <= j && dp[i-1][j-v]){
                    dp[i][j] = true;
                }
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String args[]){
        int num[] = {4,2,7,1,3};
        int target = 10;
        System.out.println(targetSum(num, target));
    }
}
