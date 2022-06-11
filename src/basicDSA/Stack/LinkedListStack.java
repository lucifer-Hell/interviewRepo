package basicDSA.Stack;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListStack implements Stack{
    private LinkedList<Integer> list;

    public LinkedListStack(){
        list=new LinkedList<>();
    }

    @Override
    public int pop() {
        if(list.isEmpty())return -1;
        else return list.removeLast();
    }

    @Override
    public void push(int ele) {
        list.add(ele);
    }

    @Override
    public int peek() {
        if(list.isEmpty())return -1;
        else return list.getLast();
    }
}
