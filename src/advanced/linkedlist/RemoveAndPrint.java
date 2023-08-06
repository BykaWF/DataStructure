package advanced.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class MyDS{
   private LinkedList<Integer> list = new LinkedList<>();

    void add(int x){
        list.add(x);
    }

    void removeAndPrint(int x){
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            Integer n =  it.next();
            if(n.equals(x)){
                it.remove();
            }else {
                System.out.print(n + " ");
            }
        }

    }
}

public class RemoveAndPrint {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(2);

        list.stream().filter(x -> x % 2 == 0).findFirst();


    }
}
