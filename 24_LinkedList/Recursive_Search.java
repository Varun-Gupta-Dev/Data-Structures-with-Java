public class Recursive_Search { // T.C = O(n)
                                // S.C = O(n)
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int helper(Node head, int key){
        // Base Case
        if(head == null){
            return -1; // key not found
        }
        if(head.data ==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String args[]){
        Recursive_Search ll = new Recursive_Search();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(10);
        ll.addLast(4);
        ll.addLast(9);
        System.out.println(ll.recSearch(10));
        System.out.println(ll.recSearch(20));
    }
}
