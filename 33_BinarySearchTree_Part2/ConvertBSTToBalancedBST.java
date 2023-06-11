import java.util.*;

public class ConvertBSTToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return ;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }
    public static Node createBST(ArrayList<Integer> inorder,int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder,st,mid-1);
        root.right = createBST(inorder,mid+1,end);
        return root;
    }
    public static Node balancedBST(Node root){ // T.C = O(n)
        //Inorder Sequece
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);
        root = createBST(inorder,0,inorder.size()-1);
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
        /*5
        /                                8
         8                              / \    ---> Balanced BST
        / \                            5   11
        6  10                         / \  / \
       /    \ ---> Given BST         3  6 10  12 
       5    11
      /      \
      3      12 
         */

         Node root = new Node(8);
         root.left = new Node(6);
         root.right = new Node(10);
         root.left.left = new Node(5);
         root.right.right = new Node(11);
         root.left.left.left = new Node(3);
         root.right.right.right = new Node(12);

         root = balancedBST(root);
         inOrder(root);

    }
}
