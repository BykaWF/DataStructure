package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ChainingDS {
    ArrayList<LinkedList<Integer>> table;
    int BUCKET = 7;

    public ChainingDS() {

        this.table = new ArrayList<>();

        for (int i = 0; i < BUCKET; i++) {
            table.add(new LinkedList<>());
        }
    }

    public int hashCode(int key) {
        return key % BUCKET;
    }

    public void insert(int key) {
        int hash = hashCode(key);
        table.get(hash).add(key);
    }

    public boolean search(int key) {
        int hash = hashCode(key);
        return table.get(hash).contains(key);
    }

    public void delete(int key) throws Exception {
        int hash = hashCode(key);
        if (table.get(hash) == null) {
            throw new Exception("Not Found");
        } else {
            table.get(hash).remove((Integer) key);
        }
    }
}

class TestMyDS {
    public static void main(String[] args) throws Exception {
        ChainingDS chainingDS = new ChainingDS();
        chainingDS.insert(70);
        chainingDS.insert(56);
        System.out.println(chainingDS.search(56));
        chainingDS.delete(70);
        System.out.println(chainingDS.search(56));
    }
}
