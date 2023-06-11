import java.util.*;
public class Max_Area_In_Histogram {
    public static void maxArea(int histogram[]){
        Stack<Integer> s = new Stack<>();
        int maxarea=0;
        int nsr[] = new int[histogram.length];
        int nsl[] = new int[histogram.length];

        // Next Smaller Right
        for(int i=histogram.length-1; i>=0; i--){
            while(!s.isEmpty() && histogram[s.peek()]>=histogram[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = histogram.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>(); //--> Emptying the stack
        for(int i=0; i<histogram.length; i++){
            while(!s.isEmpty() && histogram[s.peek()]>=histogram[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area
        for(int i=0; i<histogram.length; i++){
            int height = histogram[i];
            int width = nsr[i]-nsl[i]-1;
            int area = height*width;
            maxarea = Math.max(maxarea,area);
        }
        System.out.println("Max area = "+maxarea);
    }
    public static void main(String args[]){
        int histogram[] = {2,1,5,6,3};
        maxArea(histogram);
    }
}
