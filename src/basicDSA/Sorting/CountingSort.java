package basicDSA.Sorting;

import java.util.Arrays;

// Stable algorithm
public class CountingSort {
    // idea is to use count array whose length will be equal to max number present in array
    public static void sort(int []arr){
        if(arr.length<=1)return;
        int maxEle=getMaxEle(arr);
        int[]count=new int [maxEle+1];
        for(int ele:arr)count[ele]++;
        // we are previous element count so that we can know the exact idx
        // for the current element
        for(int i=1;i<count.length;i++)
            count[i]+=count[i-1];
        // create the new output arr starting iteration from last idx in order to keep it stable
        // refer lecture gfg if doubt
        int output[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<output.length;i++)
            arr[i]=output[i];
        System.out.println("Sorted array - "+ Arrays.toString(arr));
    }

    private static int getMaxEle(int[] arr) {
        int max=arr[0];
        for(int ele:arr)
            max=Math.max(ele,max);
        return max;
    }

    public static void main(String[] args) {
       CountingSort.sort(new int []{1,22,89,33,44,89,89,122,0});
    }
}
