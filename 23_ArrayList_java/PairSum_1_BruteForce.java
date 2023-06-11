import java.util.*;
public class PairSum_1_BruteForce { // T.C = O(n^2)

    public static boolean pairSum(ArrayList<Integer> list, int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    System.out.println("("+list.get(i)+","+list.get(j)+")");
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list.add(i);
        }
        System.out.println(pairSum(list,5));
        
     }
}
