package hashing;

public class MyHash {
    int[] table;
    int capacity;
    int size;

    public MyHash(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.table = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            table[i] = -1;
        }
    }

    int hash(int key) {
        return key % capacity;
    }

    boolean insert(int key) {

        if (size == capacity)
            return false;
        int i = hash(key);
        while (table[i] != -1 && table[i] != -2 && table[i] != key)
            i = (i + 1) % capacity;
        if (table[i] == key)
            return false;
        else {
            table[i] = key;
            size++;
            return true;
        }

    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (table[i] != -1) {
            if (table[i] == key)
                return true;
            i = (i + 1) % capacity;
            if (i == h)
                return false;
        }
        return false;
    }

    boolean delete(int key) {
        int h = hash(key);
        int i = h;

        while (table[i] != -1) {

            if (table[i] == key) {
                table[i] = -2;
                return true;
            }
            i = (i + 1) % capacity;

            if (i == h) {
                return false;
            }


        }
        return false;
    }

}

