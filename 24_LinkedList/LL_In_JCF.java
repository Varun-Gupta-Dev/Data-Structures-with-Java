import java.util.LinkedList; //--> LinkedList class of JCF
public class LL_In_JCF {
    public static void main(String args[]){
        // Create(just like array list)
        // We can store objects in LL . Therefore we have to use classes like Integer,Float
        // Character rather than primitive datatypes like int,float,char..etc.
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.add(1);
        ll.add(2);
        System.out.println(ll);
        //Add
        ll.addFirst(0);
        ll.addLast(3);
        System.out.println(ll);
        
        // Remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.add(3);
        ll.add(4);
        ll.remove();
        System.out.println(ll);
        
    }
}
