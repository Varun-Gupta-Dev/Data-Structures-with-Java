import java.util.*;
public class Insert_In_Heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //Add
        public void add(int data){ // O(logn)
            arr.add(data);

            int x = arr.size()-1; // Child index
            int par = (x-1)/2; // parent index
            while(arr.get(x) < arr.get(par)){
                // Swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }

        // peek
        public int peek(){ // O(1)
            return arr.get(0);
        }
    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);
        System.out.println(h.peek());
    }
}
