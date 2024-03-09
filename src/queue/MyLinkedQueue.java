package queue;

import static java.util.Arrays.stream;

class NodeForQ {
    NodeForQ next;

    int val;

    public NodeForQ(int val){
        this.next = null;
        this.val = val;
    }

}
public class MyLinkedQueue {

    NodeForQ front;
    NodeForQ rear;
    int size;

    public MyLinkedQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    void enqueue(int val){
        NodeForQ temp = new NodeForQ(val);

        if(front == null){
            front = rear = temp;
            return;
        }else{
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

     void dequeue(){
        if(front == null){
            return;
        }

        front = front.next;

        if(front == null) {
            rear = null;
        }

        size--;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    void print(){
        NodeForQ current = front;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

}

class TestLinkedQueue{
    public static void main(String[] args) {
        MyLinkedQueue queue = new MyLinkedQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);


        queue.print();
    }
}
