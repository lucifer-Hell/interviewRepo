package Contests.Leetcode.Weekly.Contest_302;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class QueryTrim {
    public static int[] smallestTrimmedNumbers(String[] nums, int[][] queries){
        int []arr=new int [queries.length];
        for(int i=0;i<queries.length;i++){
                int k=queries[i][0]-1;
                int trimLen=queries[i][1];
                String []trimmedArray=getTrimmedArray(nums,trimLen);
                System.out.println("trimmed array "+Arrays.toString(trimmedArray));
                HashMap<String, ArrayList<Integer>>idxMap=getIdxMap(trimmedArray);
                radixSort(trimmedArray);
                int []sortedIdxArr=getSortedIdxArr(trimmedArray,idxMap);
                arr[i]=sortedIdxArr[k];
            }
        return arr;
    }

    private static int[] getSortedIdxArr(String[] trimmedArray, HashMap<String, ArrayList<Integer>> idxMap) {
        int []idxArr=new int [trimmedArray.length];
        int idx=0,currIdx=0;
        while(idx<trimmedArray.length){
            String ele=trimmedArray[idx];
            ArrayList<Integer>list=idxMap.get(ele);
            if(list.size()>0){
                idxArr[currIdx]=list.remove(0);
                currIdx++;
            }else idx++;
        }
        return idxArr;
    }

    private static HashMap<String, ArrayList<Integer>> getIdxMap(String[] trimmedArray) {
        HashMap<String, ArrayList<Integer>>idxMap=new HashMap<>();
        for(int j=0;j<trimmedArray.length;j++){
            String ele=trimmedArray[j];
            if(idxMap.containsKey(ele))
                idxMap.get(ele).add(j);
            else{
                ArrayList<Integer>idxList=new ArrayList<>();
                idxList.add(j);
                idxMap.put(ele,idxList);
            }
        }
        return idxMap;
    }

    private static void radixSort(String []arr){
        int maxBase=arr[0].length();
        for(int i=maxBase-1;i>=0;i--){
            sortWithBase(arr,i);
        }
    }

    private static void sortWithBase(String[] arr, int base) {
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                int a=arr[i].charAt(base)-'0';
                int b=arr[j].charAt(base)-'0';
                if(a>b){
                    swap(arr,i,j);
                }
            }
    }
    private static void swap(String[] arr, int i, int j) {
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static String[] getTrimmedArray(String[] nums, int trimLen) {
        String []arr=new String [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=getTrimmedString(nums[i],trimLen);
        }
        return arr;
    }

    private static String getTrimmedString(String num, int trimLen) {
        return num.substring(num.length()-trimLen);
    }

    public static void main(String[] args) {
        smallestTrimmedNumbers(new String []{"64333639502","65953866768","17845691654","87148775908","58954177897","70439926174","48059986638","47548857440","18418180516","06364956881","01866627626","36824890579","14672385151","71207752868"},new int[][] {{9,4},{6,1},{3,8},{12,9},{11,4},{4,9},{2,7},{10,3}, {13,1},{13,1},{6,1},{5,10}});
    }
}
