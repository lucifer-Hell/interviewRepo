package basicDSA.Queue;

public interface Queue {
    void enqueue(int ele);
    void dequeue();
    boolean isEmpty();
    int getSize();
    int getFront();
    int getRear();
}
