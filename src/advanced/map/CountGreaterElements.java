package advanced.map;

import java.util.*;

public class CountGreaterElements {
    public static void main(String[] args) {
        int[] arr = {2,8,10,5,8};
        System.out.println(countGreaterElement(arr));
    }

    static ArrayList<Integer> countGreaterElement(int[] arr){
        TreeMap<Integer,Integer> m = new TreeMap<>(Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer x : arr){
            m.put(x, m.getOrDefault(x,0) + 1);
        }

        int frq = 0;
        for (Map.Entry<Integer,Integer> e : m.entrySet()){
            int temp = e.getValue();
            m.put(e.getKey(), frq);

            frq += temp;
        }

        for (Integer x : arr){
            list.add(m.get(x));
        }


        return list;
    }
}
