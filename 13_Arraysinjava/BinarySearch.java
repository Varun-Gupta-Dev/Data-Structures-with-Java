import java.util.*;
public class BinarySearch {
    public static int binsearch(int arr[], int key){
        int start= 0;
        int end = arr.length -1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){ //left
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,23,34,37,76,88,98,99};
        int key = 99;
        int index = binsearch(arr,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{

            System.out.println("Key found at index: "+index);
        }
    }
}
