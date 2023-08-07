package serching;

public class CountOccur {
    public static void main(String[] args) {
        int[] arr ={ 10, 20,20,20,40,40};

        System.out.println(countOccur(arr, arr.length, 20));
    }

    static int countOccur(int[] arr,int n, int x){
        int first = firstOccur.firstOccurElement2(arr,x);

        if(first == -1){
            return 0;
        }else {
            return (LastOccur.lastOccur2(arr,n,x) - first + 1);
        }

    }
}
