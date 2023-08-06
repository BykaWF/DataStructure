package array;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {8, 8, 6, 6, 6, 4, 6};
        System.out.println( majority(arr,arr.length));
    }

    static int printMajorityEl(int[] arr, int n){


        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;

                }
                if (count > n / 2) {
                    return arr[i];
                }
            }
        }
       return -1;
    }

    static int majority(int[] arr, int n){
        int res = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if(arr[res] == arr[i]){
                count++;
            }else {
                count--;
            }

            if(count == 0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int j = 0; j < n; j++) {
            if(arr[res] == arr[j]){
                count++;
            }
        }

        if(count <= n/2){
           return -1;
        }

        return arr[res];
    }
}
