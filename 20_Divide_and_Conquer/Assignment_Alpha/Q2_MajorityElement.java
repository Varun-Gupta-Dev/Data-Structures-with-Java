import java.util.*;

public class Q2_MajorityElement {
    public static int freq[] = new int[10];
    public static int maxFreq(int arr[], int si, int ei){
        if(si > ei){
            return 0;
        }
        
        freq[arr[si]]++;
        maxFreq(arr,si+1,ei);
        
        // finding index that has maximum frequency
        int max = Integer.MIN_VALUE;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>max){
                max = freq[i];
            }
        }
        int i;
        for( i=0; i<freq.length; i++){
            if(freq[i] == max){
                break;
            }
        }
        return i;
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,2,2,3,3,3,3};
        int majelem = maxFreq(arr,0,arr.length-1);
        System.out.println(majelem);
    }    
}
