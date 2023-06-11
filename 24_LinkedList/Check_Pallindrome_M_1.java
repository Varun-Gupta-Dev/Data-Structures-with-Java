public class Check_Pallindrome_M_1 {  // T.C = O(n)
    public static class Node{         // S.C = O(n)  
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
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }
    public  boolean checkPallindrome(){
        if(head == null || head.next == null){
            return true;
        }
        
        int size =0;
        Node temp =head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        int arr[] = new int[size];
        int i=0;
        temp = head;
        while(temp != null){
            arr[i] = temp.data;
            temp = temp.next;
            i++;
        }
       i=0;
        while(i<size/2){
            if(arr[i] != arr[size-i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String args[]){
        Check_Pallindrome_M_1 ll = new Check_Pallindrome_M_1();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        
        System.out.println(ll.checkPallindrome());
    }
}
