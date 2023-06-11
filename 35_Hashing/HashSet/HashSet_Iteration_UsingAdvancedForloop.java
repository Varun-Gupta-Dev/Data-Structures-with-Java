package Hashing.HashSet;
import java.util.*;
public class HashSet_Iteration_UsingAdvancedForloop {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("India");
        cities.add("Russia");
        cities.add("China");
        cities.add("Japan");

        for(String city : cities){
            System.out.println(city);
        }
    }
}
