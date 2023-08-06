package advanced.deque;

import java.util.ArrayDeque;
import java.util.Objects;

public class MyData <E> {
    ArrayDeque <E> dq = new ArrayDeque<>();

    void insertMin(E e){

        dq.offerFirst(e);
    }

    void insertMax(E e){
        dq.offerLast(e);
    }

    void getMin(){
        System.out.println(dq.peekFirst());
    }

    void getMax(){
        System.out.println(dq.peekLast());
    }

    void extractMin(){
        dq.pollFirst();
    }

    void extractMax(){
        dq.pollLast();
    }
}
