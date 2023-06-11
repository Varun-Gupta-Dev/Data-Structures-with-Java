import java.util.*;
public class Root_To_Leaf_Paths {
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
            root.right = insert(root.right,val);
        }
        return root;
    }
    static ArrayList<Integer> path = new ArrayList<>();
    static int i=-1;
    public static void rootToLeaf(Node root){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left ==null && root.right==null){
            printPath(path);
            
        }
        rootToLeaf(root.left);
        rootToLeaf(root.right);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int j=0; j<path.size(); j++){
            System.out.print(path.get(j)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Node root=null;
        int values[] = {8,5,3,6,10,11,14};
        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }
        rootToLeaf(root);
    }
}
