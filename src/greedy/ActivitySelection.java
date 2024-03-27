package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Pair {
    int start;
    int end;

    public Pair(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "( " + start + ", "+
                 end + " )";
    }


}

class MyComparator implements Comparator<Pair>{

    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.end - o2.end;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 2, 5};
        int[] end = {2, 4, 3, 6};
        int N = 4;

        System.out.println(activitySelection(start, end, N));

    }
    public static int activitySelection(int[] start, int[] end, int n)
    {
        int res = 1;

        Pair[] list = new Pair[n];

        for(int i = 0; i < n; i++){
            list[i] = new Pair(start[i], end[i]);
        }

        Arrays.sort(list,new MyComparator());

        System.out.println(Arrays.toString(list));

        // overlap moment

        int prev = 0;
        for (int curr = 1; curr < n; curr++){

            if(list[curr].start >= list[prev].end){
                res++;
                prev = curr;
            }
        }


        return res;
    }
}
