import java.util.*;
public class Next_Greater {
    public static void nxtGreater(int arr[]){  // T.C = O(n)
        int nxtgreater[] = new int[arr.length];
        Stack <Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgreater[i] = -1;
            }else{
                nxtgreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0; i<nxtgreater.length; i++){
            System.out.print(nxtgreater[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        nxtGreater(arr);
    }
}
