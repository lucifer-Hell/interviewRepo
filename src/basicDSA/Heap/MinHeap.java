package basicDSA.Heap;

public class MinHeap {
    int arr[];
    int currCap;
    int maxCap;
    public MinHeap(int cap){
        arr=new int [cap];
        currCap=0;
        maxCap=cap;
    }
    int getLeftChildIndex(int i){
        return 2*i+1;
    }
    int getRightChildIndex(int i){
        return 2*i+2;
    }
    int getParent(int i){
        return (int) Math.floor((i-1)/2);
    }
    public int getMin(){
        return currCap==0?-1:arr[0];
    }

    public void insert(int ele){
        if(currCap==maxCap) {
            System.out.println("Couldnot insert element max cap reached !!");
            return;
        }
        arr[currCap++]=ele;
        for(int i=currCap-1;i>0;i=getParent(i)){
            // check parent and curr child balance
            int parent=getParent(i);
            int smallestIdx=getMin(arr,i,parent);
            if(smallestIdx!=parent){
                swap(arr,i,parent);
            }
            else break;
        }
    }

    public int extractMin() {
        if (currCap == 0)
            return -1;
        int minElement = arr[0];
        swap(arr, 0, --currCap);
        heapify(0);
        return minElement;
    }

    public int [] buildHeap(int []arr){
        this.arr=arr;
        currCap= arr.length;
        maxCap=arr.length;
        for(int i=(currCap-2)/2;i>=0;i--) {
            heapify(i);
        }
        return this.arr;
    }

    private void heapify(int i) {
        int leftChild=getLeftChildIndex(i);
        int rightChild=getRightChildIndex(i);
        int smallestIdx=i;
        if(leftChild<currCap && arr[leftChild]<arr[smallestIdx])
            smallestIdx=leftChild;
        if(rightChild<currCap && arr[rightChild]<arr[smallestIdx])
            smallestIdx=rightChild;
        if(smallestIdx!=i){
            swap(arr,i,smallestIdx);
            heapify(smallestIdx);
        }
    }

    private int getMin(int[] arr, int i, int j) {
        return (arr[i]<arr[j])?i:j;
    }
    private void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public int []getMinHeapArr(){
        return  arr;
    }
}
