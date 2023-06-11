import java.util.*;
public class Update{
    public static void  update(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {98,97,99};
        update(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}