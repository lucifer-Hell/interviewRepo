package basicDSA.Deque;

public interface Deque {
    void insertFront(int ele);
    void insertRear(int ele);
    void removeFront();
    void removeRear();
    int getFront();
    int getRear();
    boolean isEmpty();
}
