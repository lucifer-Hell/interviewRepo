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

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
            System.out.println(Arrays.toString(HeapSort.sort(new int[]{-1, 2, 4, -5, 6})));
            System.out.println(Arrays.toString(SortArrayWithThreeTypes.sort(new int[]{2,2,2,1,1,0,0,2,2})));
    }
}
