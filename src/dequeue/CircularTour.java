package dequeue;

import java.util.ArrayDeque;

public class CircularTour {

    public static void main(String[] args) {
        int[] patrol = {4, 8, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(findCircularTour2(patrol, distance));
    }

    private static int findCircularTour(int[] patrol, int[] distance) {

        for (int start = 0; start < patrol.length; start++) {
            int currPatrol = 0;
            int end = start;
            while (true) {

                currPatrol += patrol[end] - distance[end];

                if (currPatrol < 0) {
                    break;
                }

                end = (end + 1) % patrol.length;

                if (end == start) {
                    return start + 1;
                }
            }
        }

        return -1;
    }

    private static int findCircularTour2(int[] patrol, int[] distance) {
        int start = 0;
        int prev_patrol = 0; // store previous result to co
        int curr_patrol = 0;

        for (int i = 0; i < patrol.length; i++) {
            curr_patrol += patrol[i] - distance[i];

            if (curr_patrol < 0) {
                start = start + 1;
                prev_patrol += curr_patrol;
                curr_patrol = 0;
            }
        }

        return ((curr_patrol + prev_patrol) >= 0) ? start + 1 : -1;
    }
}
