package advanced.Lamda;

import java.util.*;

public class QuizChecker {

    static void printElement(int x ){
        System.out.println(x);
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(2);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(list);
        arr.add(list2);
        arr.add(list3);

        int as = minimum_vertical_sum(arr);
        System.out.println(as);
    }

    /*
           2 4 2
           2 4 2
           2 2
     */

    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {
        //Your code here
        int minSum = Integer.MAX_VALUE;
        int maxList = 0;

        // getting max ArrayList size from the given arrayList
        for(int i=0; i<arr.size(); i++){
            maxList = Math.max(arr.get(i).size(), maxList);
        }

        for(int col = 0; col <maxList; col++){
            int sum = 0;
            for(int row = 0; row <arr.size(); row++){
                if(col < arr.get(row).size()){
                    sum += arr.get(row).get(col);

                }
            }
            // update minSum after every column iteration
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }

    //Back-end complete function Template for Java

    public static int minimum_vertical_sum1(ArrayList<ArrayList<Integer>> arr)
    {
        int n;
        n=arr.size();
        int i,j;

        //taking a variable ans and assigning it the Maximum Integer value
        int ans=Integer.MAX_VALUE;

        //Iterating through all possible columns
        for(i=0;i<1001;i++)
        {
            int sum=0;
            //Itaerating through each row
            for(j=0;j<n;j++)
            {
                if(arr.get(j).size()>i)
                {
                    //Taking sum of each row of same column
                    sum+=arr.get(j).get(i);
                }
            }

            //If sum is less than ans and not 0 then assigning it to the ans variable
            if(sum>0)
            {
                ans=Math.min(ans,sum);
            }
        }

        //returing the minimum column sum
        return ans;


    }
}
