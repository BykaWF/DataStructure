package dequeue;

public class DequeueMy {
    private final int[] dq;
    private final int front;
    private int rear;
    private int cap;
    private int size;

    public DequeueMy(int cap) {
        this.dq = new int[cap];
        this.front = 0;
        this.rear = 0;
        this.cap = cap;
        this.size = 0;
    }

    boolean isFull() {
        return size == cap;
    }

    boolean isEmpty(){
        return size == 0;
    }

    void insertFront(int val) {
        if (front == 0 && rear == 0) {
            dq[front] = val;
            rear++;
            size++;
        } else {
            for (int i = rear; i >= 1; i--) {
                dq[i] = dq[i - 1];
            }
            dq[front] = val;
            size++;
            rear++;
        }
    }

    void insertRear(int val) {
        if(isFull()) return;
        dq[rear] = val;
        rear++;
        size++;
    }

    void deleteFront() {
        for (int i = 0; i < rear; i++) {
            dq[i] = dq[i + 1];
        }
        size--;
        rear--;
    }

    void deleteRear() {
        if(isEmpty()) return;
        dq[rear - 1] = 0;
        size--;
        rear--;
    }

    void getFront() {
        System.out.println("FRONT " + dq[front]);
    }

    void getRear() {
        System.out.println("REAR " + dq[rear - 1]);
    }

    void getSize() {
        System.out.println("SIZE " + size);
    }
}

class Test23 {
    public static void main(String[] args) {
        DequeueMy dequeueMy = new DequeueMy(10);

        dequeueMy.insertFront(1);
        dequeueMy.insertFront(3);
        dequeueMy.insertRear(4);
        dequeueMy.insertFront(5);
        dequeueMy.insertRear(6);

        dequeueMy.getFront();
        ;
        dequeueMy.getRear();
        dequeueMy.getSize();

        dequeueMy.deleteFront();
        dequeueMy.deleteRear();

        dequeueMy.getFront();
        ;
        dequeueMy.getRear();
        dequeueMy.getSize();
    }
}
