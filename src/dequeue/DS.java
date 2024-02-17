package dequeue;

public class DS {
    private final int[] dq;
    private int front;
    private int size;
    private int capacity;

    public DS(int capacity){
        this.dq = new int[capacity];
        this.front = 0;
        this.size = 0;
        this.capacity = capacity;
    }

    void insertMax(int val){
        front = (front - 1 + capacity ) % capacity;
        dq[front] = val;
        size++;
    }

    void insertMin(int val){
        int rear = (front + size) % capacity;
        dq[rear] = val;
        size++;
    }

    void getMin(){
        int min = (front + size - 1) % capacity;
        System.out.println("MIN: " + dq[min]);
    }

    void getMax(){
        System.out.println("MAX: " + dq[front]);
    }
}

class TestMyDs{
    public static void main(String[] args) {
        DS ds = new DS(10);

        ds.insertMax(10);
        ds.insertMin(2);

        ds.getMin();
        ds.getMax();
    }
}
