package Recursion;

public class FindFirstOccurenceOfElementInArray {
    public static int firstOcc(int arr[], int i,int key){ //T.C=O(n)
        if(arr[i] == key){
            return i;
        }
        if(i==arr.length-1){                              //S.C=O(n)
            return -1;
        }
        return firstOcc(arr,i+1,key);

    }
    public static void main(String args[]){
        int arr[] = {1,2,7,4,5,7,6,5,3,2,10};
        System.out.println(firstOcc(arr,0,10));
    }
    
}
