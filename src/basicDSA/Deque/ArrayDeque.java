package basicDSA.Deque;

public class ArrayDeque implements Deque {

    int []arr;
    int front,rear,size;
    public ArrayDeque(int size){
        arr=new int[size];
        this.size=0;
        front=0;
        rear=arr.length-1;
    }
    @Override
    public void insertFront(int ele) {
        if(size==arr.length) {
            System.out.println("Deque is full");
            return;
        }
        System.out.println("Inserting "+ele+" at "+front);
        arr[front]=ele;
        front=(front+1)%arr.length;
        size++;
    }

    @Override
    public void insertRear(int ele) {

        if(size==arr.length){
            System.out.println("Deque is Full");
            return;
        }
        System.out.println("Inserting "+ele+" at "+rear);
        arr[rear]=ele;
        rear=(rear-1>=0)?rear-1:arr.length-1;
        size++;
    }

    @Override
    public void removeFront() {
        if(size==0){
            System.out.println("Deque is Empty");
            return;
        }
        front=(front-1>=0)?front-1:arr.length-1;
        size--;
    }

    @Override
    public void removeRear() {
        if(size==0){
            System.out.println("Deque is Empty");
            return;
        }
        rear=(rear+1)%arr.length;
        size--;
    }

    @Override
    public int getFront() {
        int idx=front-1>=0?front-1:arr.length-1;
        return (size==0)?-1: arr[idx];
    }

    @Override
    public int getRear() {
        int idx=(rear+1)%arr.length;
        return size==0?-1: arr[idx];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
