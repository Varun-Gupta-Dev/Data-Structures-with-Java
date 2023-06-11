package Hashing.HashSet;
import java.util.HashSet;
public class HashSet_Implementation {
 public static void main(String args[]){
    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);
    set.add(2);
    System.out.println(set);

    set.remove(2);
    System.out.println(set);

    System.out.println(set.contains(3));

    System.out.println(set.size());

    System.out.println(set.isEmpty());

    set.clear(); // --> Now the set is empty.
 }   
}
