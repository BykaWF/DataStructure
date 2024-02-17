package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QStack<E> {

    ArrayDeque<E> queue;
    E element;

    public QStack(){
        this.queue = new ArrayDeque<>();
    }

    void push(E e){
        queue.addLast(e);
    }

    E pop(){
        return queue.pollLast();
    }

    E peek(){
        return queue.peekLast();
    }

}
class TestQStack{
    public static void main(String[] args) {
        QStack<Integer> stack = new QStack<>();

        stack.push(12);
        stack.push(22);
        stack.push(33);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());


    }
}