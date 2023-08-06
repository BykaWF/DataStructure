package advanced.Lamda;

import java.util.*;

public class ArrayList1 {
    public ArrayList1() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(4);
        list.add(1);
        list.add(2);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }

}
