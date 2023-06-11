package Segment_Trees.Max_Min_SegmentTree;

public class Query {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int arr[], int i, int start, int end){
        if(start==end){
            tree[i]=arr[start];
            return;
        }
        int mid = (start+end)/2;
        buildST(arr,2*i+1, start, mid);
        buildST(arr,2*i+2, mid+1, end);
        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
    }
    public static int getMax(int arr[], int qi, int qj){
        int n = arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);
    }
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(qj< si || qi > sj){ // No overlap
            return Integer.MIN_VALUE;
        }
        else if(si>=qi && sj<=qj){ // Complete overlap
            return tree[i];
        }
        else{ // Partial Overlap
            int mid = (si+sj)/2;
            int leftMax = getMaxUtil(2*i+1, si, mid, qi, qj);
            int rightMax = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftMax, rightMax);
        }
    }
    public static void main(String args[]){
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n= arr.length;
        init(n);
        buildST(arr,0,0,n-1);
        int max = getMax(arr, 1, 5);
        System.out.println(max);
    }
}
