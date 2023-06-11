package Practice_Questions;

public class Q1 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static int sum=0;
    public static void sumInRange(Node root, int l, int r){
        if(root==null){
            return ;
        }
        if(root.data>=l && root.data <= r){
            sumInRange(root.left,l,r);
            sum = sum + root.data;
            sumInRange(root.right,l,r);
        }
        else if(root.data < l){
            sumInRange(root.right,l,r);
            
        }
        else if(root.data>r){
            sumInRange(root.left,l,r);
        }
        
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);

        sumInRange(root,10,21);
        System.out.println(sum);
    }
}
