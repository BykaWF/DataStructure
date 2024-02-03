package queue;

public class MyQueue {

    int[] queue;
    int size;
    int front;
    int rear;
    int CAPACITY;

    public MyQueue(int capacity){
        this.CAPACITY = capacity;
        this.queue = new int[CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    void enqueue(int val){
        if(size < CAPACITY){
            queue[rear] = val;
            rear = (rear + 1) % CAPACITY;
            size++;
        }else{
            System.out.println("Queue is full");
        }
    }

    void dequeue(){
        if(size != 0){
            queue[front] = 0;
            front = (front + 1) % CAPACITY;
            size--;
        }else{
            System.out.println("Queue is empty");
        }
    }
}
class TestQueue{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();

        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(15);
        queue.enqueue(14);
        queue.dequeue();
    }
}
