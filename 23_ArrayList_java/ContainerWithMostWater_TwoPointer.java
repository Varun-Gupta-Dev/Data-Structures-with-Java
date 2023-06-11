import java.util.*;
public class ContainerWithMostWater_TwoPointer {
    public static int storeWater(ArrayList<Integer> height){ // two pointer approach
                                                             // T.C=O(n)
        int lp = 0;
        int rp = height.size()-1;
        int maxwater =0;
        while(lp<rp){
            // Calculate water
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currwater = ht*width;
            maxwater = Math.max(currwater,maxwater);
            // Updation
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
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
