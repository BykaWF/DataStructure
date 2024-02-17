package dequeue;

public class CircularDequeue {
    private int[] dq;
    private int front;
    private int size;
    private int cap;

    public CircularDequeue(int capacity) {
        this.dq = new int[capacity];
        this.front = 0;
        this.size = 0;
        this.cap = capacity;
    }

    boolean isFull() {
        return size == cap;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void insertFront(int x) {
        if (isFull()) return;

        front = (front - 1 + cap) % cap;
        dq[front] = x;
        size++;
    }

    void insertRear(int x) {
        if(isFull()) return;

        int rear = ((front + size - 1) % cap) + 1; // +1 gives us new_rear
        dq[rear] = x;
        size++;
    }

    void deleteFront() {
        if(isEmpty()) return;
        front = (front + 1) % cap;
        size--;
    }

    void deleteRear() {
        if(isEmpty()) return;
        size--;
    }

    int getRear(){
        if(isEmpty()) return -1;
        return (front + size - 1) % cap;
    }

    int getFront(){
        if(isEmpty()) return -1;
        return front;
    }
}
