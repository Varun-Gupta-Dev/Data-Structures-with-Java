import java.util.*;

public class Q2_closest_abs_diff {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static int min=0;
    public static Node closestNode(Node root, int k){
        if(root==null){
            return ;
        }
        if(root.data==k){
            return root;
        }
       HashMap<Integer,Node> map = new HashMap<>();
       int diff = root.data-k;
       int absdiff = Math.abs(diff);
       map.put(absdiff,root);
       min = Math.min(min,absdiff);
       closestNode(root.left,k);
       closestNode(root.right,k);

       return map.get(min);

    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);

        System.out.println(closestNode(root,19));
    }
}
