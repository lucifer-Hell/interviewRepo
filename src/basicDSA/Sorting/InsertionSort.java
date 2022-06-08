package basicDSA.Sorting;

public class InsertionSort {
    // MIB -STABLE
    // IN-PLACE
    // take an element and place it in previous sorted array
    public static int [] sort(int []arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j])
                    swap(arr,j-1,j);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
