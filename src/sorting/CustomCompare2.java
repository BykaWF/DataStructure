package sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyCmp implements Comparator<Point>{

    @Override
    public int compare(Point o1, Point o2) {
        return o1.x - o2.x;
    }
}

public class CustomCompare2 {
    public static void main(String[] args) {
        Point[] arr = {new Point(10,20), new Point(3,12), new Point(5,7)};
        Arrays.sort(arr,(p1,p2) -> p1.x - p2.x);
        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
