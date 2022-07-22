package Contests.Leetcode.Weekly.Contest_302;

public class MaxNumberPair {
    public int[] numberOfPairs(int[] nums) {
        // 1 . freq arr , pairCount , loneCount
        int freq[]=new int [101];
        int pairCount=0,loneCount=0;
        // 2 . Iterate nums arr and update freq arr
        for(int i:nums)freq[i]++;
        // 3 . Iterate Freq arr and update pairCount , loneCount
        for(int count :freq){
            loneCount+=count%2;
            pairCount+=count/2;
        }
        return new int []{pairCount,loneCount};
    }
}
