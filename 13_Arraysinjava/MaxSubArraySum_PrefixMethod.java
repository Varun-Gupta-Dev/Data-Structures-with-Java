import java.util.*;
public class MaxSubArraySum_PrefixMethod { // O(n^2)
    public static void maxsum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        //prefix array
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int start =i;
            for(int j=i; j<arr.length; j++ ){
                int end =  j;

                // Calculating current sum
                int currsum = (start ==0 )?prefix[end]:(prefix[end] - prefix[start-1]);
                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum Sum = "+maxsum);
    }
        public static void main(String args[]){
            int arr[]={1,-2,6,-1,3};
            maxsum(arr);
        }    
}
