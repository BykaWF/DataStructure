package array;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[]arr = {10,20,20,30,30,30,30};
        int a = removeDup(arr,arr.length);

        System.out.println(a);
    }

    static int removeDup(int[] arr,int size){


        for (int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i -1]){
                size--;
            }
        }

        return size;
    }
}
