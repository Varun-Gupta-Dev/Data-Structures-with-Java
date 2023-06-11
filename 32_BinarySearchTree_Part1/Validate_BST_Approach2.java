package BinarySearchTree_Part1;

public class Validate_BST_Approach2 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root=new Node(val);
            return root;
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        }
        else if(val > root.data){
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean validateBST(Node root, Node min, Node max){
        
        if(root==null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data ){
            return false;
        }
        return validateBST(root.left,min,root) && validateBST(root.right,root,max);
    }
    public static void main(String args[]){
        Node root = null;
        int values[] = {8,5,3,6,10,11,14};
        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }
        System.out.println(validateBST(root,null,null));
    }
}
