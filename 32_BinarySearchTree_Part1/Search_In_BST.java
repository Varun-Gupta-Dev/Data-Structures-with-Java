package BinarySearchTree_Part1;

public class Search_In_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static boolean search(Node root, int key){ // T.C=O(H)
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(key < root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
        
    }
    public static Node insert(Node root, int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left,value);
        }
        else if(value>root.data){
            root.right = insert(root.right,value);
        }
        return root;
    }
    public static void main(String args[]){
        Node root = null;
        int values[] = {5,1,3,4,2,7};
        for(int i=0; i<values.length; i++){
            root=insert(root,values[i]);
        }
        System.out.println(search(root,10));
    }
}
