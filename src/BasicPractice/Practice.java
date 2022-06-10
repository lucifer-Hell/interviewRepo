package BasicPractice;


import basicDSA.Arrays.LeftRotateArray;
import basicDSA.Arrays.SecondLargestInArray;
import basicDSA.Hashing.LengthOfLongestSubArrayWithGivenSum;
import basicDSA.Hashing.SubArrayWithGivenSum;
import basicDSA.Hashing.SubArrayWithZeroSum;
import basicDSA.Heap.MinHeap;
import basicDSA.Recursion.GenerateSubsets;
import basicDSA.Recursion.RopeCut;
import basicDSA.Recursion.TowerOfHanoi;
import basicDSA.Sorting.*;
import basicDSA.Sorting.Examples.SortArrayWithThreeTypes;
import basicDSA.Stack.ArrayStack;
import basicDSA.Stack.Stack;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        Stack s1=new ArrayStack(3);
        int arr[]=new int []{1,2,3,6};
        System.out.println("empty stack case "+s1.pop()+" "+s1.peek());
        for(int ele : arr)
            s1.push(ele);
        while(s1.peek()!=-1) {
            System.out.print(s1.pop() + " ");
        }

    }
}
