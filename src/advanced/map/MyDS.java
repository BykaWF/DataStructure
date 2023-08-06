package advanced.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyDS {
    TreeMap<Integer,String> t;

    public MyDS(){
        t = new TreeMap<>();
    }

    void add(Integer price, String item){
        t.put(price,item);
    }

    void printSorted(){
        for(Map.Entry<Integer,String > x : t.entrySet()){
            System.out.println("Item: " + x.getValue() + " has cost: " + x.getKey());
        }
    }

    void printGreatestSorted(Integer price){
        SortedMap<Integer,String> g = t.tailMap(price);
        for(Map.Entry<Integer,String > e : g.entrySet()){
            System.out.println("Item: " + e.getValue() + " has cost: " + e.getKey());
        }
    }

    void printLowestSorted(Integer price){
        SortedMap<Integer,String> g = t.headMap(price);
        for(Map.Entry<Integer,String > e : g.entrySet()){
                System.out.println("Item: " + e.getValue() + " has cost: " + e.getKey());
        }
    }

    String find(Integer price){
        String res = t.get(price);

        if(res == null){
            return "Not Found";
        }

        return res;
    }
}
