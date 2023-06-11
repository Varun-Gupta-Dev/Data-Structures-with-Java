import java.util.*;
public class inBuiltSort {
    public static void main(String args[]){

        Integer arr[] = {5,3,4,1,2};
       //Arrays.sort(arr,Collections.reverseOrder()); //--->Sorting in desc order 
       Arrays.sort(arr,0,3);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*  Collections.reverseOrder does not work on primitive datatypes but on objects
of different classes. Here Integer arr[] = {5,3,4,1,2} means the array is now an
object of Integer class*/