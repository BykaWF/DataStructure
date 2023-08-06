package array;

public class MissNumber {
    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,-20};
        int size = arr.length;

        int ans = missingNumber(arr,size);

        System.out.println(ans);
    }

    static int missingNumber(int arr[], int size)
    {
        int missingNumber = 1;

        for(int i = 0; i < size; i ++){
            if(arr[i] <= 0){
                continue;
            }

            if(arr[i] > 0 && arr[i] == missingNumber){
                missingNumber++;
            }else{
                return missingNumber;
            }

        }

        return missingNumber;
    }
}
