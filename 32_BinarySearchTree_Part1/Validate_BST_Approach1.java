package BinarySearchTree_Part1;
import java.util.*;
public class Validate_BST_Approach1 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(val <= root.data){
            root.left = insert(root.left, val);
        }
        else if(val > root.data){
            root.right = insert(root.right,val);
        }
        return root;
    }
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        arr.add(root.data);
        inOrder(root.right);
    }
    public static boolean validateBST(Node root){
        inOrder(root);
        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i)>=arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Node root = null;
        int values[] = {5,3,1,4,8};
        for(int i=0; i<values.length; i++){
           root = insert(root,values[i]);
        }
        System.out.println(validateBST(root));
    }
}
