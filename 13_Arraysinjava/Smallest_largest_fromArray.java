import java.util.*;
public class Smallest_largest_fromArray{
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i]; 
            }
        }
        return max;
    }
    public static int smallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int num[] = {1,3,45,33,23,21};
        int max = largest(num);
        int min = smallest(num);
        System.out.println("The largest element is: "+max);
        System.out.println("The smallest element is: "+min);
    }
}