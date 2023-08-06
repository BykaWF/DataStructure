package advanced.map;

import java.util.*;

public class MyDS2 {
    TreeMap<Integer, List<String>> t;

    public MyDS2(){
        t = new TreeMap<>();
    }

    void add(Integer price, String str){
        if(t.get(price) == null){
            t.put(price,new ArrayList<>());
        }

        t.get(price).add(str);
    }

    List<String> find(Integer price){
        return t.get(price);
    }

    void printGreatestSorted(Integer price){
        SortedMap<Integer,List<String>> g = t.tailMap(price);

        for (Map.Entry<Integer,List<String>> e : g.entrySet()){
            int p = e.getKey();
            for (String s : e.getValue()){
                System.out.println(s + " " + p);
            }
        }
    }
    void printLowestSorted(Integer price){
        SortedMap<Integer,List<String>> g = t.headMap(price);

        for (Map.Entry<Integer,List<String>> e : g.entrySet()){
            int p = e.getKey();
            for (String s : e.getValue()){
                System.out.println(s + " " + p);
            }
        }
    }

}
