package advanced.stack;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Test23 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 43, 1, 2, 0, 5};
        int n = arr.length;

        Stack<Integer> s = _push(arr,n);

        _getMinAtPop(s);
    }

    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            s.push(arr[i]);
        }

        return s;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        Stack<Integer> as = new Stack<>();
        int min = Integer.MAX_VALUE;
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()){
             min = Math.min(min, it.next());
             as.push(min);
        }

        while (!as.isEmpty()){
            int el = as.pop();
            System.out.print(el);
        }
    }
}
