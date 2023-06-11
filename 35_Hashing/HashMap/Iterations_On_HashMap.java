package Hashing;
import java.util.*;
public class Iterations_On_HashMap {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",300);
        hm.put("Russia",200);
        hm.put("Indonesia",50);
        hm.put("China",400);
        hm.put("U.S.",250);
        hm.put("Japan",350);

        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println("key = "+k+", value = "+hm.get(k));
        }
    }
}
