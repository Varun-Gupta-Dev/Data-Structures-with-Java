package BinarySearchTree_Part1;

public class Deletion_Of_Node {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left = insert(root.left,val);
        }
        else if(val>root.data){
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(val < root.data){
            root.left = delete(root.left, val);
        }
        else if(val > root.data){
            root.right = delete(root.right, val);
        }
        // val == root.data
        else{
            // Case 1: leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // Case 2: Single Child
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // Case 3: Two Children
            else{
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right,IS.data);
            }

        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
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
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0; i<values.length; i++){
            root=insert(root,values[i]);
        }
        inOrder(root);
        delete(root,11);
        System.out.println();
        inOrder(root);
    }
}
