package advanced.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class prefixSum {
    public static void main(String[] args) {
        int[] v1 = {3, 4, 2, 2, 4};
        int[] v2 = {3, 2, 2, 7};
        System.out.println(common_element(v1,v2));
    }

    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Creating 3 TreeMaps for storing count
        //of frequencies of different ArrayList
        //and 1 for common elements frequencies
        TreeMap<Integer,Integer> mp1=new TreeMap<>();
        TreeMap<Integer,Integer> mp2=new TreeMap<>();
        TreeMap<Integer,Integer> mp3=new TreeMap<>();

        //incrementing the value if
        //the key already exists in TreeMap
        //else initializing 1 to that key
        for(int i = 0; i < v1.length; i++)
        {
            if(mp1.containsKey(v1[i]))
            {
                mp1.put(v1[i],mp1.get(v1[i])+1);
            }
            else
            {
                mp1.put(v1[i],1);
            }

        }

        //incrementing the value if
        //the key already exists in TreeMap
        //else initializing 1 to that key
        for(int i = 0; i < v2.length; i++)
        {
            if(mp2.containsKey(v2[i]))
            {
                mp2.put(v2[i],mp2.get(v2[i])+1);
            }
            else
            {
                mp2.put(v2[i],1);
            }

        }

        //Iterating map1 and taking out common elements frequencies
        for(Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(mp2.containsKey(key))
            {
                mp3.put(key,Math.min(value,mp2.get(key)));
            }
        }

        //Declaring and Initializing a new ArrayList
        ArrayList<Integer>ans=new ArrayList<>();

        //Adding the common elements the
        //number of times their frequencies
        for(Map.Entry<Integer, Integer> entry : mp3.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            for(int i=0;i<value;i++)
                ans.add(key);

        }

        //returing the sorted common elements
        return ans;


    }
}
