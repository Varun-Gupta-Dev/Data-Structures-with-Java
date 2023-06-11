public class Check_Pallindrome_M_2 { // T.C = O(n)
                                     // S.C = O(1)
    
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data=data;
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
    public Node findMid(Node head){ // Slow Fast Approach
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // My mid node
    }
    
    public boolean checkPallindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Step 1: Find middle node
        Node midNode = findMid(head);

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // head of right half
        Node left = head;
        // Step 3: Check right and left half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }         
    public static void main(String args[]){
        Check_Pallindrome_M_2 ll = new Check_Pallindrome_M_2();
        ll.addFirst(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.checkPallindrome());
    }
}
