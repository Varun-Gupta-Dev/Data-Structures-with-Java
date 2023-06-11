package Hashing;
import java.util.HashMap;
public class HashMap_Operations {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();

        // Put-O(1)
        hm.put("India",120);
        hm.put("China",200);
        hm.put("US",100);
        System.out.println(hm);

        // get-O(1)
        System.out.println(hm.get("India"));// Returns the value
        System.out.println(hm.get("Russia")); // Return null value because no such key.

        // containsKey-O(1)
        System.out.println(hm.containsKey("India"));// Return true
        System.out.println(hm.containsKey("Rusia"));// Return false

        // remove-O(1)
        System.out.println(hm.remove("China"));// Will remove key-value pair and return the value.
        System.out.println(hm);
        System.out.println(hm.remove("Russia"));// Will return null.

        // Size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // clear - Will remove all the data from the map.
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
