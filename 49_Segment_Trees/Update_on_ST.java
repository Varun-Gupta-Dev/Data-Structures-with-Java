package Segment_Trees;

public class Update_on_ST {
    static int tree[];
    public static void init(int n){
        tree = new int[4*n];
    }
    public static int buildST(int arr[], int i, int start, int end){
        if(start==end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        buildST(arr,2*i+1, start,mid);
        buildST(arr,2*i+2, mid+1, end);
        tree[i] = tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }
    public static int getSumUtil(int i, int si, int sj, int qi, int qj){
        if(qj < si || qi > sj){
            return 0;
        }
        else if(si>=qi && sj<=qj){
            return tree[i];
        }
        else{
            int mid = (si+sj)/2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2,mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getSum(int arr[], int qi, int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }
    // TC = O(logn)
    public static void updateUtil(int i, int si, int sj, int idx, int diff){ // Will do updation in ST.
        if(idx < si || idx > sj){
            return;
        }
        tree[i] = tree[i]+diff;
        if(si != sj){
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff); // left
            updateUtil(2*i+2, mid+1, sj, idx, diff); // right
        }
    }
    // TC = O(1)
    public static void update(int arr[], int idx, int newVal){ // Will do updation in the array
        int n = arr.length;
        int oldVal = arr[idx];
        arr[idx] = newVal;
        int diff = newVal - oldVal;

        updateUtil(0,0,n-1,2,diff);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildST(arr,0,0,n-1);
        System.out.println(getSum(arr, 0, 4));
        update(arr,2,2);
        System.out.println(getSum(arr,0,4));
    }
}
