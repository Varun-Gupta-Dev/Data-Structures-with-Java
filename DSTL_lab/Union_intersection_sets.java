package DSTL_lab;

public class Union_intersection_sets {
    public static void union(int arr1[], int arr2[]){
        int arr3[] = new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0; i<arr1.length; i++){
            arr3[k] = arr1[i];
            k++;
        }
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    break;
                }
                if(j == arr1.length-1 && arr1[j] != arr2[i]){
                    arr3[k] = arr2[i];
                    k++;
                }
            }
        }
        System.out.println("Union of sets is: ");
        for(int i=0; i<k; i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }
    
    public static void intersection(int arr1[], int arr2[]){
        int arr3[] = new int[arr1.length];
        int k=0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr2[j] == arr1[i]){
                    arr3[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        System.out.println("Intersection of sets is : ");
        for(int i=0; i<k; i++){
            System.out.print(arr3[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr1[] = {1,9,15};
        int arr2[] = {2,7};
        union(arr1,arr2);
        // intersection(arr1,arr2);
    }

}
