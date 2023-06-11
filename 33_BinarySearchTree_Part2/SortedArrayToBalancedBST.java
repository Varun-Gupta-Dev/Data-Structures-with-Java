package BinarySearchTree_Part2;

public class SortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node createBST(int arr[], int start, int end){ // T.C = O(n)
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }
    public static void main(String args[]){
        /*8
         / \
        5   11
       / \ /  \
      3  6 10 12     
         */
        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBST(arr,0,arr.length-1);
        preOrder(root);
    }
}
