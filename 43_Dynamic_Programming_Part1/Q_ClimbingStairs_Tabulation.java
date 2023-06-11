package Dynamic_Programming_Part1;

public class Q_ClimbingStairs_Tabulation {
    public static int countWaysTab(int n){ // TC = O(n)
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<dp.length; i++){
            if(i==1){
                dp[i] = dp[i-1] + 0;
            }
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(countWaysTab(n));
    }
}
