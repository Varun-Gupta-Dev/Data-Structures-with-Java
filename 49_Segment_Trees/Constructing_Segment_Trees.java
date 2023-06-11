package Segment_Trees;

public class Constructing_Segment_Trees {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    // TC = O(n)
    public static int buildST(int arr[],int sti, int start, int end){// sti = Segment Tree Index
        if(start == end){
            tree[sti] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        buildST(arr,2*sti+1,start,mid); // left subtree
        buildST(arr,2*sti+2,mid+1,end); // right subtree
        tree[sti] = tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        init(arr.length);
        buildST(arr,0,0,arr.length-1);
        for(int i=0; i<tree.length; i++){
            System.out.print(tree[i]+" ");
        }
    }
}
