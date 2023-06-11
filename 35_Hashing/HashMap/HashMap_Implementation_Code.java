package Hashing.HashMap;
import java.util.*;
public class HashMap_Implementation_Code {
    static class HashMap<K,V>{// K,V--> generic.Beacuse we don't know the key and value type.
        private  class Node{  // So, key type can be anything and value type can be anything  
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[]; // N = buckets.length
        @SuppressWarnings("unchecked")

        public HashMap(){
            this.n=0;
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<buckets.length; i++){//  I have to create an empty LL at each index other there
                buckets[i] = new LinkedList<>();// will only be an emty array with no LL.
            }
        }
        private int hashFunction(K key){
            int hc = key.hashCode();
            Math.abs(hc);
            return hc % N; // bcz bi needs to be from 0 to size -1. 
        }
        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
    
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return i;
                }    
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbuckets[] = buckets;
            buckets = new LinkedList[2*N];
            N = 2*N;
            for(int i=0; i<oldbuckets.length; i++){
                LinkedList<Node> ll = oldbuckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di != -1){
                return true;
            }else{
                return false;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String args[]){
        @SuppressWarnings("unchecked")
        HashMap<String,Integer> hm = new HashMap();
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal",5);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
