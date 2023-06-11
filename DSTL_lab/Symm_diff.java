package DSTL_lab;

public class Symm_diff {
    public static void symmDiff(int arr1[], int arr2[]){
        difference(arr1,arr2);
    }

    // Difference
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
    
       union(arr3,arr4,k,l);

    }

    //  Union
    public static void union(int arr1[], int arr2[], int size1, int size2){
        int arr3[] = new int[arr1.length+arr2.length];
        int m=0;
        for(int i=0; i<size1; i++){
            arr3[m] = arr1[i];
            m++;
        }
        for(int i=0; i<size2; i++){
            boolean isPresent = false;
            for(int j=0; j<size1; j++){
                if(arr1[j] == arr2[i]){
                    isPresent = true;
                    break;
                }
            }
            if(isPresent == false){
                arr3[m] = arr2[i];
                m++;
                
            }
            
        }
        System.out.print("Symmetric Difference = ");
        for(int i=0; i<m; i++){
            System.out.print(arr3[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr1[] = {1,4,9,10,15};
        int arr2[] = {2,4,7,10};
        symmDiff(arr1,arr2);
    }
    
}
