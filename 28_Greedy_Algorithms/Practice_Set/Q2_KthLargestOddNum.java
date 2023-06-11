package Greedy_Algorithms.Practice_Set;

public class Q2_KthLargestOddNum {
    public static int KthLargestOdd(int L, int R, int K){//T.C=O(n),S.C=O(1)
        int count=0;
        for(int i=R; i>=L; i--){
            if(i%2 != 0 && i!=0){
                count ++;
                if(count ==K){
                    return  i;
                }
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int L=-3,R=3,K=5;
        System.out.println(KthLargestOdd(L,R,K));
    }
}
