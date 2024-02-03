package hashing;

import java.util.Arrays;

public class hashTest {
    public static void main(String[] args) {
        int hashSize = 11;
        int N = 4;
        int[] arr = {21,10,32,43};
        int[] hash = new int[hashSize];

        Arrays.fill(hash, -1);

        quadraticProbing(hash,hashSize,arr,N);

        System.out.println(Arrays.toString(hash));
    }

    static int size = 0;
    static int i = 1;
    static void quadraticProbing(int[] hash, int hash_size, int[] arr, int N)
    {

        for(int i = 0; i < N; i++){
            insert(arr[i],hash,hash_size);
        }

    }

    static void insert(int key, int[] hash, int hashSize){
        if(size >= hashSize) return;

        int idx = key % hashSize;

        if(hash[idx] == -1){
            hash[idx] = key;
            size++;
            return;
        }

        while(hash[idx] != -1 && hash[idx] != key){
            idx = (idx + (i * i)) % hashSize;
            i++;
        }

        if(hash[idx] == key){
            return;
        }else{
            hash[idx] = key;
            size++;
        }
    }
}
