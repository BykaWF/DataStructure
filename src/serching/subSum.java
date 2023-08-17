package serching;

import java.util.ArrayList;

public class subSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};

        ArrayList<Integer> list = subarraySum(arr,arr.length,12);
        System.out.println(list);

        System.out.println(9 /2);

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int first = 0;
        int curr = arr[0];

        for(int i = 1; i < n; i++){
            curr += arr[i];
            if(curr > s){
                curr = curr + arr[i] - arr[first];
                first++;
            }
            if(curr == s) {
                list.add(first + 1);
                list.add(i + 1);
                return list;
            }
        }
        list.add(-1);
        list.add(-1);

        return list;
    }
}
