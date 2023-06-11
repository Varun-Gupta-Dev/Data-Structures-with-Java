import java.util.*;
public class RemoveFromHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        // Add
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;
            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }
        //peek
        public int peek(){
            return arr.get(0);
        }
        // Remove
        public int remove(){ // T.C = O(logn)
            int data = arr.get(0);
            // Step 1: Swap first and last element --> O(1)
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // Step 2: Remove last element --> O(1)
            arr.remove(arr.size()-1);

            // Step 3: Heapify,i.e fix the heap
            heapify(0);
            return data;
        }
        private void heapify(int i){ // T.C = O(logn)
            int minIdx = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left < arr.size() && arr.get(left)<arr.get(minIdx)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(right) < arr.get(minIdx)){
                minIdx = right;
            }
            if(minIdx != i){
                // Swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
