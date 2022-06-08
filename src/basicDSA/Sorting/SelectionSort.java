package basicDSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    // not stable
    // In-place
    // Idea-
    // 1-st step find smallest element at place it in first place
    // 2nd step find second smallest element at place it in second place
    // 3rd step find third smallest element and place it in third place ....
    public static int [] sort(int []arr){
        for(int i=0;i<arr.length;i++){
            int minIdx=i;
            for(int j=i+1;j< arr.length;j++)
                if(arr[j]<arr[minIdx])
                    minIdx=j;
            swap(arr,i,minIdx);
            System.out.println("Curr situ "+ Arrays.toString(arr));
        }
        return arr;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
