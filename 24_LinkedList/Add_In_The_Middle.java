public class Add_In_The_Middle { // T.C = O(n)
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
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        // i=idx-1 , temp is equal to previous
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Add_In_The_Middle ll = new Add_In_The_Middle();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.printLL();

    }
}
