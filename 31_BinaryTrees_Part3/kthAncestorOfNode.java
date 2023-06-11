package BinaryTrees_Part3;

public class kthAncestorOfNode {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    public static int kthAncestor(Node root, int n, int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist = kthAncestor(root.left,n,k);
        int rightdist = kthAncestor(root.right,n,k);
        if(leftdist==-1 && rightdist==-1){
            return -1;
        }
        else if(rightdist==-1){
            if((leftdist+1)==k){
                System.out.println(root.data);
            }
            return leftdist+1;
        }
        else{
            if((rightdist+1)==k){
                System.out.println(root.data);
            }
            return rightdist+1;
        }
        
    }
    
    public static void main(String args[]){
        /*1
         / \
        2   3
       / \ / \
      4  5 6  7
       
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kthAncestor(root,5,1);
    }
}
