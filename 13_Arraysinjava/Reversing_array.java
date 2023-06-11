import java.util.*;
public class Reversing_array {
    public static void revarr(int arr[]){
        int start=0; int end=arr.length-1;int temp;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[]={11,21,54,43,22};
        revarr(arr);
        System.out.println("The array after reversing is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
