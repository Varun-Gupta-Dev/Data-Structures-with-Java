public class Double_LL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    // Print Double LL
    public void printDLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Add Operation
    public void addFirst(int data){
        // Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1 --> temp = prev
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Remove operation
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if(size == 1){
            head = tail = null;
            size--;
            return val;
        }
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast(){
        int val = tail.data;
        if(head == null){
            System.out.println("DLL is empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            head = tail = null;
            size--;
            return val;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public int remove(int idx){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }else if(idx==0){
            return removeFirst();
        }else if(idx == size-1){
            return removeLast();
        }
        Node temp = head;
        int i=0;
        while(i <idx-1){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
         size--;
        return val;
    }
    public static void main(String args[]){
        Double_LL ll = new Double_LL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        ll.printDLL();
        System.out.println("size = "+size);
        ll.add(2,9);
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.remove(3));
        System.out.println("size = "+size);
        ll.printDLL();
    }
}
