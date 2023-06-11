public class Q_Mountain_Ranges {
    public static int mountainRanges(int n){
        if(n==0 || n==1){
            return 1;
        }
        int dp[] = new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2; i<dp.length; i++){
            for(int j=0; j<i; j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside*outside;
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(mountainRanges(n));
    }
}
