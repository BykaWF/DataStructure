package advanced.Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Single {
    public static void main(String[] args) {
        List first = new ArrayList<>();

        first.add(1);
        first.add(2);
        System.out.println(first.containsAll(Collections.singleton(new ArrayList<>().add(1))));

    }

}
