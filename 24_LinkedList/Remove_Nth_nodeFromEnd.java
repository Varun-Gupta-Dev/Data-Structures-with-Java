public class Remove_Nth_nodeFromEnd {
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
    public void printLL(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public  void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void removeFromEnd(int n){
        // Calculate size
        int size =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head = head.next; // If First node is to be removed
        }
        Node prev = head;
        for(int i=1; i<size-n; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String args[]){
        Remove_Nth_nodeFromEnd ll = new Remove_Nth_nodeFromEnd();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
        ll.removeFromEnd(3);
        ll.printLL();
    }
}
