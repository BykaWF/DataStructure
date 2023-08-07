package serching;

public class CountOccur {
    public static void main(String[] args) {
        int[] arr ={ 0,0,1,1,1};

        System.out.println(countOccur(arr, arr.length, 1));
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
