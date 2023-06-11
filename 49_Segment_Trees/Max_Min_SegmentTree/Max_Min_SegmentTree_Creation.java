package Segment_Trees.Max_Min_SegmentTree;

public class Max_Min_SegmentTree_Creation {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int arr[],int i, int start, int end){
        if(start == end){
            tree[i] = arr[start];
            return;
        }
        int mid = (start+end)/2;
        buildST(arr,2*i+1,start,mid);
        buildST(arr,2*i+2,mid+1,end);
        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
    }
    public static void main(String args[]){
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        buildST(arr,0,0,n-1);
        for(int i=0; i<tree.length; i++){
            System.out.print(tree[i]+" ");
        }
    }
}
