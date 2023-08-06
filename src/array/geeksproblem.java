package array;

public class geeksproblem {
    public static void main(String[] args) {

        int[] arr = {3,4,1,2};
        checkRotatedAndSorted(arr,arr.length);
    }

    public static void checkRotatedAndSorted(int arr[], int num){
        int max = 0;
        int min = 0;

        for(int i = 1; i< num; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        System.out.println(arr[max] + " " + arr[min]);
    }
}
