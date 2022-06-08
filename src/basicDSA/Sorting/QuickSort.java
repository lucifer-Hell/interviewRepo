package basicDSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static int [] sort(int []arr){
        quickSort(arr,0,arr.length-1);
        return arr;
    }

    public static void quickSort(int []arr,int l,int r){
        if(l>=r)
            return;
        int mid=partition(arr,l,r);
        quickSort(arr,l,mid-1);
        quickSort(arr,mid+1,r);
    }
    // lomuto partion - not much faster
//    public static int partition(int []arr,int l,int r){
//        int pivot=arr[r];
//        int i=l-1,j=l;
//        while(j<=r){
//            if(arr[j]<=pivot){
//                swap(arr,++i,j++);
//            }
//            else j++;
//        }
////        System.out.println("Partitioned Array "+ Arrays.toString(arr));
//        return i;
//    }
//
    // hoarse partion
    public static int partition(int []arr,int l,int r){
        if(l>=r)return l;
        int i=l-1,j=r+1,pivot=arr[l];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) return j;
            swap(arr, i, j);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
