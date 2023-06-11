public class Iterative_Search {
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
    public int itrSearch(int key){  // Its linear Search--> T.C = O(n)
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }
    public static void main(String args[]){
        Iterative_Search ll = new Iterative_Search();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(10);
        ll.addLast(4);
        ll.addLast(9);
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.itrSearch(100));
        
    }
}
