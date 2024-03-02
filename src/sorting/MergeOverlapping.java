package sorting;

import advanced.comaprator.Pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Pair{
    int start;
    int end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class MergeOverlapping {
    public static void main(String[] args) {
        Pair[] p = {new Pair(1,3), new Pair(2,4), new Pair(5,7), new Pair(6,8)};
        Arrays.sort(p,(o1, o2) -> o1.start - o2.start);
        System.out.println(Arrays.toString(p));
    }


}
