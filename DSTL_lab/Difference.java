package DSTL_lab;

public class Difference{
    public static void difference(int arr1[], int arr2[]){
        // A-B
        int arr3[] = new int[arr1.length];
        int k=0;
        for(int i=0; i<arr1.length; i++){
            boolean isPresent = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    isPresent = true;
                    break;
                }
            }
            if(isPresent == false){
                arr3[k] = arr1[i];
                k++;
            }
        }
        System.out.print("A-B = ");
        for(int i=0; i<k; i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        // B-A
        int arr4[] = new int[arr2.length];
        int l=0;
        for(int j=0; j<arr2.length; j++){
            boolean isPresent = false;
            for(int i=0; i<arr1.length; i++){
                if(arr2[j] == arr1[i]){
                    isPresent = true;
                    break;
                }
            }
            if(isPresent == false){
                arr4[l] = arr2[j];
                l++;
            }
        }
        System.out.print("B-A = ");
        for(int i=0; i<l; i++){
            System.out.print(arr4[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int arr1[] = {1,4,9,10,15};
        int arr2[] = {2,4,7,10};
        difference(arr1,arr2);
        
    }
    
}
