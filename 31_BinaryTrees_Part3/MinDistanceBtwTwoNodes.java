package BinaryTrees_Part3;

public class MinDistanceBtwTwoNodes {
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
    public static Node lca(Node root, int n1, int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }
    public static int lcaToNode(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist = lcaToNode(root.left,n);
        int rightDist = lcaToNode(root.right,n);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(rightDist==-1){
            return leftDist+1;
        }
        else{
            return rightDist+1;
        }
    }
    public static int minDist(Node root, int n1, int n2){  // T.C=O(n)
        Node lca = lca(root,n1,n2);
        int dist1 = lcaToNode(lca,n1);
        int dist2 = lcaToNode(lca,n2);
        return dist1+dist2;
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

        int n1=1,n2=6;
        System.out.println(minDist(root,n1,n2));
    }
}
