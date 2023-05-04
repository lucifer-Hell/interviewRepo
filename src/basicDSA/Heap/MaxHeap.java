package basicDSA.Heap;

public class MaxHeap {
    private int maxCap;
    private int currSize;
    private int []arr;
    public MaxHeap(int maxCap){
        this.maxCap=maxCap;
        arr=new int[maxCap];
        currSize=0;
    }
    public int size(){
        return currSize;
    }
    public void insert(int ele){
        if(currSize==maxCap)
            System.out.println("heap is full");
        else {
            arr[currSize]=ele;
            heapifyUp(currSize);
            currSize++;
        }
    }

    public void delete(int idx){
        if(idx>=currSize)
            System.out.println("index out of bounds !!");
        arr[idx]=Integer.MAX_VALUE;
        heapifyUp(idx);
        extractMax();
    }
    public int extractMax(){
        if(currSize==0)
            return -1;
        currSize--;
        int maxEle=arr[0];
        swap(arr,0,currSize);
        heapifyDown(0);
        return maxEle;
    }


    private void heapifyUp(int idx) {
        for(int i=idx;i>0;i=(i-1)/2){
            int parent=(i-1)/2;
            if(arr[parent]<arr[i]) {
                swap(arr, parent, i);
            }
            else break;
        }
    }

    private void heapifyDown(int idx) {
        while (idx<currSize){
            int smallest=idx;
            int leftChild=2*idx+1;
            int rightChild=2*idx+2;
            if(leftChild<currSize && arr[leftChild]>arr[smallest])
            {
                smallest=leftChild;
            }
            if(rightChild<currSize && arr[rightChild]>arr[smallest]){
                smallest=rightChild;
            }
            if(smallest==idx)break;
            else{
                swap(arr,smallest,idx);
                idx=smallest;
            };
        }
    }

    public void insertAll(int []tempArr){
        for (int ele:tempArr)
            insert(ele);
    }

    private void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
