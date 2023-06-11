package Practice;

import java.util.*;
public class _4max_sum_brutforce {
    //Brute Force O(n^3)
   public static int minSubArrSum(int arr[]){
    int n = arr.length;
    int minSum = Integer.MAX_VALUE;
    int sum = 0;
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            sum=0;
            for(int k=i; k<=j; k++){
                sum += arr[k];
                minSum = Math.min(sum,minSum);
            }
        }
    }
    return minSum;
   }

   public static int maxSubArrSum(int arr[]){
    int n = arr.length;
    int maxSum = Integer.MIN_VALUE;
    int sum=0;
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            sum=0;
            for(int k=i; k<=j; k++){
                sum += arr[k];
                maxSum = Math.max(sum,maxSum);
            }
        }
    }
    return maxSum;
   }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int minSum = minSubArrSum(arr);
        int maxSum = maxSubArrSum(arr);
        System.out.println("Minimum sum: "+minSum);
        System.out.println("Maximum Sum: "+maxSum);
    }
  
}
