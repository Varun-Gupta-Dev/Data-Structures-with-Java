package BinarySearchTree_Part1;

public class Build_a_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<root.data){
            //left Subtree
            root.left = insert(root.left,value);
        }
        else if(value>root.data){
            //right subtree
            root.right = insert(root.right,value);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String args[]){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }
        inOrder(root);
}
    }
