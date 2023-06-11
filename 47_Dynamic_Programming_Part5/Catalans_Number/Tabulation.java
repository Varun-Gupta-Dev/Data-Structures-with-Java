package Catalans_Number;

public class Tabulation {
    // TC = O(n*n)
    public static int catalanTabu(int n){
        int dp[] = new int[n+1];
        // Initialize
        dp[0]=dp[1]=1;
        for(int i=2; i<dp.length; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j]*dp[i-j-1]; // dp[i] means catalan(i)
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(catalanTabu(n));
    }
}
