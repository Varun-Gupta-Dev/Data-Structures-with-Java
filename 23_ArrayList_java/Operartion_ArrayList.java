import java.util.ArrayList;

public class Operartion_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // Add Operation(O(1))
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list);

        // Add Operation(O(n))
        list.add(1,7);
        // System.out.println(list);

        // Get operation(O(1))
        int element = list.get(3);
        // System.out.println(element);

        // Remove element(O(n))
        list.remove(1);
        // System.out.println(list);

        // Set element (O(n))
        list.set(3,11);
        // System.out.println(list);

        // Check for an element
        System.out.println(list.contains(100)); // ---> returns boolean value
        System.out.println(list.contains(11));
    }

}
