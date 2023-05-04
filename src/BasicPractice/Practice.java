package BasicPractice;


import basicDSA.Arrays.LeftRotateArray;
import basicDSA.Arrays.SecondLargestInArray;
import basicDSA.Hashing.LengthOfLongestSubArrayWithGivenSum;
import basicDSA.Hashing.SubArrayWithGivenSum;
import basicDSA.Hashing.SubArrayWithZeroSum;
import basicDSA.Heap.MaxHeap;
import basicDSA.Heap.MinHeap;
import basicDSA.Queue.ArrayQueue;
import basicDSA.Queue.LinkedQueue;
import basicDSA.Recursion.GenerateSubsets;
import basicDSA.Recursion.RopeCut;
import basicDSA.Recursion.TowerOfHanoi;
import basicDSA.Sorting.*;
import basicDSA.Sorting.Examples.SortArrayWithThreeTypes;
import basicDSA.Stack.ArrayStack;
import basicDSA.Stack.LinkedListStack;

import java.util.*;

public class Practice {

    static int search(int arr[], int l, int h, int key)
    {
        int i=0,j=h;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==key)return mid;
            else if(arr[i]>arr[mid] && arr[i]<=key)
                j=mid-1;
            else if (arr[j]<arr[mid] && arr[j]>=key)
                i=mid+1;
            else if (arr[mid]<key)
                i=mid+1;
            else j=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {

        // a majority elem must appear at least n/2+1 times
        // hence all the remaining count of elements must be = n - (n/2+1) = n/2-1
        search(new int[]{3,1},0,1,1);
    }
}
