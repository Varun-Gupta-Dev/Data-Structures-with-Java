import java.util.Collections;
import java.util.ArrayList;

public class Sorting {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(1);
        Collections.sort(list); // Sort by default in ascending order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        // Collections.reverseOrder ---> It is comparator
        // A Comparator is a function that defines the logic of how a particular thing is done.
        System.out.println(list);
    }
}
