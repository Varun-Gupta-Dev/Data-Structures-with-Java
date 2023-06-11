public class Q5_TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        // Base Condition
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        // Transfer n-1 disks from A to B with the help of C
        towerOfHanoi(n-1,src,dest,helper);
        // Transfer the remaining one disk in A to C
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        // Transfer the remaining n-1 disks in B To C
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]){
        towerOfHanoi(3,"A","B","C");
    }
}
