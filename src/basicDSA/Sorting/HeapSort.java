package basicDSA.Sorting;

import basicDSA.Heap.MinHeap;

public class HeapSort {
    public static int []sort (int []arr){
        MinHeap minHeap=new MinHeap(arr.length);
        minHeap.buildHeap(arr);
        for(int i= arr.length-1;i>=0;i++)
            minHeap.extractMin();
        return arr;
    }
}
