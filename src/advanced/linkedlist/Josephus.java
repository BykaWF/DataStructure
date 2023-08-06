package advanced.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Josephus {
    public static void main(String[] args) {

        LinkedList<Integer> a = jos(7,3);
        System.out.println(a);
    }

    public static LinkedList<Integer> jos(int n, int k){
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        while (list.size() > 1){
            int i = 0;

            while (i < k){
                while (it.hasNext() && i < k){
                    it.next();
                    i++;
                }
                if(i < k){
                    it = list.iterator();
                    it.next();
                    i++;
                }
            }
            it.remove();
        }


        return list;
    }
}
