package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QStackTwo<E> {

    private final Queue<E> queue;
    private final Queue<E> queue2;

    public QStackTwo(){
        this.queue = new ArrayDeque<>();
        this.queue2 = new ArrayDeque<>();
    }

    void push(E e){
       if(queue2.isEmpty()){
           queue.offer(e);
       }else {
           queue2.offer(e);
       }
    }

    E pop(){
        if(queue2.isEmpty()){
            while(!queue.isEmpty() && queue.size() != 1){
                queue2.offer(queue.poll());
            }
            return queue.poll();
        }else {
            while (!queue2.isEmpty() && queue2.size() != 1){
                queue.offer(queue2.poll());
            }
            return queue2.poll();
        }
    }

    E peek(){
        if(queue2.isEmpty()){
            while(!queue.isEmpty() && queue.size() != 1){
                queue2.offer(queue.poll());
            }
            E temp = queue.peek();
            queue2.offer(queue.poll());
            return temp;

        }else {
            while(!queue2.isEmpty() && queue2.size() != 1){
                queue.offer(queue2.poll());
            }
            E temp = queue2.peek();
            queue.offer(queue2.poll());
            return temp;
        }
    }

}

class QStackTwoTest{
    public static void main(String[] args) {
        QStackTwo<Integer> q = new QStackTwo<>();

        q.push(12);
        q.push(14);
        q.push(15);
        q.push(116);

        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());

    }
}
