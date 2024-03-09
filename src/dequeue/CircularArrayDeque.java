package dequeue;

public class CircularArrayDeque {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularArrayDeque(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void addFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add more elements.");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front = (front - 1) % capacity;
        }

        array[front] = item;
        size++;
    }

    public void addRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add more elements.");
            return;
        }

        if (rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        array[rear] = item;
        size++;
    }

    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove elements.");
            return -1;
        }

        int removedItem = array[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return removedItem;
    }

    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove elements.");
            return -1;
        }

        int removedItem = array[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear = (rear - 1) % capacity;
        }
        size--;
        return removedItem;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }
        return array[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }
        return array[rear];
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        int i = front;
        while (i != rear) {
            System.out.print(array[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println(array[rear]);
    }

    public static void main(String[] args) {
        CircularArrayDeque deque = new CircularArrayDeque(5);
        deque.addFront(1);
        deque.addRear(2);
        deque.addFront(3);
        deque.addRear(4);

        deque.display(); // Output: 3 1 2 4
    }
}
