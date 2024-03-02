package hashing;

import java.util.Arrays;

public class MyDSH {
    int[] key;
    public MyDSH(){
        this.key = new int[1000];
    }

    public void insert(int val){
        key[val] = val;
    }

    public boolean search(int val){
        return key[val] == val;
    }

    public void delete(int val){
        key[val] = 0;
    }

}

class TestMyDSH{
    public static void main(String[] args) {
        MyDSH ds = new MyDSH();

        ds.insert(10);
        ds.insert(20);
        ds.insert(119);
        System.out.println(ds.search(10));
        System.out.println(ds.search(20));
        ds.delete(119);
        System.out.println(ds.search(119));
    }
}
