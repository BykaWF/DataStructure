package stack;

import java.util.ArrayList;

public final class DynamicStack<T> {

    private final ArrayList<T> stack;

    public DynamicStack(){
        this.stack = new ArrayList<>();

    }

    public boolean push(T value){
        stack.add(value);
        return true;
    }

    public boolean pop(){
        T popVal = stack.getLast();
        System.out.println(popVal);
        stack.removeLast(); // stack.remove(stack.size() - 1)

        return true;
    }

    public boolean peek(){
        System.out.println(stack.getLast());
        return true;
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}

class TestDynamic{
    public static void main(String[] args) {
        DynamicStack<String> ds = new DynamicStack<>();

        ds.push("5");
        ds.push("15");
        ds.push("25");
        System.out.println(ds.peek());
        System.out.println(ds.pop());
        ds.push("35");
        System.out.println(ds.size());
        System.out.println(ds.isEmpty());
    }
}
