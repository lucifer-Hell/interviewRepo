package Contests.Leetcode.Weekly.Contest_302;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxSum {
    public int maximumSum(int[] nums) {
        // 10^9 max number having 9 digits each with 9 value so 9*9=81
        int digSumFreq[]=new int[82];
        int maxSum=-1;
        for(int ele : nums) {
            int digitSum = getDigitSum(ele);
            if(digSumFreq[digitSum]!=0){
                maxSum=Math.max(maxSum,digSumFreq[digitSum]+ele);
            }
            digSumFreq[digitSum]=Math.max(ele,digSumFreq[digitSum]);
        }
        return maxSum;
    }
    private int getDigitSum(int ele) {
        int sum=0;
        while (ele>0){
            int lastDigit=ele%10;
            sum+=lastDigit;
            ele=ele/10;
        }
        return sum;
    }
}
