package Assignment_Alpha;

public class Q3_invCount_Recursion{
    static int invCount =0;

    public static int getInvCount(int arr[]){
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }

    public static int mergeSort(int arr[], int si, int ei){
        int invCount =0;
        if(ei>si){
            
            int mid = si + (ei-si)/2;
           invCount = mergeSort(arr,si,mid);
           invCount += mergeSort(arr,mid+1,ei);
           invCount += merge(arr,si,mid+1,ei);
        }
        return invCount;
    }

    public static int merge(int arr[], int si, int mid, int ei){
        int i=si, j=mid+1,k=0;
        int invCount=0;
        int temp[] = new int[ei-si+1];
        while(i<mid && j<=ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                invCount = invCount+ ( mid-si);
                temp[k] = arr[j];
                k++;
                j++;

            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // Copying temp to original array
        for( k=0,i=si; k<temp.length; k++,i++ ){
            arr[i] = temp[k];
        }
        return invCount;
    }
    public static void main(String args[]){
        int arr[]= {7,9,12,5,6,8,10};
        System.out.println(getInvCount(arr));

    }
}