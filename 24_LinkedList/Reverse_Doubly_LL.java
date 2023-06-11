public class Reverse_Doubly_LL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data ){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void printDll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
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
        head.prev = newNode;
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
         newNode.prev = tail;
         tail = newNode;
    }
    public void reverseDll(){ // 3 Nodes + 5 Steps
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        Reverse_Doubly_LL ll = new Reverse_Doubly_LL();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printDll();
        ll.reverseDll();
        ll.printDll();
    }
}
