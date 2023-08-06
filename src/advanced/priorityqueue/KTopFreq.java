package advanced.priorityqueue;

import java.util.*;
class MyCmp implements Comparator<Map.Entry<Integer,Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if(m1.getValue() == m2.getValue()){
            return m1.getKey() - m2.getKey();
        }else {
            return m2.getValue() - m1.getValue();
        }
    }
}
public class KTopFreq {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4 , 4, 5, 2, 6, 1};
        //kthFrq2(arr,2);

        kthFrq(arr,2);


    }

    static void kthFrq(int[] arr, int k ){
        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        List<List<Integer>> freq = new ArrayList<>();
        for (int i = 0; i <= arr.length; i++) {
            freq.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> x : m.entrySet()){
            freq.get(x.getValue()).add(x.getKey());
        }

        for (int i = 0; i < arr.length; i++) {
            int f = m.get(arr[i]);
            if (f != -1){
                freq.get(f).add(arr[i]);
                m.put(arr[i], -1);
            }
        }

        int count = 0;
        int n = arr.length;;
        for (int i = n; i >= 0 ; i--) {
            for(int x : freq.get(i)){
                System.out.print(x + " ");
                count++;
                if(count == k) return;
            }
        }

    }
    static void kthFrq2(int[] arr, int k ){
        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<arr.length; i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(new MyCmp());

        pq.addAll(m.entrySet());

        for (int i = 0; i < k; i++){
            System.out.println(pq.poll().getKey());
        }
    }

}
