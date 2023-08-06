package advanced.map;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    private Map<Integer,Integer> mp;


    public ATM() {
        mp = new HashMap<>();
    }

    public void set(Integer key, Integer value){
        mp.put(key,value);
    }

    public void get(Integer key){
        System.out.println(mp.get(key));
    }
}
