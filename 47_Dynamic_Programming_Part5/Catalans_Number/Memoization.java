package Catalans_Number;
import java.util.Arrays;
public class Memoization {
    public static int catalanMemo(int n, int dp[]){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans =0;
        for(int i=0; i<=n-1; i++){
            ans += catalanMemo(i, dp)*catalanMemo(n-1-i, dp);
        }
        return dp[n] = ans;

    }
    public static void main(String args[]){
        int n=4;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalanMemo(n,dp));
    }
}
