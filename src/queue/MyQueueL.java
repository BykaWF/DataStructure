package queue;

class Node{
    NodeForQ next;

    int element;

    public Node(int element) {

        this.element = element;
    }
}
public class MyQueueL {
    NodeForQ head;
    NodeForQ tail;
    int size;

    public MyQueueL(){
        size = 0;
        this.head = null;
        this.tail = null;
    }

    void enqueue(int val ){
        NodeForQ temp = new NodeForQ(val);

        if(head == null){
          head = temp;
          tail = head;
          head.next = null;
        }else {
            tail.next = temp;
            tail.next.next = null;
        }
    }

    @Override
    public String toString() {
        return "MyQueueL{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}

class MyQueueTest{
    public static void main(String[] args) {
        MyQueueL queue = new MyQueueL();

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

    }
}
