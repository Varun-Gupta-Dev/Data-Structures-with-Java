import java.util.*;
public class ContainerWithMostWater_BruteForce {

    public static int storeWater(ArrayList<Integer> Height){ // T.C = O(n^2)
        int maxwater =0;
        // Brute Force
        for(int i=0; i<Height.size()-1; i++){
            for(int j=i+1; j<Height.size(); j++){
                int height = Math.min(Height.get(i),Height.get(j));
                int width = j-i;
                int currwater = height*width;
                maxwater = Math.max(maxwater,currwater);
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
