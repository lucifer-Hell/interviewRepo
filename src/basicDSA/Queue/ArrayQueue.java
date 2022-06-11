package basicDSA.Queue;

public class ArrayQueue implements Queue{

    int []arr;
    int front,rear,size;

    public ArrayQueue(int size){
        arr=new int[size];
        front=rear=size=0;
    }

    @Override
    public void enqueue(int ele) {
        if(size==arr.length){
            System.out.println("QUEUE IS FULL !!");
        }
        else{
            arr[rear]=ele;
            size++;
            rear=(rear+1)%arr.length;
        }
    }

    @Override
    public void dequeue() {
        if(size==0){
            System.out.println("QUEUE IS EMPTY");
        }else {
            System.out.println("Removing "+arr[front]+" from queue ");
            front=(front+1)%arr.length;
            size--;
        }
    }

    @Override
    public boolean isEmpty() {
        return (size==0);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getFront() {
        return (this.isEmpty())?-1:arr[front];
    }

    @Override
    public int getRear() {
        int idx=(rear-1>=0)?rear-1:arr.length-rear-1;
        return this.isEmpty()?-1:arr[idx];
    }

}
