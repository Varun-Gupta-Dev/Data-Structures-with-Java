package Hashing.HashMap;
import java.util.*;
public class Majority_Element {
    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            if(hm.get(key) > n/3){
                System.out.print(key);
            }
        }
    }
}
