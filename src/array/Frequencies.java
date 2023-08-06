package array;

public class Frequencies {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
        freq(arr, arr.length);
    }

    static void freq(int[] arr, int n){
        int temp = arr[n - 1] ;
        int count = 1;

        for (int i = n - 2; i >= 0 ; i--) {
            if(arr[i] != temp){
                System.out.print(count + " ");
                System.out.print(temp + " ");
                temp = arr[i];
                count = 1;
                System.out.println();
            }else {
                count++;
            }
        }

        System.out.print(temp + " ");
        System.out.print(count + " ");
    }
}
/*
              Frequency of 1 is: 3
              Frequency of 2 is: 1
              Frequency of 3 is: 2
              Frequency of 5 is: 2
              Frequency of 8 is: 3
              Frequency of 9 is: 2
              Frequency of 10 is: 1
 */