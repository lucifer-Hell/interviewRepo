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

public class Practice {

    public static void main(String[] args) {
        Deque deque=new ArrayDeque(7);
        int arr[]=new int []{1,2,3,4};
        int arr2[]=new int[]{5,6,7,8};
        System.out.println("empty deque case "+deque.getFront()+" "+deque.getRear());
        deque.removeFront();
        deque.removeRear();
        for(int ele:arr)
            deque.insertFront(ele);
        for(int ele:arr2)
            deque.insertRear(ele);
        boolean isEven=true;
        int count=16;
        while(count-->0) {
            if(isEven){
                System.out.println("removing from front "+deque.getFront());
                deque.removeFront();
            }else {
                System.out.println("removing from back " + deque.getRear());
                deque.removeRear();
            }
            isEven=!isEven;
        }

    }
}
