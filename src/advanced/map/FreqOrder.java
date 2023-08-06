package advanced.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreqOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6};
        System.out.println(freqMin(arr));
    }

    static int freqMin(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (Integer x : arr){
            hm.put(x, hm.getOrDefault(x,0) + 1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(e.getValue() == 1){
                count ++;
            }
        }

        if(count == hm.size()){
            return -1;
        }

        int occur = 0;
        int index = 0;
        for(Map.Entry<Integer,Integer> x : hm.entrySet()){
             if(occur < x.getValue()){
                occur = x.getValue();
                index++;
            }
        }


        return index;
    }
}
