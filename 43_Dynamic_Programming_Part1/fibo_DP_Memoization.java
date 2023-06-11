package Dynamic_Programming_Part1;

public class fibo_DP_Memoization {
    public static int fibo(int n,int dp[]){ // TC = O(n)
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] !=0 ){
            return dp[n];
        }
         dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
         return dp[n];
    }
    public static void main(String args[]){
        int n = 6;
        int dp[] = new int[n+1];
        System.out.println(fibo(n,dp));
    }
}
