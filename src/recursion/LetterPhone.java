package recursion;

import java.util.ArrayList;

public class LetterPhone {
    public static void main(String[] args) {
        int[] a = {2,3,4};
        int n = 3;
        ArrayList<String> ass = possibleWords(a,n);
        System.out.println(ass);
    }

    static ArrayList <String> possibleWords(int a[], int N)
    {
        String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> list = new ArrayList<String>();
        helper(a, N,0, list,"",keypad);
        return list;

    }

    public static void helper(int a[], int N, int idx, ArrayList<String> list, String curr, String[] keypad){
        if(idx==N){
            list.add(curr);
            return;
        }
        int key = a[idx];

        for(int i=0;i<keypad[key].length(); i++){
            char ch= keypad[key].charAt(i);
            helper(a,N,idx+1,list,curr+ch,keypad);
        }
    }


}
