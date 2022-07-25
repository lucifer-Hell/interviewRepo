package basicDSA.Sorting;

import java.util.Arrays;

// Stable Algo
public class RadixSort {
    public static void sort(int []arr){
        // Idea is to use radixes for sorting and counting sort as a subroutine for sorting
        int maxEle=getMaxEle(arr);
        // In -ve idx case just find the min -ve number and add that much +Ve in all ele of arr
        if(maxEle==0)return ;
        int digitCount=getDigitCount(maxEle);
        for(int i=0;i<digitCount;i++)
            countSort(arr,(int)Math.pow(10,i));
        System.out.println("Sorted array:-> " + Arrays.toString(arr));
    }

    // Sub routine for radix sort
    private static void countSort(int[] arr, int div) {
        int out[]=new int[arr.length];
        // Since we are following decimal number system
        int baseArr[]=new int[10];
        for(int ele:arr)
            baseArr[getBase(ele,div)]++;
        // add prev counts to get the index of each ele -- refer count sort if not understood
        for(int i=1;i<=9;i++)
            baseArr[i]+=baseArr[i-1];
        System.out.println(baseArr);
        // generate output arr
        for(int i=arr.length-1;i>=0;i--){
            int idx=baseArr[getBase(arr[i],div)];
            out[idx-1]=arr[i];
            baseArr[getBase(arr[i],div)]--;
        }
        for(int i=0;i< arr.length;i++)
            arr[i]=out[i];
    }

    private static int getBase(int ele, int div) {
        return (ele/div)%10;
    }

    private static int getDigitCount(int maxEle) {
        int digitCount=0;
        while(maxEle>0){
            digitCount++;
            maxEle/=10;
        }
        return digitCount;
    }

    private static int getMaxEle(int[] arr) {
        int maxEle=arr[0];
        for(int ele:arr)maxEle=Math.max(maxEle,ele);
        return maxEle;
    }

    public static void main(String[] args) {
       RadixSort.sort(new int []{1,8,2002,9,9,9,4444,344,2444,112,122,110});
    }
}
