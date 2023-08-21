package sorting;

import java.util.Arrays;

class Point implements Comparable<Point>{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        return this.x - o.x;
    }
}
public class CustomCompare {
    public static void main(String[] args) {
        Point[] arr = {new Point(10,20), new Point(1,2), new Point(4,6)};
        Arrays.sort(arr);
        for (Point point : arr) {
            System.out.println(point.y + " ");
        }
    }
}
