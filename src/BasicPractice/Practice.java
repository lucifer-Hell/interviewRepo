package BasicPractice;


import basicDSA.Arrays.LeftRotateArray;
import basicDSA.Arrays.SecondLargestInArray;
import basicDSA.Deque.ArrayDeque;
import basicDSA.Deque.Deque;
import basicDSA.Hashing.LengthOfLongestSubArrayWithGivenSum;
import basicDSA.Hashing.SubArrayWithGivenSum;
import basicDSA.Hashing.SubArrayWithZeroSum;
import basicDSA.Heap.MinHeap;
import basicDSA.Queue.ArrayQueue;
import basicDSA.Queue.Queue;
import basicDSA.Recursion.GenerateSubsets;
import basicDSA.Recursion.RopeCut;
import basicDSA.Recursion.TowerOfHanoi;
import basicDSA.Sorting.*;
import basicDSA.Sorting.Examples.SortArrayWithThreeTypes;
import basicDSA.Stack.ArrayStack;
import basicDSA.Stack.LinkedListStack;
import basicDSA.Stack.Stack;

import java.util.Arrays;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {
//        String[] alpha=new String[]{"64333639502","65953866768","17845691654","87148775908","58954177897","70439926174","48059986638","47548857440","18418180516","06364956881","01866627626","36824890579","14672385151","71207752868"};
//        String[] alpha=new String[] {"9502"
//                ,"6768"
//                ,"1654"
//                ,"5908"
//                ,"7897"
//                ,"6174"
//                ,"6638"
//                ,"7440"
//                ,"0516"
//                ,"6881"
//                , "7626"
//                , "0579"
//                , "5151"
//                , "2868"};
        String []alpha=new String[]{"7897","7440","7626","2868"};
        radixSort(alpha);

        System.out.println(Arrays.toString(alpha));
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
}
