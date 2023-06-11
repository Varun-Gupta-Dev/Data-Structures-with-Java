package Segment_Trees.Max_Min_SegmentTree;

public class Update {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int arr[], int i, int start, int end){
        if(start == end){
            tree[i] = arr[start];
            return;
        }
        int mid = (start+end)/2;
        buildST(arr, 2*i+1,start,mid);
        buildST(arr,2*i+2,mid+1,end);
        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
    }
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(qj < si || qi > sj){
            return Integer.MIN_VALUE;
        }
        else if(si>=qi && sj<=qj){
            return tree[i];
        }
        else{
            int mid = (si+sj)/2;
            int leftMax = getMaxUtil(2*i+1, si, mid, qi, qj);
            int rightMax = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftMax,rightMax);
        }
    }
    public static int getMax(int arr[], int qi, int qj){
        int n = arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);
    }
    public static void updateUtil(int i, int si, int sj, int idx, int newVal){
        if(idx < si || idx > sj){ // Non overlapping 
            return;
        }
        if(si==sj && si==idx){
            tree[i] = newVal;
            return;
        }
        else if(si != sj){// Non leaf nodes
            tree[i] = Math.max(tree[i], newVal);
            int mid = (si+sj)/2;
            updateUtil(2*i+1,si,mid,idx,newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);
            tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
        } 
    }
    public static void update(int arr[], int idx, int newVal){
        int n = arr.length;
        arr[idx] = newVal;
        updateUtil(0,0,n-1,idx,newVal);
    }
    public static void main(String args[]){
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        buildST(arr,0,0,n-1);
        System.out.println(getMax(arr,0,3));

        update(arr,1,0);
        System.out.println(getMax(arr, 0, 3));
    }
}
