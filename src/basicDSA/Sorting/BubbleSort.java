package basicDSA.Sorting;

public class BubbleSort {
    // inplace (doesnot require any extra space ) stable algo
    // Basic idea --> the largest element bubbles to last idx (top) -1st step
    // second largest element bubblese to top -2nd step
    // third largest element bubbles to top -3rd step
    public static int[] sort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
