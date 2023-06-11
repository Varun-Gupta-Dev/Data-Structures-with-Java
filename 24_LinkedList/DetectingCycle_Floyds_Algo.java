public class DetectingCycle_Floyds_Algo { // Floyd's Cycle finding algorithm
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
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        DetectingCycle_Floyds_Algo ll = new DetectingCycle_Floyds_Algo();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next = head.next;
        System.out.println(ll.isCycle());
    }
    
}
