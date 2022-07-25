package Contests.Leetcode.Weekly.Contest_302;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class QueryTrim {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int ans[]=new int [queries.length];
        int idx=0;
        for (int[] query : queries) {
            int k = query[0], trimLen = query[1];
            String[] trimmedArray = getTrimmedArray(nums, trimLen);
            int []sortedIdxArr=getSortedIdxArr(trimmedArray);
            ans[idx]=sortedIdxArr[k-1];
            idx++;
        }
        return ans;
    }
    // apply radix sort
    private int[] getSortedIdxArr(String[] trimmedArray) {
        int baseLength=trimmedArray[0].length();
        // call counting sort
        int []idxArr=new int [trimmedArray.length];
        for(int i=0;i< trimmedArray.length;i++)
            idxArr[i]=i;
        for(int i=0;i<baseLength;i++)
        {
            idxArr=sort(trimmedArray,idxArr,i);
        }
        return idxArr;
    }
    
    private int[] sort(String[] trimmedArray,int []currIdxArr, int baseLength) {
        int []out =new int[trimmedArray.length];
        int []base=new int [10];
        // max a number in decimal system can be 9
        for(int i=0;i< trimmedArray.length;i++){
            int currBase=getCurrBase(trimmedArray[currIdxArr[i]],baseLength);
            base[currBase]++;
        }
        // calc prefix sum
        for(int i=1;i<=9;i++)base[i]+=base[i-1];
        // generate out arr
        for(int i=trimmedArray.length-1;i>=0;i--){
            int currBase=getCurrBase(trimmedArray[currIdxArr[i]],baseLength);
            out[base[currBase]-1]=currIdxArr[i];
            base[currBase]--;
        }
        return out;
    }
    private static  int getCurrBase(String str,int baseLength){
        return str.charAt(str.length()-1-baseLength)-'0';
    }
    private String[] getTrimmedArray(String[] nums, int trimLen) {
        String[] out = new String[nums.length];
        for(int i=0;i<nums.length;i++)
            out[i]=nums[i].substring(nums[i].length()-trimLen);
        return out;
    }
}

