package advanced.comaprator;

import java.util.Arrays;

public class Pairs {
    static class Pair implements Comparable{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }



        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Pair[] ob = new Pair[2];

        ob[0] = new Pair(2,2);
        ob[1] = new Pair(1,3);

        Arrays.sort(ob);

        for(Pair pairs : ob){
            System.out.println(pairs.x);
        }

    }
}
