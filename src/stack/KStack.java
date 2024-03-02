package stack;
record Student(String name,int age){

}
public class KStack {
    int [] stack;
    int[] capArr;
    int[] top;

    int cap;
    int k;

    public KStack(int cap, int k){
        this.cap = cap;
        this.k = k;

        this.stack = new int[cap];// stack
        this.top = new int[k]; // can store top of each stack

        int count = 0;
        for (int i = 0; i < cap; i = i + (cap / k)) {
            if (count < k) {
                top[count] = i - 1;
                count++;
            } else {
                break;
            }
        }


    }

    boolean push(int st, int x){

        if(top[st] < cap){
            top[st]++;
            stack[top[st]] = x;
            return true;
        }

        return false;
    }

    int pop(int st){
        int element = stack[top[st]];

        stack[top[st]] = 0;
        top[st]--;

        return element;
    }

    boolean isEmpty(int st){
        return top[st] == 0;
    }


}
class KTest{
    public static void main(String[] args) {
        KStack stack = new KStack(12,3);

        stack.push(0,2);
        stack.push(0,3);

        stack.push(1,1);
        stack.push(1,9);

        stack.push(2,9);
        stack.push(2,1);


        System.out.println(stack.pop(0));
        System.out.println(stack.pop(1));
        System.out.println(stack.pop(2));

        System.out.println(stack.isEmpty(1));
    }
}