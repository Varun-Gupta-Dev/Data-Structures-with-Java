import java.util.LinkedList;
public class MergeSortOnLinkedList {
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
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }
    private Node merge(Node leftHead, Node rightHead){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(leftHead != null && rightHead != null){
            if(leftHead.data <= rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            }else{
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        // For left over nodes
        while(leftHead != null){
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while(rightHead != null){
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // Call mergeSort for left and right half
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(rightHead);

        // merge left and right half
        return merge(newleft,newright);
    }
    public static void main(String args[]){
        MergeSortOnLinkedList ll = new MergeSortOnLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL();
        ll.head = ll.mergeSort(ll.head);
        ll.printLL();
    }
}
