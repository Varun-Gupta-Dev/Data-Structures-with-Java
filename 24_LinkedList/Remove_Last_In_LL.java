public class Remove_Last_In_LL {
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
    public static int size=0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
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
        size++;
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
    public int removeFirst(){
        if(size == 0){ // LL is empty
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data; // tail.data
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public static void main(String args[]){
        Remove_Last_In_LL ll = new Remove_Last_In_LL();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.printLL();
        System.out.println(ll.removeFirst());
        ll.printLL();
        System.out.println(ll.removeLast());
        ll.printLL();
        System.out.println(ll.size);

    }
}
