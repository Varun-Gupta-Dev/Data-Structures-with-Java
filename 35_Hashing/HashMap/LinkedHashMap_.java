package Hashing.HashMap;
import java.util.LinkedHashMap;
public class LinkedHashMap_ {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",280);
        lhm.put("China",300);
        lhm.put("US",100);
        System.out.println(lhm);
    }
}
