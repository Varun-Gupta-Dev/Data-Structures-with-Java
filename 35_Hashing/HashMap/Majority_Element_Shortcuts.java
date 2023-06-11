package Hashing.HashMap;
import java.util.*;
public class Majority_Element_Shortcuts {
    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Integer key : hm.keySet()){ // Need not to store the set of keys.
            if(key > n/3){
                System.out.print(key);
            }
        }
    }
}
