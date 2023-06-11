import java.util.*;

public class Q3_kthSmallestElement {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static int kthSmallest(Node root, int k){ // T.C = O(n), S.C = O(n)
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder( root, arr);
        return arr.get(arr.size()-k);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);
        System.out.println(kthSmallest(root,5));
    }
}
