package advanced.set;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();

        ts.add(1);
        ts.add(2);

        System.out.println(ts.contains(new Float(1.0)));
    }
}
