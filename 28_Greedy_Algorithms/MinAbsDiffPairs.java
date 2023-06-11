package Greedy_Algorithms;
import java.util.*;
public class MinAbsDiffPairs {
    public static void main(String args[]){ /*T.C=O(nlogn)+O(n)=O(nlogn+n)=O(n(logn+1)) */
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Min sum of absolute differences = "+minDiff);
    }
}
