package Dynamic_Programming_Part3.LongestCommonSubsequence;

public class Tabulation {
    public static int lcsTabu(String str1, String str2,int n, int m){ // TC = O(n*m)
        // dp[i][j]--> i->length of str1,j->length of str2,dp[i][j] will store length of lcs at that condition
        int dp[][] = new int[n+1][m+1];
        // Initialization
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = 0;
        }
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(lcsTabu(str1, str2, str1.length(), str2.length()));
    }
}
