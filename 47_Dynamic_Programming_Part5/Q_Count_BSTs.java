
public class Q_Count_BSTs {
    // TC = O(n*n)
    public static int countBSTs(int n){
        if(n==0 || n==1){
            return 1;
        }
        int dp[] = new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2; i<dp.length; i++){
            for(int j=0; j<=i-1; j++){
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left*right;
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(countBSTs(n));
    }
}
