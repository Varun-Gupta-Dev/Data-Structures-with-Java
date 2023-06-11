public class Add_Last_In_LL {
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
        // Step 1: Create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2: Tail ke next ko newNode ki taraf point karwao
        tail.next = newNode;
        // Step 3: newNode becomes tail now
        tail = newNode;
    }
    public static void main(String args[]){
        Add_Last_In_LL ll = new Add_Last_In_LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
    
}
