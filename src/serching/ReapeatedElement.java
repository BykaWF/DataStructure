package serching;

import java.util.Objects;

public class ReapeatedElement {
    static class Pair{
        long x;
        long y;

        Pair(long x, long y){
            this.x = x;
            this.y = y;
        }
        public static Pair findRepeating(Long arr[],int n)
        {
            Long slow = arr[0];
            Long fast = arr[0];

            do{
                slow = arr[Math.toIntExact(arr[Math.toIntExact(slow)])];
                fast = arr[Math.toIntExact(arr[Math.toIntExact(arr[Math.toIntExact(fast)])])];
            }while(!Objects.equals(slow, fast));

            slow = arr[0];
            while(!Objects.equals(slow, fast)){
                slow = arr[Math.toIntExact(slow)];
                fast = arr[Math.toIntExact(fast)];
            }

            if(Objects.equals(slow, fast)){
                return new Pair(arr[Math.toIntExact(slow)], n - (arr[n - 1] - arr[0] + 1));
            }else{
                return new Pair(-1,-1);
            }
        }
    }

    public static void main(String[] args) {
    }


}
