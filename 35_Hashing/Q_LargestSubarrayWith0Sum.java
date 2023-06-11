package Hashing;
import java.util.*;
public class Q_LargestSubarrayWith0Sum {
    public static void main(String args[]){// O(n)
        int arr[] = {15,-2,2,-8,1,7,10};
        int sum = 0; 
        int len = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                int i = map.get(sum);
                len = Math.max(len,j-i);
            }
            else{
                map.put(sum,j);
            }
        }
        System.out.println("Size of Largest subarray with 0 sum = "+len);
    }
}
