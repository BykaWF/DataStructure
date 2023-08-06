package advanced.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class KthReverse {
    public static void main(String[] args) {
        Queue<Integer> s = new ArrayDeque<>();

        s.offer(1);
        s.offer(2);
        s.offer(3);
        s.offer(4);
        s.offer(5);

        int k = 3;

        //reverseFirstK(s,k);

        //System.out.println(s);


        s = modifyQueue(s,3);

        System.out.println(s);
    }

    static void reverseFirstK(Queue<Integer> q, int k){
        Deque<Integer> temp = new ArrayDeque<>();
        int i = 0;
        while (i < k){
            temp.push(q.peek());
            q.poll();
            i++;
        }

        while (!temp.isEmpty()){
            q.offer(temp.pop());
        }

        if(!q.isEmpty()){
            int remain = q.size() - k;

            while (q.size() > remain){
                temp.push((q.poll()));
            }

            while (!temp.isEmpty()){
                q.offer(temp.pop());
            }
        }

    }

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Deque<Integer> st = new ArrayDeque<>();

        int i = 0;

        while(i < k){
            st.push(q.poll()); // 1 2 3 <- top
            i++;
        }

        while(!st.isEmpty()){ // empty
            q.offer(st.pop()); // top -> 4 5 3 2 1
        }

        int remaining = q.size() - k; // 2

        if(remaining > 0){

            int j = 0;
            while(j < remaining){
                st.push(q.poll()); //  4 5 <- top
                j++;
            }

            while(!st.isEmpty()){ // 4 5
                q.offer(st.poll()); // 3 2 1 4 5
            }


        }

        return q;
    }


}
