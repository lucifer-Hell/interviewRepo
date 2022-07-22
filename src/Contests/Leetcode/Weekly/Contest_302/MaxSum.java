package Contests.Leetcode.Weekly.Contest_302;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxSum {
    public int maximumSum(int[] nums) {
        HashMap<Integer, ArrayList<Integer>>digitSumMap=new HashMap<>();
        for(int ele : nums){
            int digitSum=getDigitSum(ele);
            if(digitSumMap.containsKey(digitSum)){
                ArrayList<Integer> eleList=digitSumMap.get(digitSum);
                if(eleList.size()==2){
                   int minIdx=getMinIdx(eleList);
                   if(ele>eleList.get(minIdx)){
                       eleList.remove(minIdx);
                       eleList.add(ele);
                   }
                }
                else {
                    // when only one element exists
                    eleList.add(ele);
                }
            }
            else{
                ArrayList<Integer>eleList=new ArrayList<>();
                eleList.add(ele);
                digitSumMap.put(digitSum,eleList);
            }
        }
        int maxSum=-1;
        for(int key: digitSumMap.keySet()){
            List<Integer>eleList=digitSumMap.get(key);
            if(eleList.size()==2)
                maxSum=Math.max(maxSum,getSumOfAllElements(eleList));
        }
        return maxSum;
    }

    private int getMinIdx(ArrayList<Integer> eleList) {
        return eleList.get(0)>eleList.get(1)?1:0;
    }

    private int getSumOfAllElements(List<Integer> eleList) {
        int sum=0;
        for(int ele:eleList)sum+=ele;
        return sum;
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
