import java.util.*;
public class Insertion_element {

    public static void insertion(int arr[], int pos, int end, int value){

        for(int i=end-1; i>=pos-1; i--){
            arr[i+1] = arr[i];
            if(i==pos-1){
                arr[i] = value;
            }
        }
        for(int i=0; i<end+1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        insertion(arr,pos,n,7);
        

    }
    
}
