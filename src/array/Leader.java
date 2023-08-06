package array;

public class Leader {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        getLeader(arr);
        leader(arr);
    }

    static void getLeader(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println(arr[i]);
        }
    }

    static void leader(int[] arr){
        int n = arr.length;
        int currLeader = arr[n - 1];
        System.out.println(currLeader);

        for (int i = n - 2; i >= 0; i--){
            if(currLeader < arr[i]){
                currLeader = arr[i];
                System.out.println(currLeader);
            }
        }
    }
}
