package Contests.Leetcode.Weekly.Contest_302;

import java.util.Arrays;
import java.util.HashMap;

public class QueryTrim {
    public static int[] smallestTrimmedNumbers(String[] nums, int[][] queries){
        int []arr=new int [queries.length];
        for(int i=0;i<queries.length;i++){
                int k=queries[i][0]-1;
                int trimLen=queries[i][1];
                int []trimmedArray=getTrimmedArray(nums,trimLen);
                System.out.println("trimmed array "+Arrays.toString(trimmedArray));
                int []sortedIdxArr=getSortedIdxArray(trimmedArray);
                System.out.println(Arrays.toString(sortedIdxArr));
                arr[i]=sortedIdxArr[k];
            }
        return arr;
    }

    private static int[] getSortedIdxArray(int[] trimmedArray) {
        int []idxArr=new int[trimmedArray.length];
        for(int i=0;i<idxArr.length;i++)idxArr[i]=i;
        mergeSort(idxArr,trimmedArray,0,trimmedArray.length-1);
        return idxArr;
    }

    private static void mergeSort(int[] idxArr, int[] trimmedArray, int i, int j) {
        if(i>=j)return;
        int mid= i+(j-i)/2;
        mergeSort(idxArr,trimmedArray,i,mid);
        mergeSort(idxArr,trimmedArray,mid+1,j);
        merge(idxArr,trimmedArray,i,mid,j);
    }

    private static void merge(int[] idxArr, int[] trimmedArray, int i, int mid, int j) {
        int l=i,r=mid+1;
        int []temp=new int[j-i+1];
        int currIdx=0;
        while(l<=mid && r<=j){
            // if left element is > r then swap else dont
            int lidx=idxArr[l];
            int ridx=idxArr[r];
            int leftEle=trimmedArray[lidx];
            int rightEle=trimmedArray[ridx];
            if(leftEle>rightEle)
               temp[currIdx]=idxArr[r++];
            else
                temp[currIdx]=idxArr[l++];
            currIdx++;
        }
        while (l<=mid){
            temp[currIdx]=idxArr[l++];
            currIdx++;
        }
        while (r<=j){
            temp[currIdx]=idxArr[r++];
            currIdx++;
        }
        for(int k=i,z=0;k<=j;k++,z++)
            idxArr[k]=temp[z];
    }

    private static int[] getTrimmedArray(String[] nums, int trimLen) {
        int []arr=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.parseInt(getTrimmedString(nums[i],trimLen));
        }
        return arr;
    }

    private static String getTrimmedString(String num, int trimLen) {
        return num.substring(num.length()-trimLen);
    }

    public static void main(String[] args) {
        smallestTrimmedNumbers(new String []{"102","473","251","814"},new int[][] {{1,1},{2,3},{4,2},{1,2}});
    }
}
