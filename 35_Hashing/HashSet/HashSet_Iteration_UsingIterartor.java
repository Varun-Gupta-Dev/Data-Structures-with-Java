package Hashing.HashSet;
import java.util.*;
public class HashSet_Iteration_UsingIterartor {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("India");
        cities.add("Russia");
        cities.add("China");
        cities.add("Japan");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
