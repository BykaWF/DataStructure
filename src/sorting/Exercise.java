package sorting;

import java.util.Arrays;

// Sort even first / odd second
public class Exercise {
    public static void main(String[] args) {
        Integer[] arr = {2,3,5,6,8,7,4};
        Arrays.sort(arr,(p1,p2) -> p1 % 2 - p2 % 2);

        for(Integer e : arr){
            System.out.print(e + " ");
        }
    }


}
