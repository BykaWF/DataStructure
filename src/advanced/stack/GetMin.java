package advanced.stack;

import java.util.ArrayDeque;
import java.util.Deque;

class MyDS{
    Deque<Integer> main = new ArrayDeque<>();
    Deque<Integer> ax = new ArrayDeque<>();

    void push(Integer e){
        main.push(e);

        if(ax.isEmpty()){
            ax.push(e);
        } else if (!main.isEmpty() && ax.peek() >= main.peek()) {
            ax.push(e);
        }

    }
    // O(1)
    void pop(){
        if(main.peek() == ax.peek()){
            ax.pop();
        }

        main.pop();
    }

    int getMin(){
        return !ax.isEmpty() ? ax.peek() : -1;
    }
}
public class GetMin {
    public static void main(String[] args) {
        MyDS ds = new MyDS();

        ds.push(5);
        ds.push(2);
        ds.push(3);
        ds.push(20);

        //3
        //2
        //5

        System.out.println(ds.getMin());
    }


}
