package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;

class Points implements Comparable<Points>{
    int x, y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Points o) {
        return this.x - o.x;
    }
}
public class CustomCompareCollections {
    public static void main(String[] args) {
        List<Points> list = new ArrayList<>();
        list.add(new Points(2,4));
        list.add(new Points(6,5));
        list.add(new Points(1,8));
//        Natural order based on X coordinate
        Collections.sort(list);
        for (Points p : list){
            System.out.println(p.x + " " + p.y);
        }
        System.out.println();
//        Sort collection based on attributes ( compareTo objects)
        Collections.sort(list,(o1,o2) -> o1.x - o2.x);
        for (Points p : list){
            System.out.println(p.x + " " + p.y);
        }
    }
}
