package stack;

public class MyStack {
    private final int[] stack;
    private int size;
    private int top;


    public MyStack(int capacity){
        this.size = 0;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public boolean push(int value){
        if(size < stack.length){
            top++;
            stack[top] = value;
            size++;
            return true;
        }

        return false;
    }

    public boolean pop(){
        if(size > 0){
            int poppedValue = stack[top];
            stack[top] = 0;
            top--;
            size--;
            System.out.println(poppedValue);
            return true;
        }

        return false;
    }

    boolean peek(){
        if(size > 0){
            System.out.println(stack[top]);
            return true;
        }

        return true;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


}

class Test{
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);

        stack.push(5);
        stack.push(15);
        stack.push(25);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(35);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }
}
