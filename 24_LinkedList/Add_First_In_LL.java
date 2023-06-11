public class Add_First_In_LL {
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

    public void addFirst( int data){ // T.C = O(1)
        // Step 1: Create new node
        Node newNode = new Node(data); 
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2: newNode next = head
        newNode.next = head;
        // Step 3: head = newNode
        head = newNode; 
    }
    public static void main(String args[]){
        Add_First_In_LL ll = new Add_First_In_LL();
        ll.addFirst(1);
        ll.addFirst(2);

    }
    
}
