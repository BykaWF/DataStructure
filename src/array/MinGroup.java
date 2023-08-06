package array;

public class MinGroup {
    public static void main(String[] args) {
        printMin(new int[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, 10);
    }

    static void printMinGroup(int[] arr, int n){

        int countOne = 0;
        int countZero = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                countOne++;
            }else {
                countZero++;
            }
        }
        int changeTO = 0;

        if(countOne >= countZero){
            changeTO = 1;
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] != changeTO){
                arr[i] = changeTO;
                System.out.println(i);
            }
        }
    }

    static void printMin(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i - 1]){
                if(arr[i] != arr[0]){
                    System.out.print("From " + i + " to ");
                }else {
                    System.out.print(i - 1);
                    System.out.println();
                }
            }
        }

        if(arr[n-1] != arr[0]){
            System.out.print(n-1 + "end");
        }
    }
}
