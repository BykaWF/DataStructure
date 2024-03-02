package stack;

public class TwoStack {
    private int[] arr;
    private int cap;
    private int size;
    private int size2;
    private int idxOf2;

    public TwoStack(int capacity){
        this.arr = new int[capacity];
        this.cap = capacity;
        this.size = 0;
        this.size2 = 0;
        this.idxOf2 = capacity/2;
    }
    // divide array on two part
    boolean push1(int x){
        if(size < cap/2){
            arr[size] = x;
            size++;
            return true;
        }
        return false;
    }

    boolean push2(int x){
        if(idxOf2 < cap) {
            arr[idxOf2] = x;
            size2++;
            idxOf2++;

            return true;
        }
        return true;
    }

    int pop1(){
        int temp = arr[size];

        arr[size] = 0;
        size--;

        return temp;
    }

    int pop2(){
        int temp = arr[idxOf2];

        arr[idxOf2] = 0;
        size2--;
        idxOf2--;

        return temp;
    }

    int size(){
        return size;
    }

    int size2(){
        return size2;
    }
}

class TestTwo{
    public static void main(String[] args) {
        TwoStack stack = new TwoStack(10);

        stack.push1(5);
        stack.push1(7);
        stack.push2(10);
        stack.push2(12);

        System.out.println(stack.size());
        System.out.println(stack.size2());

    }
}
