public class Q1_BalancedSubstrings {
    public static int balancedPartitions(String str){
        int n=str.length();
        int R=0,L=0,ans=0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='R'){
                R++;
            }
            else if(str.charAt(i)=='L'){
                L++;
            }
            if(R==L){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String str = "LRRRRLLRLLRL";
        System.out.println(balancedPartitions(str));
    }
}
