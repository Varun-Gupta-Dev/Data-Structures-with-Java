package Recursion;

public class FindLastOccurenceOfElementInArray {
    public static int lastOcc(int arr[], int key,int i){
        if(i==0 && arr[i] != key){
            return -1;

        }
        if(arr[i] == key){
            return i;
        }
        return lastOcc(arr,key,i-1);

    }
    public static void main(String args[]){
        int arr[] = {1,5,4,7,3,4,5,7};
        System.out.println(lastOcc(arr,8,arr.length-1));
    }
    
}
