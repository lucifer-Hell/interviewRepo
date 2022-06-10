package basicDSA.Stack;

public class ArrayStack implements Stack{

    private int []arr;
    private int idx;

    public ArrayStack(int size){
        arr=new int[size];
        idx=-1;
    }

    @Override
    public int pop() {
        if(idx==-1){
            System.out.println("Stack is Empty");
            return -1;
        }else return arr[idx--];
    }

    @Override
    public void push(int ele) {
        if((idx+1)==arr.length){
            System.out.println("Cannot add new element stack is full !");
        }
        else arr[++idx]=ele;
    }

    @Override
    public int peek() {
        if(idx==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        else return arr[idx];
    }
}
