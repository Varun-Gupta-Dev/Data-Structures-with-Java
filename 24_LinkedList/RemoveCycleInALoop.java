public class RemoveCycleInALoop {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        // Detect cycle
        Node slow=head;
        Node fast=head;
        boolean isCycle = false;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle == false){
            return;
        }
        // Find last node
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow =slow.next; // +1
            fast = fast.next; // +1
        }
        // Remove cycle
        prev.next = null;
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = head.next;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
